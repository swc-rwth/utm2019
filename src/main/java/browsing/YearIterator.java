package browsing;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import publications.Publication;

public class YearIterator extends BibIterator {
   

   public YearIterator(LinkedList<Publication> publs) {
      Comparator<Publication> comp = new YearComparator();
      this.setPublications(publs);
      Collections.sort(publications, comp);
      iter = publications.listIterator();
   }

}