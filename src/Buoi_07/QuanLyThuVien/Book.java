package Buoi_07.QuanLyThuVien;

public class Book extends Library {
    String author;
    int number_pages;

    public Book(String id, String imprint, int issue_number, String author, int number_pages) {
        super(id, imprint, issue_number);
        this.author = author;
        this.number_pages = number_pages;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber_pages() {
        return number_pages;
    }

    public void setNumber_pages(int number_pages) {
        this.number_pages = number_pages;

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", number_pages=" + number_pages +
                ", id='" + id + '\'' +
                ", imprint='" + imprint + '\'' +
                ", issue_number=" + issue_number +
                '}';
    }

    @Override
    public String getType() {
        return "1";
    }
}
