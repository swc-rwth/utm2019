/**
 * 
 */
package publications;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class Publication {

   private String year;

   /* (non-Javadoc)
 * @see publications.PublicationInterface#getYear()
 */
public String getYear() {
      return year;
   }

   /* (non-Javadoc)
 * @see publications.PublicationInterface#setYear(java.lang.String)
 */
public void setYear(String theYear) {
      year = theYear;
   }

   private String title;

   /* (non-Javadoc)
 * @see publications.PublicationInterface#getTitle()
 */
public String getTitle() {
      return title;
   }

   /* (non-Javadoc)
 * @see publications.PublicationInterface#setTitle(java.lang.String)
 */
public void setTitle(String theTitle) {
      title = theTitle;
   }

   private String id;

   /* (non-Javadoc)
 * @see publications.PublicationInterface#getId()
 */
public String getId() {
      return id;
   }
   /* (non-Javadoc)
 * @see publications.PublicationInterface#setId(java.lang.String)
 */
public void setId(String theID) {
       id = theID;
   }

   private LinkedList<String> authors;

   /* (non-Javadoc)
 * @see publications.PublicationInterface#toString()
 */
@Override
public String toString() {
      String authStr = "";
      ListIterator<String> iter = authors.listIterator();
      if (authors.isEmpty()) {
         authStr = "* no authors *";
      } else {
         authStr = iter.next();
         while (iter.hasNext()) {
            authStr = authStr + "; " + iter.next();
         }
      }
      return ("[" + id + "] " + authStr + " (" + year + "): " + title);
   }

   private void init() {
      title = "";
      year = "";
      authors = new LinkedList<String>();
   }

   /* (non-Javadoc)
 * @see publications.PublicationInterface#addAuthor(java.lang.String)
 */
public void addAuthor(String a) {
      authors.add(a);
   }

   /* (non-Javadoc)
 * @see publications.PublicationInterface#getAuthors()
 */
public LinkedList<String> getAuthors() {
      return authors;
   }

   /* (non-Javadoc)
 * @see publications.PublicationInterface#containsString(java.lang.String)
 */
public Boolean containsString(String substr) {
      return (this.toString().contains(substr));
   }

   public Publication(String theID) {
      id = theID;
      this.init();
   }

}