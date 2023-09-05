package Buoi_07.btvn2_9_Bai4;

import java.util.Scanner;

public class HanhKhach extends Nguoi{
    int soLuongVe;

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public HanhKhach(String hoTen, String gioiTinh, int tuoi, int soLuongVe) {
        super(hoTen, gioiTinh, tuoi);
        this.soLuongVe = soLuongVe;
    }

    public HanhKhach() {}

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Tổng số vé: ");
        soLuongVe = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "HanhKhach{" +
                "soLuongVe=" + soLuongVe +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
