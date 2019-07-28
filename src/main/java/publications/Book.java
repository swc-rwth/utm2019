package publications;

import idgeneration.IDFactory;
import idgeneration.IDGenerator;

public class Book extends PublishingHousePublication {

	
   protected String isbn;

   public String getIsbn() {
      return isbn;
   }

   public void setIsbn(String theIsbn) {
      isbn = theIsbn;
   }

   public String toString() {
      return (super.toString() + ", ISBN " + isbn);

   }

   public Book(String theID) {
      super(theID);
   }
   
   public Book() {
	   super("");
   }
}