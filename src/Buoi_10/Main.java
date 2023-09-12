package Buoi_10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region chia 0
        System.out.println("Start");

        try {
            int a = 10 / 0;

            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Errors" + e);
        }
        System.out.println("End");
        //endregion
        //region Sử dụng lớp ArrayIndexOutOfBoundsException
        Random rd = new Random();
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        for (int a = 0; a < 100; a++) {
            arr[a] = rd.nextInt(100);
            System.out.print(arr[a] + "");

        }
        System.out.println("Nhập phần tử bất kỳ");
        int b = sc.nextInt();
        try{
            System.out.println("Nhập Phần Tử Thứ" + b + " là " + arr[b]);
        }catch(Exception e){
            System.out.println("Không hợp lệ"+e);

        }
        //endregion

        //region phanso
//        PhanSo phanSo1 = new PhanSo();
//        PhanSo phanSo2 = new PhanSo();
//        System.out.println("Nhập phân số 1 :");
//        phanSo1.Nhap();
//        System.out.println("Nhập phân số 2 :");
//        phanSo2.Nhap();
//        System.out.println("Kết quả phép tính ");
//        phanSo1.nhan(phanSo2);
//        phanSo1.chia(phanSo2);
//        phanSo1.cong(phanSo2);
//        phanSo1.tru(phanSo2);
        //endregion

    }
}
