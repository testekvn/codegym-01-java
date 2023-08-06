package Buoi_01;

import java.util.Scanner;

public class Bai6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập Số cần đọc:");
            int stn = scanner.nextInt();
            switch (stn) {
                case 20:
                    System.out.print("Twenty");
                    break;
                case 222:
                    System.out.print("two hundred twenty-two");
                    break;
                case 96:
                    System.out.print("ninety six");
                    break;
                default:
                    System.out.println("Số không hợp lệ ");
                    break;
            }

            }
        }


