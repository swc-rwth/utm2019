package publications;

public abstract class Contribution extends PublishingHousePublication {

   private String pages;

   public String getPages() {
      return pages;
   }

   public void setPages(String thePages) {
      pages = thePages;
   }

   public Contribution(String theID) {
      super(theID);
   }

}