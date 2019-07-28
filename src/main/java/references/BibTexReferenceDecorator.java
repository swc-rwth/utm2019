package references;

import publications.Book;
import publications.Publication;

public class BibTexReferenceDecorator extends ReferenceDecorator {

	public BibTexReferenceDecorator(Publication publ) {
		super(publ);
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + this.generateBibTexFormat();
	}

	private String generateBibTexFormat() {
		StringBuilder format = new StringBuilder();
		if (this.getDecoratedPublication() instanceof Book) {
			format.append("@book");
			Book b = (Book) this.getDecoratedPublication();

			format.append("{");
			format.append(getId()).append(",");
			format.append("title = {").append(this.getTitle()).append("},");
			format.append("year = {").append(this.getYear()).append("},");
			format.append("isdn = {").append(b.getIsbn()).append("}");
			format.append("}");
		} else {
			format.append("BibText Format not implemented yet");
		}
		return format.toString();
	}
}
