package Buoi_05;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
//        //region TestJava Bai1
//        System.out.print("Nhap thang: ");
//        Scanner sc1 = new Scanner(System.in);
//        int month = sc1.nextInt();
//        switch (month){
//            case 1:
//                System.out.println("31 ngay");
//                break;
//            case 2:
//                System.out.println("29 ngay");
//                break;
//            case 3:
//                System.out.println("31 ngay");
//                break;
//            case 4:
//                System.out.println("30 ngay");
//                break;
//            case 5:
//                System.out.println("31 ngay");
//                break;
//            case 6:
//                System.out.println("30 ngay");
//                break;
//            case 7:
//                System.out.println("31 ngay");
//                break;
//            case 8:
//                System.out.println("30 ngay");
//                break;
//            case 9:
//                System.out.println("31 ngay");
//                break;
//            case 10:
//                System.out.println("30 ngay");
//                break;
//            case 11:
//                System.out.println("31 ngay");
//                break;
//            case 12:
//                System.out.println("30 ngay");
//                break;
//            default:
//                System.out.println("Thang khong hop le!");
//        }
//        //endregion

        //region TestJava Bai2
        System.out.print("Nhap so N (Điều kiện: 0<= N <= 100): ");
        Scanner sc2 = new Scanner(System.in);
        int N = sc2.nextInt();
//        if (N <0 && N >100){
//            System.out.printf("So N khong hop le!");
//        }
        int sumc = 0;
        int suml =0;
        int giaithua = 1;
        for (int i = 1; i <= N; i++){
            //Tong cac so le
            if (i %2 !=0){
                suml += i;
            }
            else{
                sumc +=i;
            }
            giaithua *= i;
        }
        System.out.println("Tong cac so le tu 1 den "+N+" la:" + suml);
        System.out.println("Tong cac so chan tu 1 den "+N+ " la:"+ sumc);
        System.out.println("Giai thừa của số "+N+ " la:"+ giaithua);
        System.out.println("In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7: ");
        for (int i = 1; i <= N; i++){
            System.out.print(i+" ");
            if (i %7==0){
                break;
            }
        }
        System.out.println("\nIn ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0: ");
        for (int i = 1; i <= N; i++) {
            if (i %10 !=0){
                System.out.print(i+ " ");
            }
        }
//        System.out.println("In ra dãy số fibonacci có trong "+N+ ": ");
//        int sum2 =1;
//        for (int i = 1; i <= N; i++){
//
//            while (true){
//                sum2 +=i;
//                System.out.print(sum2+" ");
//            }
//            if (sum2 ==N){
//                break;
//            }
//        }
        //endregion

        //region TestJava Bai2
        int x1, x2 =0;
        System.out.println("Nhap so a:");
        Scanner sc3 = new Scanner(System.in);
        int a = sc3.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc3.nextInt();
        System.out.println("Nhap so c: ");
        int c = sc3.nextInt();
        if (a == 0){
            System.out.println("Nghiem phuong trinh bac hai ax^2+ bx + c la:"+ (-c/b));
        }
        int delta = b*b - 4*a*c;
        //endregion
    }
}
