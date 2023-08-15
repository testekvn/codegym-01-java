package Buoi_03;

import java.util.Scanner;

public class BaiTap03 {
    public static void main(String[] args) {
//        System.out.println("Nhap so nguyen: ");
//        Scanner s6 = new Scanner(System.in);
//        int number6 = s6.nextInt();
//        System.out.println("Phan tich so nguyen "+ number6+" thanh cac thua so nguyen to la: ");
//        for (int i = 2; i <= number6; i++){
//            while ( number6 % i == 0){
//                System.out.print(i);
//                number6 /= i;
//                if (number6 > 1) {
//                    System.out.print(" x ");
//                }
//            }
//        }

        int number = 114;
        int heSo = 16;
        int sodu;
        StringBuilder strNumber = new StringBuilder();
        while (true){
            if (number<heSo){
                strNumber.append(number);
                break;
            }
            sodu = number% heSo;
            number = number/heSo;
            strNumber.append(sodu);
        }
        System.out.println(strNumber.reverse());
    }
}
