package publications;

public class TechnicalReport extends Publication {

   private String institution;

   public String getInstitution() {
      return institution;
   }

   public void setInstitution(String theInstitution) {
      institution = theInstitution;
   }

   private String no;

   public String getNo() {
      return no;
   }

   public void setNo(String theNo) {
      no = theNo;
   }

   public String toString() {
      return (super.toString() + ' ' + this.getInstitution() + ' ' + this
            .getNo());
   }

   public TechnicalReport(String theID) {
      super(theID);
   }
}