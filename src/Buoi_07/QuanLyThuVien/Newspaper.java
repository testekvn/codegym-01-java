package Buoi_07.QuanLyThuVien;

public class Newspaper extends Library {
    String release_date;

    public Newspaper(String id, String imprint, int issue_number, String release_date) {
        super(id, imprint, issue_number);
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "release_date=" + release_date +
                ", id='" + id + '\'' +
                ", imprint='" + imprint + '\'' +
                ", issue_number=" + issue_number +
                '}';
    }

    @Override
    public String getType() {
        return "3";
    }
}
