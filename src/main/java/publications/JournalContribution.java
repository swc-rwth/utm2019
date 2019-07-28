package publications;

public class JournalContribution extends Contribution {

   private String journal;

   public String getJournal() {
      return journal;
   }

   public void setJournal(String theJournal) {
      journal = theJournal;
   }

   private Integer no;

   public Integer getNo() {
      return no;
   }

   public void setNo(Integer theNo) {
      no = theNo;
   }

   private String vol;

   public String getVol() {
      return vol;
   }

   public void setVol(String theVol) {
      vol = theVol;
   }

   public String toString() {
      return super.toString() + ", Journal: " + this.journal + ", No: "
            + this.no + ", Volume: " + this.vol;
   }

   public JournalContribution(String theID) {
      super(theID);

   }
}