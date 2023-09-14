package Buoi_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        Employee[] nhanVien = new Employee[9];

        System.out.println("Nhập thông tin cho nhân viên");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập loại nhân viên " + (i + 1) + ":");
            System.out.print("Chọn loại nhân viên (1 - Experience, 2 - Fresher, 3 - Intern ): ");
            int choose = scanner.nextInt();
            if (choose == 1) {
                nhanVien[i] = new Experience();
            } else if (choose == 2) {
                nhanVien[i] = new Fresher();
            } else if (choose == 3) {
                nhanVien[i] = new Intern();

            }
            nhanVien[i].nhap();
        }
    }
}
