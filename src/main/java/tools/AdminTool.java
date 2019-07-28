package tools;

import publications.Publication;
import idgeneration.IDFactory;
import idgeneration.SimpleIDGenerator;

public class AdminTool extends BibTool {

   public void add(Publication publ) {
	  IDFactory.setIDGenerator(new SimpleIDGenerator());
      publ.setId(IDFactory.getInstance().newID(publ));
      this.getBibliography().add(publ);
   }

   public void remove(String id) {
      this.getBibliography().remove(id);
   }

}
