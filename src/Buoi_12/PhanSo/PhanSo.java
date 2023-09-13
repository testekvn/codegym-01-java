package Buoi_12.PhanSo;

/**
 * Xây dựng lớp Phanso gồm:
 * Thuộc Tính: tuso, mauso
 * Phương thức:
 * Hàm Khởi Tạo Không Tham Số, Hàm Hủy
 * Nhập , Xuất
 * Cong(), Tru(), Nhan(), Chia()
 * Tính Tổng, Hiệu, Tích, Thương 2 phân số obj1 và obj2 rồi in kết quả ra màn hình
 */
public class PhanSo {
    float tuso;
    float mauso;

    public PhanSo() {

    }

    public float getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public float getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public PhanSo(float tuso, float mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }
}
