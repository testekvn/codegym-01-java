package Buoi_07.btvn2_9_Bai4;

import java.util.Scanner;

public class ChuyenBay {
    String tenChuyen;
    String ngayBay;
    int giaVe;
    String kyHieuChuyen;
    int soLuongVe;

    public String getTenChuyen() {
        return tenChuyen;
    }

    public void setTenChuyen(String tenChuyen) {
        this.tenChuyen = tenChuyen;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public String getKyHieuChuyen() {
        return kyHieuChuyen;
    }

    public void setKyHieuChuyen(String kyHieuChuyen) {
        this.kyHieuChuyen = kyHieuChuyen;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public ChuyenBay(String tenChuyen, String ngayBay, int giaVe, String kyHieuChuyen, int soLuongVe) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
        this.kyHieuChuyen = kyHieuChuyen;
        this.soLuongVe = soLuongVe;
    }
    public ChuyenBay(){

    }
    public void inputChuyenBay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên chuyến bay: ");
        tenChuyen = sc.nextLine();
        System.out.println("Ngày bay: ");
        ngayBay = sc.nextLine();
        System.out.println("Giá vé: ");
        giaVe = Integer.parseInt(sc.nextLine());
        System.out.println("Ký hiệu chuyến bay: ");
        kyHieuChuyen = sc.nextLine();
        System.out.println("Số lượng vé của chuyến bay: ");
        soLuongVe = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "tenChuyen='" + tenChuyen + '\'' +
                ", ngayBay='" + ngayBay + '\'' +
                ", giaVe=" + giaVe +
                ", kyHieuChuyen='" + kyHieuChuyen + '\'' +
                ", soLuongVe=" + soLuongVe +
                '}';
    }
}
