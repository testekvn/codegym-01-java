package Buoi_07.manageLibrary;

public class magazine extends document{
    String typeMagazine;  //Loại tạp chí
    int issueMonth;    //Tháng phát hành

    public magazine(int docCode, String publisherName, int issueNum, String typeMagazine, int issueMonth){
        super(docCode, publisherName, issueNum);
        this.typeMagazine = typeMagazine;
        this.issueMonth = issueMonth;
    }

    public String getTypeMagazine() {
        return typeMagazine;
    }
    public int getIssueMonth() {
        return issueMonth;
    }

}
