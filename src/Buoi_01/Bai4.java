package Buoi_01;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a = ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị b =  ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị c = ");
        double c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Nghiệm x = %f\n", answer);
        } else {
            if (b == c) {
                System.out.print("Phương trình có nghiệm  ");
            } else {
                System.out.print("Phương trình vô nghiệm ");
            }
        }
    }
}

