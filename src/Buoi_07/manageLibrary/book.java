package Buoi_07.manageLibrary;

public class book extends document{
    String authorName; // Tác giả
    int pageNum;       // Số trang

    public book(int docCode, String publisherName, int issueNum, String authorName, int pageNum){
        super(docCode, publisherName, issueNum);
        this.authorName = authorName;
        this.pageNum = pageNum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageNum() {
        return pageNum;
    }

    @Override
    public void displayDoc() {
        super.displayDoc();
        System.out.println("Author: "+ authorName);
        System.out.println("Issue month: "+ pageNum);
        System.out.println("==============================================");
    }
}
