package Buoi_00.chua_btvn.pv_quyet;

import java.util.Scanner;

public class Bangcuuchuong{

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số N (2<= N <=20): ");
		int N = scanner.nextInt();
		System.out.println("Bảng cửu chương của " + N + " là:");
		//if (N >= 2 && N <= 20)
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + " = " + (N * i));
        }
	}
}