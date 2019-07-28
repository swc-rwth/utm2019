package publications;

import web.InternetPublication;

public class WebPublication extends Publication {

   private InternetPublication iPublication;


   public void setURL(String url) {
      iPublication.setUrl(url);
   }

   public String getURL() {
      return iPublication.getUrl();
   }

   public void display() {
      iPublication.openPDF();
   }

   public String toString() {
      return (super.toString() + ", " + this.getURL());
   }

   public WebPublication(String theId) {
      super(theId);
      this.iPublication = new InternetPublication();

   }
}