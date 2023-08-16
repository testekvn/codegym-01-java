package Buoi_05;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a = ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b = ");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c = ");
        double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                double kq = -c / b;
                System.out.println("Phương trình có 1 nghiệm = "  +kq);
            }

        } else {
            if (delta > 0) {
                double Nghiem1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
                double Nghiem2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm " + Nghiem1 + " và " + Nghiem2);
            } else if (delta == 0) {
                double Nghiem1 = (-b) / (2 * a);
                System.out.println("Phương trình có nghiệm kép " + Nghiem1);
            } else if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}

