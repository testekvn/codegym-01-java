package Buoi_03;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap một số nguyên bất kỳ: ");
        int number = sc.nextInt();
        String stringNumber = ""+ number;
//        System.out.println(number);
//        System.out.println(stringNumber);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }

        System.out.println(sum);
    }
}
