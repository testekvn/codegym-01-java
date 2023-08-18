package Buoi_05;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {

        //region Viết chương trình giải phương trình bậc 2: ax2 + bx +c = 0
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so a: ");
//        double numA = sc.nextDouble();
//        System.out.println("Nhap so b: ");
//        double numB = sc.nextDouble();
//        System.out.println("Nhap so c: ");
//        double numC = sc.nextDouble();
//        double x1, x2;
//        double delta = (numB*numB) - (4*numA*numC);
//        if (numA!=0){
//            if (delta<0){
//                System.out.println("Pt vo nghiem");
//            } else if (delta == 0) {
//                x1=-(numB/(2*numA));
//                System.out.println("x1 = x2 " + x1);
//            } else {
//                x1 = (-numB + Math.sqrt(delta)) / (2 * numA);
//                x2 = (-numB - Math.sqrt(delta)) / (2 * numA);
//                System.out.printf("x1 = %f va x2 = %f", x1, x2);
//            }
//        } else {
//            x1= -(numC/numB);
//            System.out.println("pt co nghiem " + x1);
//        }

        // endregion

        //region Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
        System.out.println("Nhap một số nguyên bất kỳ :");
        int num = sc.nextInt();
        String strNumber = "" + num;
        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
        }
        System.out.printf("tổng các chữ số của %d la %d", num, sum);
        //endregion


        System.out.println("\n");
        // region  3.Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:
        System.out.println(" 3.Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau: ");
        System.out.println("Nhap so N : ");
        int numB = sc.nextInt();
        int numOne = 0;
        System.out.println("In ra dãy số nguyên tố có trong N");
        for (int i = 2; i < numB; i++) {
            boolean result = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i% j ==0){
                    result = false;
                    break;
                }
            }
            if (result) System.out.print(i + " ");

        }
        // endregion
    }
}
