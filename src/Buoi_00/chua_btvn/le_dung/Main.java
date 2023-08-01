package Buoi_00.chua_btvn.le_dung;

import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name;
        int birdday;
        String chuyennganh;
        String muctieu;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên của sinh viên: ");
        name = scanner.nextLine();
        System.out.println("Nhập vào năm sinh của sinh viên: ");
        birdday = scanner.nextInt();
        System.out.println("Nhập vào chuyen nganh của sinh viên: ");
        chuyennganh = scanner.nextLine();
        System.out.println("Nhập vào muc tieu của sinh viên: ");
        muctieu = scanner.nextLine();

        System.out.println("Họ tên của sinh viên: " + name);
        System.out.println("Tuổi của sinh viên =  " + birdday);
        System.out.println("chuyen nganh của sinh viên: " + chuyennganh);
        System.out.println("muc tieu của sinh viên: " + muctieu);
    }
}
