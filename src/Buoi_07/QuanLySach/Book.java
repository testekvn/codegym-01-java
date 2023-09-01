package Buoi_07.QuanLySach;

public class Book extends Document{
    String nameAuthor; // Ten tac gia
    int numberPage; // So trang

    public Book(String idDoc, String namePublisher, int numberPublish, String nameAuthor, int numberPage) {
        super(idDoc, namePublisher, numberPublish);
        this.nameAuthor = nameAuthor;
        this.numberPage = numberPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }
    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", numberPage=" + numberPage +
                ", idDoc='" + idDoc + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberPublish=" + numberPublish +
                '}';
    }

    @Override
    public String getType() {
        return "1";
    }
}
