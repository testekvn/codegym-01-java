package Buoi_05;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Resolved_TestBuoi5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai KT");
        System.out.println("1. Xây dựng chương trình in ra số ngày của tháng. Ví dụ nhập vào tháng 1 -> Hiển thị số ngày là 31 và tháng là Feb\n");
        System.out.println("2. Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:\n" +
                "   - Tổng các số lẻ\n" +
                "   - Tổng các sổ chẵn\n" +
                "   - Giai thừa của số N\n" +
                "   - In ra dãy số fibonacci có trong N\n" +
                "   - In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7\n" +
                "   - In ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0\n" +
                "   - Điều kiện: 0<= N <= 100;");
        System.out.println("3. Viết chương trình giải phương trình bậc 2: ax2 + bx +c = 0\n");
        System.out.print("Nhập bài tập kiểm tra: ");
        while (true){
            int Test = sc.nextInt();
            if (Test == 0) break; //Dừng kiểm tra
            switch (Test){
                case 1:
                    //region TestJava Bai1
                    System.out.println("\nBài kiểm tra số 1: ");
                    System.out.println("Nhập tháng cần xem ngày: ");
                    int monthN = sc.nextInt();
                    switch (monthN){
                        case 1:
                            System.out.println("Số ngày của tháng Jan là 31 ngày!");
                            break;
                        case 2:
                            System.out.println("Số ngày của tháng Feb là 28 ngày!");
                            break;
                        case 3:
                            System.out.println("Số ngày của tháng Mar là 31 ngày!");
                            break;
                        case 4:
                            System.out.println("Số ngày của tháng Apr là 30 ngày!");
                            break;
                        case 5:
                            System.out.println("Số ngày của tháng May là 31 ngày!");
                            break;
                        case 6:
                            System.out.println("Số ngày của tháng Jun là 30 ngày!");
                            break;
                        case 7:
                            System.out.println("Số ngày của tháng Jul là 31 ngày!");
                            break;
                        case 8:
                            System.out.println("Số ngày của tháng Aug là 31 ngày!");
                            break;
                        case 9:
                            System.out.println("Số ngày của tháng Sep là 30 ngày!");
                            break;
                        case 10:
                            System.out.println("Số ngày của tháng Oct là 31 ngày!");
                            break;
                        case 11:
                            System.out.println("Số ngày của tháng Nov là 30 ngày!");
                            break;
                        case 12:
                            System.out.println("Số ngày của tháng Dec là 31 ngày!");
                            break;
                        default:
                            System.out.println("Tháng nhập không hợp lệ!");
                            break;
                    }
                    //endregion
                case 2:
                    //region TestJava Bai2
                    System.out.println("\nBài kiểm tra số 2: ");
                    System.out.println("Nhập số N (Điều kiện: 0<=N<=100): ");
                    while (true){
                        int N = sc.nextInt();
                        if (N<0 || N >100){
                            System.out.println("Số N nhập vào không hợp lệ nhập lại N: ");
                            break;
                        }
                        else {
                            int sumchan =0 , sumle = 0;
                            int giaithuaN = 1;
                            for (int i = 1; i <= N; i++){
                                if (i%2 == 0){
                                    sumchan +=i;
                                }
                                else {
                                    sumle +=i;
                                }
                                giaithuaN *=i;
                            }
                            System.out.println("Tong cac so le tu 1 den "+N+" la:" + sumchan);
                            System.out.println("Tong cac so chan tu 1 den "+N+ " la:"+ sumle);
                            System.out.println("Giai thừa của số "+N+ " la:"+ giaithuaN);
                            System.out.println("In ra toàn bộ dãy số và dừng lại khi có số nào đó chia hết cho 7: ");
                            for (int i = 1; i <= N; i++){
                                System.out.print(i+" ");
                                if (i %7==0){
                                    break;
                                }
                            }

                            int num1 = 1, num2 =1, num3 = num1+num2;
                            System.out.print("\nIn ra dãy số fibonacci có trong "+N+ ": \n"+ num1+" "+num2+" ");
                            while (num3<N){
                                System.out.printf(num3+" ");
                                num1 = num2;
                                num2 = num3;
                                num3 = num1+num2;
                            }

                            System.out.println("\nIn ra toàn bộ các dãy số trừ các số kết thúc (có số đơn vị) là số 0: ");
                            for (int i = 1; i <= N; i++) {
                                if (i %10 !=0){
                                    System.out.print(i+ " ");
                                }
                            }
                            break;
                        }
                    }
                    //endregion
                case 3:
                    //region TestJava Bai2
                    System.out.println("\nBài kiểm tra số 3: ");
                    System.out.println("Nhập số a:");
                    double a = sc.nextDouble();
                    System.out.println("Nhập số b: ");
                    double b = sc.nextDouble();
                    System.out.println("Nhập số c: ");
                    double c = sc.nextDouble();
                    if (a == 0){
                        System.out.println("Nghiệm của phương trình bậc hai: ax2 + bx +c = 0 la:"+ (-c/b));
                    }
                    double delta = b*b - 4*a*c;
                    if (delta > 0) {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("Phương trình có 2 nghiệm:");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        System.out.println("Phương trình có nghiệm:");
                        System.out.println("x = " + x);
                    } else {
                        System.out.println("Phương trình vô nghiệm.");
                    }
                    break;
                    //endregion
            }
            System.out.print("Nhập bài tập kiểm tra: ");
        }
    }
}
