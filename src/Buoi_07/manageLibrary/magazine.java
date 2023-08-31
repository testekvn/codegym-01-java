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

    public void displayDoc(){
        super.displayDoc();
        System.out.println("Type magazine: " + typeMagazine);
        System.out.println("Issue month: "+ issueMonth);
        System.out.println("==============================================");
    }

    @Override
    public String toString() {
        return "magazine{" +
                "typeMagazine='" + typeMagazine + '\'' +
                ", issueMonth=" + issueMonth +
                ", docCode=" + docCode +
                ", publisherName='" + publisherName + '\'' +
                ", issueNum=" + issueNum +
                '}';
    }
}
