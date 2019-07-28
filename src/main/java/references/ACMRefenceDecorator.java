package references;

import publications.Publication;

public class ACMRefenceDecorator extends ReferenceDecorator {

	public ACMRefenceDecorator(Publication publ) {
		super(publ);
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" + "ACM Format";
	}
	

}
