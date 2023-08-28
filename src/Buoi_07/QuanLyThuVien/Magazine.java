package Buoi_07.QuanLyThuVien;

public class Magazine extends Library {
    int release_month;

    public Magazine(  String id, String imprint, int issue_number, int release_month) {
        super(id, imprint, issue_number);
        this.release_month = release_month;
    }
    public void display() {
        super.display();
        System.out.println(" Tháng phát hành : " +release_month );

    }
}
