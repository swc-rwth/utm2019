package tools;

import core.Bibliography;
import browsing.BibIterator;

public class BibTool {

   protected Bibliography bibliography = new Bibliography();
   protected BibIterator bibIter;

   public Bibliography getBibliography() {
      return bibliography;
   }

   public void setBibliography(Bibliography theBibliography) {
      bibliography = theBibliography;

   }

   public Boolean search(String cr) {
      return this.getBibliography().search(cr);
   }

   public String export() {
      return this.getBibliography().export();
   }

   public void startBrowsingByAuthor() {
      bibIter = bibliography.getAuthorIterator();
      bibIter.first();
   }
   
   public void startBrowsingByYear() {
      bibIter = bibliography.getYearIterator();
      bibIter.first();
   }

   public String nextPublication() {
      if (!bibIter.isDone()) {
         bibIter.first();
         return bibIter.next();
      } else {
         return bibIter.next();
      }
   }

}