package Buoi_07.QuanLyThuVien;

public abstract class Library {
    String id;
    String imprint;
    int issue_number;

    public Library(  String id, String imprint, int issue_number) {
        this.id = id;
        this.imprint = imprint;
        this.issue_number = issue_number;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getIssue_number() {
        return issue_number;
    }

    public void setIssue_number(int issue_number) {
        this.issue_number = issue_number;
    }
    public void display(){
        System.out.println(" Mã Tài Liệu : "+ id);
        System.out.println(" Nhà Xuất Bản : "+ imprint);
        System.out.println(" Số Phát Hành : "+ issue_number);
    }
    public String getType(){
        return "Library";
    }

    @Override
    public String toString() {
        return "Library{" +
                "id='" + id + '\'' +
                ", imprint='" + imprint + '\'' +
                ", issue_number=" + issue_number +
                '}';
    }
}
