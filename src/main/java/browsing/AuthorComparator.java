package browsing;

import java.util.Comparator;

import publications.Publication;

public class AuthorComparator implements Comparator<Publication>{
   
   @Override
   public int compare(Publication p1, Publication p2) {
      return p1.getAuthors().getFirst().compareTo(p2.getAuthors().getFirst());
   }

}
