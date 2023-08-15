package Buoi_05;

import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a = ");
        int a = sc.nextInt();
        System.out.println("Nhập giá trị b = ");
        int b = sc.nextInt();
        System.out.println("Nhập giá trị c = ");
        int c = sc.nextInt();
        if(a !=0){
            int kq = -c/b;
            System.out.println("Phương trình có nghiệm là " + kq);
        }else {
            a=0;
            System.out.println("Phường trình vô nghiệm");
        }
    }
}
