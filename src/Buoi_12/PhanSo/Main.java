package Buoi_12.PhanSo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so cua phan so 1 : ");
        float tuSo = sc.nextFloat();
        System.out.print("Nhap mau so cua phan so 1 : ");
        float mauSo = sc.nextFloat();
        System.out.print("Nhap tu so cua phan so 2 : ");
        float tuSo2 = sc.nextFloat();
        System.out.print("Nhap mau so cua phan so 2 : ");
        float mauSo2 = sc.nextFloat();
        PhanSo phanSo1 = new PhanSo(tuSo, mauSo);
        PhanSo phanSo2 = new PhanSo(tuSo2, mauSo2);

        System.out.println("Sum: " + sum(phanSo1, phanSo2));
        System.out.println("Subtraction: " + subtraction(phanSo1, phanSo2));
        System.out.println("Multiplication: " + multiplication(phanSo1, phanSo2));
        System.out.println("Division: " + division(phanSo1, phanSo2));

    }

    public static float sum(PhanSo phanSo, PhanSo phanSo2){
//        return (phanSo.tuso/ phanSo.mauso) +(phanSo2.tuso/phanSo2.mauso);
        return ((phanSo.tuso * phanSo2.mauso + phanSo.mauso * phanSo2.tuso)/(phanSo.mauso*phanSo2.mauso));
    }
    public static float subtraction(PhanSo phanSo, PhanSo phanSo2){
        return (((phanSo.tuso * phanSo2.mauso - phanSo.mauso * phanSo2.tuso)/(phanSo.mauso*phanSo2.mauso)));
    }

    public static float multiplication(PhanSo phanSo, PhanSo phanSo2){
        return (phanSo.tuso * phanSo2.mauso)/(phanSo2.tuso * phanSo.mauso);
    }

    public static float division(PhanSo phanSo, PhanSo phanSo2){
        return (phanSo.tuso * phanSo2.tuso)/(phanSo2.mauso * phanSo2.mauso);
}   }                                                                         
