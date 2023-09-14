package Buoi_10.PhanSo;

import java.util.Scanner;

public class Phanso {
    int tuSo;
    int mauSo;

    public Phanso() {
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
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tu so = ");
        tuSo = sc.nextInt();
        System.out.println("Mau so = ");
        mauSo = sc.nextInt();
    }
    public void output(){
        System.out.println("Phan so vua nhap: "+ getTuSo()+" / "+ getMauSo());
    }
    public void congPhanSo(Phanso ps){
        int ts = (this.getTuSo()* ps.getMauSo())+ (ps.getTuSo()*this.getMauSo());
        int ms = this.getMauSo()*ps.getMauSo();
        System.out.println("Ket qua: "+ ts+"/"+ms);
    }
    public static void main(String[] args) {
        Phanso psNum1 = new Phanso();
        System.out.println("Nhap phan so 1: ");
        psNum1.input();
        Phanso psNum2 = new Phanso();
        System.out.println("Nhap phan so 2: ");
        psNum2.input();
        psNum1.congPhanSo(psNum2);
        System.out.println("Ket qua: ");
    }
}

