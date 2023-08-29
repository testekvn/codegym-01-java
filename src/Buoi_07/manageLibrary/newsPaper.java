package Buoi_07.manageLibrary;

public class newsPaper extends document{
    String issueDay;  //Ngày phát hành

    public newsPaper(int docCode, String publisherName, int issueNum, String issueDay){
        super(docCode, publisherName, issueNum);
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
    public String toString() {
        return "newsPaper{" +
                "issueDay='" + issueDay + '\'' +
                '}';
    }
}
