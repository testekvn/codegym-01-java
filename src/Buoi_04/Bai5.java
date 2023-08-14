package Buoi_04;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        System.out.println("Nhập Số n = ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int m = number;
        while(number>0){
            System.out.print(number%10+" + ");
            sum += number%10;
            number = number/10;
        }
        System.out.println("\b\b\b");
        System.out.println("Tổng các chữ số "+m+"="+sum);
    }
}
