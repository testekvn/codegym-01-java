package Buoi_09.qlve;

import java.util.ArrayList;
import java.util.List;

public class Chuyenbay {
    //region Fields of Chuyen bay
    String tenchuyen;
    String ngaybay;
    double giave;
    String kyhieuchuyen;
    int soluongve;
    List<Hanhkhach> hanhkhachList;  //Danh khách người trên chuyến bay
    //endregion


    public Chuyenbay(String tenchuyen, String ngaybay, double giave, String kyhieuchuyen, int soluongve, List<Hanhkhach> hanhkhachList) {
        this.tenchuyen = tenchuyen;
        this.ngaybay = ngaybay;
        this.giave = giave;
        this.kyhieuchuyen = kyhieuchuyen;
        this.soluongve = soluongve;
        this.hanhkhachList = new ArrayList<>();
    }
    // In ra thông tin chuyến bay
    public void PrintInfoFly(){
        System.out.println("Tên chuyến bay: "+tenchuyen);
        System.out.println("Ngày bay: "+ngaybay);
        System.out.println("Giá vé: "+giave);
        System.out.println("Ký hiệu chuyến bay: "+kyhieuchuyen);
        System.out.println("Số lượng vé: "+soluongve);
        System.out.println("Danh sách hành khách: "+hanhkhachList);
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

    public List<Hanhkhach> getHanhkhachList() {
        return hanhkhachList;
    }

    public void setHanhkhachList(List<Hanhkhach> hanhkhachList) {
        this.hanhkhachList = hanhkhachList;
    }
}
