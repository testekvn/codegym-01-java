package Buoi_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

//        1. Xây dựng chương trình in ra số ngày của tháng. Ví dụ nhập vào tháng 1 -> Hiển thị số ngày là 31 và tháng là Feb
//
//        2. Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:
//        - Tổng các số lẻ
//                - Tổng các sổ chẵn
//                - Giai thừa của số N
//        - In ra dãy số fibonacci có trong N
//                - In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7
//                - In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0
//                - Điều kiện: 0<= N <= 100;
//
//        3. Viết chương trình giải phương trình bậc 2: ax2 + bx +c = 0


        // region Bai 1
//        int day = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Month:  ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.printf("%d is Jan + 31 days", day);
                break;
            case 2:
                System.out.printf("%d is Feb + 28 day", day);
                break;
            case 3:
                System.out.printf("%d is Mar + 31 days", day);
                break;
            case 4:
                System.out.printf("%d is Apr + 30 days", day);
                break;
            case 5:
                System.out.printf("%d is May + 31 days", day);
                break;
            case 6:
                System.out.printf("%d is Jun + 30 days", day);
                break;
            case 7:
                System.out.printf("%d is Jul + 31 days", day);
                break;
            case 8:
                System.out.printf("%d is Aug + 30 days", day);
                break;
            case 9:
                System.out.printf("%d is Sep+ 31 days", day);
                break;
            case 10:
                System.out.printf("%d is Oct + 30 days", day);
                break;
            case 11:
                System.out.printf("%d is Nov + 31 days", day);
                break;
            case 12:
                System.out.printf("%d is Oct + 30 days", day);
                break;
            default:
                System.out.println("False");
                break;
        }

        //endregion

        //region Bai 2

        System.out.println("\n");
        int numStart = 1;
        int numEnd = 100;
        int sumLe=0;
        int sumChan=0;
        //Tong so le
        for (int i = numStart; i < numEnd; i++) {
            if (i %2 !=0){
                sumLe +=i;
            }
        }
        System.out.println("Tong so le: " + sumLe);

        // Tong so chan
        for (int i = numStart; i < numEnd; i++) {
            if (i %2 ==0){
                sumChan +=i;
            }
        }
        System.out.println("Tong so chan: " + sumChan);

//        System.out.printf("Giai thu cua %d: ", (numEnd*(numEnd-1)));

        System.out.println("\n");
        // In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7
        System.out.println("In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7");
        for (int i = numStart; i < numEnd; i++) {
            if (i % 7 == 0){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n");
        //In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0
        System.out.println("In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0");
        for (int i = numStart; i < numEnd; i++) {
            if (i % 10 != 0){
                System.out.print(i + " ");
            }
        }

        //
        //endregion
        //In ra dãy số fibonacci có trong N 1 1 2 3 5 8...
        while (true){

        }
        //

    }
}
