public class Bug {

    int defectID;
    String defectDescription;
    String productVersion;
    String detailSteps;
    String dateRaised;
    String reportedBy;
    String status;
    String fixedBy;
    String dateClosed;
    String severity;
    String priority;

    Bug (int defectIDP,String defectDescriptionP, String productVersionP, String detailStepsP, String dateRaisedP,
         String reportedByP,String statusP, String fixedByP, String dateClosedP, String severityP, String priorityP ){

        this.defectID = defectIDP;
        this.defectDescription = defectDescriptionP;
        this.productVersion = productVersionP;
        this.detailSteps = detailStepsP;
        this.dateRaised = dateRaisedP;
        this.reportedBy = reportedByP;
        this.status = statusP;
        this.fixedBy = fixedByP;
        this.dateClosed = dateClosedP;
        this.severity = severityP;
        this.priority = priorityP;
    }

    public void print(){
        System.out.println(defectID);
        System.out.println(defectDescription);
        System.out.println(productVersion);
        System.out.println(detailSteps);
        System.out.println(dateRaised);
        System.out.println(reportedBy);
        System.out.println(status);
        System.out.println(fixedBy);
        System.out.println(dateClosed);
        System.out.println(severity);
        System.out.println(priority);
    }

    public static void main(String args[]){
        Bug bug = new Bug(1,"The register button doesn't work", "67.0.3396.99", "1. Enter URL, 2. Press register button", "21/05/2018", "Marius Nani","Closed","Vlad Rogna","22/05/2018", "High","High");
        bug.print();
    }
}
