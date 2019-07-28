package publications;

import java.util.LinkedList;

public class ConferenceContribution extends Contribution {

   private String conference;

   public String getConference() {
      return conference;
   }

   public void setConference(String theConference) {
      conference = theConference;
   }

   private String location;

   public String getLocation() {
      return location;
   }

   public void setLocation(String theLocation) {
      location = theLocation;
   }

   private String date;

   public String getDate() {
      return date;
   }

   public void setDate(String theDate) {
      date = theDate;
   }

   private LinkedList<String> editors;

   public String toString() {
      return (super.toString() + ' ' + this.getConference() + ' '
            + this.getLocation() + ' ' + this.getDate());
   }

   public void addEditor(String e) {
      editors.add(e);
   }

   public ConferenceContribution(String theID) {
      super(theID);
      this.editors = new LinkedList<String>();

   }
}