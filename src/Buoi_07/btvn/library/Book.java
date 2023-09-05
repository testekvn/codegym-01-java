package Buoi_07.btvn.library;

public class Book extends Document {
    String authorName; // Tác giả
    int pageNum;       // Số trang

    public Book(int code, String publisherName, int issueNum, String authorName, int pageNum){
        super(code, publisherName, issueNum);
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

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", pageNum=" + pageNum +
                ", code=" + code +
                ", publisherName='" + publisherName + '\'' +
                ", issueNum=" + issueNum +
                '}';
    }

    @Override
    public String getType() {
        return "1";
    }
}
