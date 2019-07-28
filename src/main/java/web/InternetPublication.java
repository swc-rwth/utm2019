package web;


public class InternetPublication {

   private String url;

   public String getUrl() {
      return url;
   }

   public void setUrl(String theUrl) {
      url = theUrl;
   }

   private String authorInfo;

   public String getAuthorInfo() {
      return authorInfo;
   }

   public void setAuthorInfo(String theAuthorInfo) {
      authorInfo = theAuthorInfo;
   }

   public void openPDF() {
      System.out.println(url + " displayed");

   }
}