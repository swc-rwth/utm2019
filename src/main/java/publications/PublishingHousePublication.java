package publications;

public abstract class PublishingHousePublication extends Publication {

   protected String publishingHouse;

   public String getPublishingHouse() {
      return publishingHouse;
   }

   public void setPublishingHouse(String thePublishingHouse) {
      publishingHouse = thePublishingHouse;

   }

   public String toString() {
      return (super.toString() + ", " + publishingHouse);
   }

   public PublishingHousePublication(String theID) {
      super(theID);
   }
}