package Buoi_08.QuanLyVeBay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuyenBay {
    String tenchuyen;
    String ngaybay;
    double giave;
    String kyhieuchuyen;
    int soluongve;
    List<HanhKhach> hanhkhachList;  //Danh khách người trên chuyến bay


    public ChuyenBay(String tenchuyen, String ngaybay, double giave, String kyhieuchuyen, int soluongve, List<HanhKhach> hanhkhachList) {
        this.tenchuyen = tenchuyen;
        this.ngaybay = ngaybay;
        this.giave = giave;
        this.kyhieuchuyen = kyhieuchuyen;
        this.soluongve = soluongve;
        this.hanhkhachList = new ArrayList<>();
    }

    public void PrintInfoFly() {
        System.out.println("Tên chuyến bay: " + tenchuyen);
        System.out.println("Ngày bay: " + ngaybay);
        System.out.println("Giá vé: " + giave);
        System.out.println("Ký hiệu chuyến bay: " + kyhieuchuyen);
        System.out.println("Số lượng vé: " + soluongve);
        System.out.println("Danh sách hành khách: " + hanhkhachList);
    }

    public String getTenchuyen() {
        return tenchuyen;
    }

    public void setTenchuyen(String tenchuyen) {
        this.tenchuyen = tenchuyen;
    }

    public String getNgaybay() {
        return ngaybay;
    }

    public void setNgaybay(String ngaybay) {
        this.ngaybay = ngaybay;
    }

    public double getGiave() {
        return giave;
    }

    public void setGiave(double giave) {
        this.giave = giave;
    }

    public String getKyhieuchuyen() {
        return kyhieuchuyen;
    }

    public void setKyhieuchuyen(String kyhieuchuyen) {
        this.kyhieuchuyen = kyhieuchuyen;
    }

    public int getSoluongve() {
        return soluongve;
    }

    public void setSoluongve(int soluongve) {
        this.soluongve = soluongve;
    }

    public List<HanhKhach> getHanhkhachList() {
        return hanhkhachList;
    }

    public void setHanhkhachList(List<HanhKhach> hanhkhachList) {
        this.hanhkhachList = hanhkhachList;
    }

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "tenchuyen='" + tenchuyen + '\'' +
                ", ngaybay='" + ngaybay + '\'' +
                ", giave=" + giave +
                ", kyhieuchuyen='" + kyhieuchuyen + '\'' +
                ", soluongve=" + soluongve +
                ", hanhkhachList=" + hanhkhachList +
                '}';
    }
    public ChuyenBay(){

    }
    public void PrintInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên chuyến bay: ");
        tenchuyen = sc.nextLine();
        System.out.println("Ngày bay: ");
        ngaybay = sc.nextLine();
        System.out.println("Giá vé: ");
        giave = Integer.parseInt(sc.nextLine());
        System.out.println("Ký hiệu chuyến bay: ");
        kyhieuchuyen = sc.nextLine();
        System.out.println("Số lượng vé của chuyến bay: ");
        soluongve = Integer.parseInt(sc.nextLine());
    }

}
