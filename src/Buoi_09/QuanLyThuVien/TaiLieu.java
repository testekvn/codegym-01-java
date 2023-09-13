package Buoi_09.QuanLyThuVien;

/**
 * Tài liệu có các thuộc tính sau; Mã tài liệu, Tên nhà xuất bản, Số phát hành.
 */
public class TaiLieu {
    String id;
    String nhaXuatBan;
    int soPhatHanh;

    public TaiLieu() {}
    public TaiLieu(String id, String nhaXuatBan, int soPhatHanh) {
        this.id = id;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "id='" + id + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String type(){
        return "Tai lieu";
    }
}
