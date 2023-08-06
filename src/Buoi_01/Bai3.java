package Buoi_01;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float Chieudai;
        float Chieurong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Chiều Dài = ");
        Chieudai = sc.nextFloat();
        System.out.println("Nhập Chiều Rộng = ");
        Chieurong = sc.nextFloat();
        float Dien_Tich = Chieudai * Chieurong;

        System.out.println("Diện Tích Hình Chứ Nhật là : " + Dien_Tich);

    }
}
