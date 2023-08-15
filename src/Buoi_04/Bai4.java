package Buoi_04;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int N = 11;
        int Hs = 2;
        StringBuilder result = new StringBuilder();
        int sd = 0;
        while (N != 0) {
            sd = N % Hs;
            if (Hs > 9) {
                result.append(sd + 55);
            } else
                result.append(sd);
            N = N / Hs;
//            System.out.print("in ra" + sd);
            if (N < Hs) {
//                System.out.print(N);
                result.append(N);
                break;
            }

        }
        System.out.println("kq" + result.reverse());
    }
}

