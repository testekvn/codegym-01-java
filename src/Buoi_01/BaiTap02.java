package Buoi_01;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien usd: ");
        double usd = sc.nextDouble();
        System.out.println("Gia tri vnd: " + usd*23000);
    }
}
