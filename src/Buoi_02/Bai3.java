package Buoi_02;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Số Nguyên Tố Cần In = ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (snt(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean snt(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (i % N == 0) {
                return false;
            }

        }
        return true;
    }
}

