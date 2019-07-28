package references;

import java.util.LinkedList;
import java.util.ListIterator;

import publications.Publication;

public abstract class ReferenceDecorator extends Publication {

	private Publication decoratedPublication;

	public ReferenceDecorator(Publication publ) {
		super("");
		this.decoratedPublication = publ;
	}

	protected Publication getDecoratedPublication() {
		return decoratedPublication;
	}

	protected void setDecoratedPublication(Publication decoratedPublication) {
		this.decoratedPublication = decoratedPublication;
	}

	public String getYear() {
		return this.decoratedPublication.getYear();
	}

	public void setYear(String theYear) {
		this.decoratedPublication.setYear(theYear);
	}

	public String getTitle() {
		return this.decoratedPublication.getTitle();
	}

	public void setTitle(String theTitle) {
		this.decoratedPublication.setTitle(theTitle);
	}

	public String getId() {
		return this.decoratedPublication.getId();
	}

	public void setId(String theID) {
		this.decoratedPublication.setId(theID);
	}

	public void addAuthor(String a) {
		this.decoratedPublication.addAuthor(a);
	}

	public LinkedList<String> getAuthors() {
		return this.decoratedPublication.getAuthors();
	}

	public Boolean containsString(String substr) {
		return this.decoratedPublication.containsString(substr);
	}
	
	@Override
	public String toString() {
	      String authStr = "";
	      ListIterator<String> iter = decoratedPublication.getAuthors().listIterator();
	      if (!iter.hasNext()) {
	         authStr = "* no authors *";
	      } else {
	         authStr = iter.next();
	         while (iter.hasNext()) {
	            authStr = authStr + "; " + iter.next();
	         }
	      }
	      return ("[" + this.getDecoratedPublication().getId() + "] " + authStr + " (" + this.getDecoratedPublication().getYear() + "): " + this.getDecoratedPublication().getTitle());
	   }

}
