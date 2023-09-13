package Buoi_09.QuanLyThuVien;

/**
 * Báo cần quản lý thêm: Ngày phát hành.
 */
public class TapChi extends TaiLieu{
    String ngayPhatHanh;

    public TapChi(){ }
    public TapChi(String id, String nhaXuatBan, int soPhatHanh, String ngayPhatHanh) {
        super(id, nhaXuatBan, soPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                ", id='" + id + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String type() {
        return "Tap chi";
    }
}
