package Buoi_11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        // region EXCEPTION
        // lý do dùng exception trong auto khi thay doi thẻ trong code hoặc tìm kiếm các ptu hoặc là 1 button
//        try {
//            int a = 10/0; // dung exception chia het cho 0
//            System.out.println(" Van Anh ");
//        } catch (ArithmeticException em) {
//            System.out.println("Error is " + em);
//        } catch (Exception e) { // Ten kieu du lieu
//            System.out.println("Error" + e);
//        }

        //checked: canh bao khi khai bao, syntax
        // unchecked tao ra khi thuc thi ( runtime)
        // endregion
        Random random = new Random();
        Integer[] arr = new Integer[100];
//        System.out.print("Danh sách phần tử của mảng: " );
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
//            System.out.print(arr[i]+ " ");
        }
        System.out.print("Nhap phan tu: ");
        int x = sc.nextInt();
        try {
            System.out.println("\n Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("Chỉ số vượt quá giới hạn của mảng");
            System.out.println(e);
        }


//  Viết một chương trình cho phép tạo ra một mảng 100 số nguyên ngẫu nhiên. Cho phép người dùng nhập vào chỉ số của một
//  phần tử và hiển thị giá trị của phần tử đó.
//  Sử dụng try-catch để hiển thị thông báo nếu người dùng nhập vào chỉ số không hợp lệ (index < 0 hoặc index >= 100)

    }
}
