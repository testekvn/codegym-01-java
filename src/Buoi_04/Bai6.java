package Buoi_04;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập Số N = ");
        Scanner sc = new Scanner(System.in);
        int num1 = 2;
        int num2 = sc.nextInt();
        if (num1 == 1) {
            System.out.println(num1 + "=" + num1);
        } else {
            System.out.print(num2 + "=");
            while (num2 != 1) {
                if (num2 % num1 == 0) {
                    System.out.print(num1 + "x");
                    num2 /= num1;
                } else {
                    ++num1;
                }
            }
            System.out.println("\b\b\b");
        }

    }
}
