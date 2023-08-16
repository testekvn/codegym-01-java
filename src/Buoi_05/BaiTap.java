package Buoi_05;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double numA = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double numB = sc.nextDouble();
        System.out.println("Nhap so c: ");
        double numC = sc.nextDouble();
        double x1, x2;
        double delta = (numB*numB) - (4*numA*numC);
        if (numA!=0){
            if (delta<0){
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                x1=-(numB/(2*numA));
                System.out.println("x1 = x2 " + x1);
            } else {
                x1 = (-numB + Math.sqrt(delta)) / (2 * numA);
                x2 = (-numB - Math.sqrt(delta)) / (2 * numA);
                System.out.printf("x1 = %f va x2 = %f", x1, x2);
            }
        } else {
            x1= -(numC/numB);
            System.out.println("pt co nghiem " + x1);
        }
    }
}
