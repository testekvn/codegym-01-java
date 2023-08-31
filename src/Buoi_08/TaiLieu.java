package Buoi_08;

import java.util.Scanner;

public class TaiLieu {
    int maTaiLieu;
    String nhaXuatBan;
    int soPhatHanh;

    public TaiLieu(int maTaiLieu, String nhaXuatBan, int soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soPhatHanh = soPhatHanh;
    }

    public TaiLieu() {

    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
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
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma tai lieu: ");
        maTaiLieu = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
        System.out.println("Nhap so phat hanh: ");
        soPhatHanh = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                '}';
    }
}
