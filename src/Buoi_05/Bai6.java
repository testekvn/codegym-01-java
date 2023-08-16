package Buoi_05;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\n---Menu---");
            System.out.println("1. In ra các số nguyên tố trong dãy");
            System.out.println("2. In ra dãy số fibonacci có trong N");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn từ 0-2:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nập số N: ");
                    Scanner scanner1 = new Scanner(System.in);
                    int a = scanner1.nextInt();
                    for (int num = 1; num < a; num++)
                    {
                        int cout = 0; // đếm số ước của a
                        for (int i = 2; i <= Math.sqrt(num); i++)
                        {
                            if (num % i == 0)
                            {
                                cout++;
                            }
                        }
                        if (cout == 0 && num > 1)
                            System.out.print(" "+ num);
                    }
                    break;
                case 2:
                    System.out.println("Mời bạn nhập số N: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int n = scanner2.nextInt();
                    int num1 = 0, num2 = 1;
                    System.out.print("Chuỗi Fibonacci trong  là: ");
                    while (true){
                        System.out.print(num1+" ");
                        int num3 = num1 + num2;
                        num1 = num2;
                        num2 = num3;
                        if (num1>n)break;
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("!!!!!!!!");
            }
        }
    }
}