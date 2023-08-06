package Buoi_01;

import java.util.Scanner;

public class Bai7 {


    public static void main(String[] args) {
        double VND = 23525;
        double USD;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Số Tiền Usd Cần Đổi : ");
        USD = sc.nextDouble();
        double giatien = USD*23525;
        System.out.println("Số Tiền Là " + giatien + "Vnd");
    }
}

