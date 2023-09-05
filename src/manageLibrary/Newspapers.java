package Buoi_07.manageLibrary;

public class Newspapers extends Document {
    String issueDay;  //Ngày phát hành

    public Newspapers(int code, String publisherName, int issueNum, String issueDay){
        super(code, publisherName, issueNum);
        this.issueDay = issueDay;
    }
    public String getIssueDay() {
        return issueDay;
    }

    @Override
    public void displayDoc() {
        super.displayDoc();
        System.out.println("Issue day: "+ issueDay);
        System.out.println("==============================================");
    }

    @Override
    public String getType() {
        return "3";
    }
}
