package browsing;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import publications.Publication;

public class AuthorIterator extends BibIterator {
   

   public AuthorIterator(LinkedList<Publication> publs) {
      Comparator<Publication> comp = new AuthorComparator();
      this.setPublications(publs);
      Collections.sort(publications, comp);
      iter = publications.listIterator();
   }

}