package Buoi_05;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        //region tổng số chẵn
        int N = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                N += i;
            }
        }

        System.out.println("Tổng các số chẵn là : " + N);
        //endregion
        //region tổng số lẻ
        int M = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                M += i;
            }

        }
        System.out.println("Tổng các số lẻ là : " + M);
        //endregion
        //region Giai thừa
        System.out.println("Tính giai thừa của số: ");
        Scanner scanner2 = new Scanner(System.in);
        int Number = scanner2.nextInt();
        long fac = 1;
        for (int i = 1; i <= Number; i++) {
            fac = fac * i;
        }
        System.out.println("Giai thừa của " + Number + " là: " + fac);
        //endregion
        //region In ra số chia cho 7 thì dừng
        int num=0;
        System.out.println("In ra toàn bộ và dừng lại khi chia hết cho 7 là:");
        while (num>=0){
            num++;
            System.out.println(" "+num);
            if (num%7==0)
                break;
        }
        //endregion
        //region in ra toàn bộ các số trừ các số kết thúc có đơn vị là 0
        System.out.println("Các số là :");
        for(int Num = 0;Num<=100;Num++){
            if(Num%10!=0){
                System.out.println("kết quả là "+Num);
            }
        }
        //endregion
    }


}



