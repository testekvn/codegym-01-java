package Buoi_09.QuanLyThuVien;

/**
 * Sách cần quản lý thêm các thuộc tính: tên tác giả, số trang.
 */
public class Sach extends TaiLieu{
    String tenTacGia;
    int soTrang;

    public Sach() {
    }

    public Sach(String id, String nhaXuatBan, int soPhatHanh, String tenTacGia, int soTrang) {
        super(id, nhaXuatBan, soPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }
    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", id='" + id + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }


    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String type() {
        return "Sach";
    }
}
