package Buoi_07.QuanLySach;

public class Book extends Document{
    String nameAuthor;
    int numberPage;

    public Book(String idDoc, String namePublisher, int numberPublish) {
        super(idDoc, namePublisher, numberPublish);
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
                '}';
    }


}
