package Buoi_05;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\n---Menu---");
            System.out.println("1. Tính tổng chẵn tổng lẻ");
            System.out.println("2. Tính giai thừa của 1 số");
            System.out.println("3. In ra dãy số fibonacci có trong M");
            System.out.println("4. In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7`");
            System.out.println("5. In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn từ 0-5:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int n;
                    int tongLe = 0;
                    int tongChan = 0;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập số N: ");
                    n = scanner1.nextInt();
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 1) {
                            tongLe += i;

                        } else {
                            tongChan += i;
                        }
                    }
                    System.out.println("Tổng số lẻ là: " + tongLe);
                    System.out.println("Tổng số chẵn là: " + tongChan);
                    break;
                case 2:
                    System.out.println("Tính giai thừa của số: ");
                    Scanner scanner2 = new Scanner(System.in);
                    int N = scanner2.nextInt();
                    long giaiThua = 1;
                    for (int i = 1; i <= N; i++) {
                        giaiThua = giaiThua * i;
                    }
                    System.out.println("Giai thừa của " + N + " là: " + giaiThua);
                    break;
                case 3:
                    System.out.println("Mời bạn nhập số N: ");
                    Scanner scanner3 = new Scanner(System.in);
                    int m = scanner3.nextInt();
                    int num1 = 1, num2 = 1, num3 =0;
                    System.out.print("Chuỗi Fibonacci trong  là: ");
                    System.out.print(num1+" "+ num2);
                    while ((num3 = num1 + num2)<=m){
                        System.out.print(" "+ num3);
                        num1 = num2;
                        num2 = num3;
                    }
                    break;
                case 4:
                    int j=0;
                    System.out.println("Toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7: ");
                    System.out.print(0);
                    while (true){
                        j++;
                        System.out.print(" "+j);
                        if (j%7==0)break;
                    }
                    break;
                case 5:
                    System.out.println("Dãy số trừ các số kết thúc (có số đơn vị) là số 0 là: ");
                    for (int k=0;k<=100;k++){
                        if(k%10!=0){
                            System.out.print(" "+k);
                        }
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("!!!!!!!!");
            }
        }
    }

}