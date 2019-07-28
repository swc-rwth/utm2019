package core;

import java.util.LinkedList;
import java.util.ListIterator;

import browsing.AuthorIterator;
import browsing.YearIterator;
import publications.*;

public class Bibliography {

   private LinkedList<Publication> publications;

   public LinkedList<Publication> getPublications() {
      return publications;

   }

   public void setPublications(LinkedList<Publication> thePublication) {
      publications = thePublication;
   }

   private LinkedList<Publication> resultSet;

   public void add(Publication publ) {
      publications.add(publ);
   }

   public Boolean search(String criteria) {
      Boolean found = false;
      resultSet = new LinkedList<Publication>();
      if (criteria.equals("*")) {
         found = true;
         resultSet = publications;
      } else {
         ListIterator<Publication> listIter = publications.listIterator();
         while (listIter.hasNext()) {
            Publication publ = (Publication) listIter.next();
            if (publ.containsString(criteria)) {
               resultSet.add(publ);
               found = true;
            }
         }
      }
      return found;
   }

   public void remove(String id) {
   }

   public String export() {
      String resString = "";
      if (resultSet != null) {
         ListIterator<Publication> iter = resultSet.listIterator();
         while (iter.hasNext()) {
            Publication pub = (Publication) iter.next();
            resString = resString + pub.toString() + "\n";
         }
      }
      resultSet = null;
      return resString;
   }

   public Bibliography() {
      publications = new LinkedList<Publication>();
   }
   
   public AuthorIterator getAuthorIterator(){
      return new AuthorIterator(publications);
   }
   public YearIterator getYearIterator(){
      return new YearIterator(publications);
   }

}