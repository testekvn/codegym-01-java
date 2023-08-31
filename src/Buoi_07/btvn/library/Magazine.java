package Buoi_07.btvn.library;

public class Magazine extends Document {
    String typeMagazine;  //Loại tạp chí
    int issueMonth;    //Tháng phát hành

    public Magazine(int code, String publisherName, int issueNum, String typeMagazine, int issueMonth){
        super(code, publisherName, issueNum);
        this.typeMagazine = typeMagazine;
        this.issueMonth = issueMonth;
    }

    public String getTypeMagazine() {
        return typeMagazine;
    }
    public int getIssueMonth() {
        return issueMonth;
    }

    public void displayDoc(){
        super.displayDoc();
        System.out.println("Type magazine: " + typeMagazine);
        System.out.println("Issue month: "+ issueMonth);
        System.out.println("==============================================");
    }

    @Override
    public String getType() {
        return "2";
    }
}
