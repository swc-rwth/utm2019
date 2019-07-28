package browsing;

import java.util.Comparator;

import publications.Publication;

public class YearComparator implements Comparator<Publication>{
   
   @Override
   public int compare(Publication p1, Publication p2) {
      return p1.getYear().compareTo(p2.getYear());
   }

}
