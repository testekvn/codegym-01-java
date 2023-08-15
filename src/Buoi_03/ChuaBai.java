package Buoi_03;

import java.util.Scanner;

public class ChuaBai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int N = scanner.nextInt();
        System.out.println("Nhập hệ cơ số: ");
        int hcs =scanner.nextInt();
        StringBuilder str = new StringBuilder();
        int sd = 0;
        while (N>0){
           sd = N%hcs;
           str.append(sd);
           N= N/hcs;
           if(N<hcs){
               str.append(N);
               break;
           }
        }System.out.println(str.reverse());
    }
}

