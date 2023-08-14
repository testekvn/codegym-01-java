package Buoi_04;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Chuyen();
    }

    private static void Chuyen() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        String str = chuyendoi(a, b);
        System.out.println("giá trị" + a + "chuyển đổi " +b+"");
        xuat(str);


    }

    private static void xuat(String str) {
    }

    private static String chuyendoi(int a, int b) {
        return null;
    }
}
