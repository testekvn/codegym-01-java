package Buoi_10;

import java.util.Scanner;

public class PhanSo {
    int tuSo;
    int mauSo;
    Scanner sc = new Scanner(System.in);

    public PhanSo() {

    }

    public void Huy() {

    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.tuSo = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        this.mauSo = sc.nextInt();
    }

    public void Xuat() {
        System.out.print(this.tuSo + "/" + this.mauSo);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(int tuSo, int mauSo) {
        super();
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void toiGian() {
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
    }

    public void cong(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGian();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void tru(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGian();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

    public void nhan(PhanSo ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGian();
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void chia(PhanSo ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGian();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }

    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        System.out.println("Nhập phân số 1 :");
        phanSo1.Nhap();
        System.out.println("Nhập phân số 2 :");
        phanSo2.Nhap();
        System.out.println("Kết quả phép tính ");
        phanSo1.nhan(phanSo2);
        phanSo1.chia(phanSo2);
        phanSo1.cong(phanSo2);
        phanSo1.tru(phanSo2);
    }
}

