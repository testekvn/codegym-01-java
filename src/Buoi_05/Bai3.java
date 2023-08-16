package Buoi_05;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập hệ số a: ");
        a = scanner.nextFloat();
        System.out.println("Mời bạn nhập hệ số b: ");
        b = scanner.nextFloat();
        System.out.println("Mời bạn nhập hệ số c: ");
        c = scanner.nextFloat();
        System.out.println("Phương trình vừa nhập là: "+a+"x^2 + "+b+"x +"+c+" = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm x= " + (-c / b));
            }
            }else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }
}
