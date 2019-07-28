package browsing;

import java.util.LinkedList;
import java.util.ListIterator;

import publications.Publication;

public abstract class BibIterator {

   protected LinkedList<Publication> publications;
   protected ListIterator<Publication> iter;

   public void setPublications(LinkedList<Publication> publs) {
      publications = publs;
   }

   public void first() {
      iter = publications.listIterator();
   }


   public Boolean isDone() {
      return iter.hasNext();
   }

   public String next() {
      return iter.next().toString();

   }
}