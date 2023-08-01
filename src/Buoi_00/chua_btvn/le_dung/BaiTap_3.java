package Buoi_00.chua_btvn.le_dung;

import java.util.Scanner;

public class BaiTap_3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số cần kiểm tra n:");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}
