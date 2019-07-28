package idgeneration;

import publications.Publication;

public class IDFactory {

   private static Integer idCounter = 1;

   private static IDFactory theInstance;

   private static IDGenerator idgenerator;

   public static void setIDGenerator(IDGenerator idg) {
      idgenerator = idg;
   }

   public static IDFactory getInstance() {
      if (theInstance == null) {
         theInstance = new IDFactory();
         return theInstance;
      } else {
         return theInstance;
      }

   }

   public String newID(Publication pub) {
      String id = idgenerator.generate(idCounter, pub);
      idCounter = idCounter + 1;
      return id;
   }

}