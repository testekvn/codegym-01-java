package Buoi_07.QuanLyThuVien;

public class Magazine extends Library {
    String typeMagazine;
    int release_month;

    public Magazine(  String id, String imprint, int issue_number, int release_month, String typeMagazine) {
        super(id, imprint, issue_number);
        this.release_month = release_month;
        this.typeMagazine = typeMagazine;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "typeMagazine='" + typeMagazine + '\'' +
                ", release_month=" + release_month +
                ", id='" + id + '\'' +
                ", imprint='" + imprint + '\'' +
                ", issue_number=" + issue_number +
                '}';
    }

    @Override
    public String getType() {
        return "2";
    }
}
