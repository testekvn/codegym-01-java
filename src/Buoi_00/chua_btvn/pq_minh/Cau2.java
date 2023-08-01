package Buoi_00.chua_btvn.pq_minh;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số N = ");
        int stn = scanner.nextInt();
        switch (stn) {
            case 1:
                System.out.print("2x1=2");
                break;
            case 2:
                System.out.print("2x2=4");
                break;
            case 3:
                System.out.print("2x3=6");
                break;
            case 4:
                System.out.print("2x4=8");
                break;
            case 5:
                System.out.print("2x5=10");
                break;
            case 6:
                System.out.print("2x6=12");
                break;
            case 7:
                System.out.print("2x7=14");
                break;
            case 8:
                System.out.print("2x8=16");
                break;
            case 9:
                System.out.print("2x9=18");
                break;
            case 10:
                System.out.print("2x10=20");
                break;
            default:
                System.out.println("khong hop le");
                break;
        }
    }
}

