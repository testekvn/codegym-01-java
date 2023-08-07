package Buoi_02;
import java.util.Scanner;
public class baiTap2 {
    public static void main(String[] args) {
        System.out.println("20 so nguyen to dau tien: ");
        int number = 20;
        int count = 0;
        int soNguyenTo = 2;
        while (count < number) {
            if (soNguyenTo == 2) {
                System.out.println("- So nguyen to dau tien là 2");
                count++;
            } else {
                boolean check = true;
                for (int i = 2; i <= Math.sqrt(soNguyenTo); i++) {
                    if (soNguyenTo % i == 0) {
                        check = false;
                    }
                }
                if (check) {
                    count++;
                    System.out.println("- So nguyen to thu " + count + " la " + soNguyenTo);
                }
            }
            soNguyenTo++;
        }
    }
}
