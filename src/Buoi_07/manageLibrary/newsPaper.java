package Buoi_07.manageLibrary;

public class newsPaper extends document{
    int issueDay;  //Ngày phát hành

    public newsPaper(int docCode, String publisherName, int issueNum, int issueDay){
        super(docCode, publisherName, issueNum);
        this.issueDay = issueDay;
    }
    public int getIssueDay() {
        return issueDay;
    }

    @Override
    public void displayDoc() {
        super.displayDoc();
        System.out.println("Issue day: "+ issueDay);
    }
}
