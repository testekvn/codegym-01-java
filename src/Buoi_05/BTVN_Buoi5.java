package Buoi_05;
import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

import static Buoi_02.Main.songuyento;

public class BTVN_Buoi5 {
    public static void main(String[] args) {
        /*
        1. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
        2. In ra màn hình phân loại số với điều kiện như sau:
            - Số lẻ -> Print "Weird"
            - Số chẵn & trong khoảng [2,5] -> Print "Not Weird"
            - Số chẵn & trong khoản [6, 20] -> Print "Weird"
            - Số chẵn & > 20 -> Print "Not Weird"<br/>
            Số N được nhập từ bàn phím (1<= N <=100)

        3.Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:
            - In ra dãy số nguyên tố có trong N
            - In ra dãy số fibonacci có trong N
            - Điều kiện: 0<= N <= 100;
         */

        //region Bai1
        System.out.println("Bai1 Nhap so nguyen: ");
        Scanner sc = new Scanner(System.in);
        int so1 = sc.nextInt();
        int sumchuso = 0;
        while (so1>0){
            int temp = so1 %10;
            sumchuso += temp;
            so1 /= 10;
        }
        System.out.println("Tong cac chu so cua so nguyen la: "+sumchuso);
        //endregion

        //region Bai2
        System.out.println("Bai2 Nhap so N (1<= N <=100): ");
        int N = sc.nextInt();
        if (1<= N && N <=100){
            if (N%2 !=0){
                System.out.println("Weird");
            } else if ((N%2 ==0)&& 2<=N && N <=5) {
                System.out.println("Not Weird");
            } else if ((N%2 ==0)&& 6<=N && N <=20) {
                System.out.println("Weird");
            } else if ((N%2 ==0)&& N > 20) {
                System.out.println("Not Weird<br/>");
            }
        }
        else System.out.println("So N khong thoa man dieu kien nhap!");
        //endregion

        //region Bai3

        System.out.println("Bai3 Nhap so N (Điều kiện: 0<= N <= 100): ");
        int N3 = sc.nextInt();
        System.out.println("dãy số nguyên tố có trong "+N3+" la:");
        for (int i =0; i<N; i++){
            if (songuyento(i)){
                System.out.print(i+ " ");
            }
        }
        int num1 = 1, num2 = 1, num3 = num1+num2;
        System.out.println("In ra dãy số fibonacci có trong "+N3+ ": \n"+ num1+" "+num2+" ");
        while (num3<N3){
            System.out.printf(num3+" ");
            num1 = num2;
            num2 = num3;
            num3 = num1+num2;
        }
        //endregion
    }
}
