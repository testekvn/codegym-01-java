package Buoi_07.btvn2_9_Bai4;

import java.util.Scanner;

public class Nguoi {
    String hoTen;
    String gioiTinh;
    int tuoi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Nguoi(String hoTen, String gioiTinh, int tuoi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }
    public Nguoi(){}

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        hoTen = sc.nextLine();
        System.out.println("Giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Tuổi: ");
        tuoi = Integer.parseInt(sc.nextLine());
    }
}
