package Buoi_07.QuanLyThuVien;

public class Newspaper extends Library {
    int release_date;

    public Newspaper(String id, String imprint, int issue_number, int release_date) {
        super(id, imprint, issue_number);
        this.release_date = release_date;
    }

    public void display() {
        super.display();
        System.out.println(" Ngày phát hành : " + release_date);

    }
}
