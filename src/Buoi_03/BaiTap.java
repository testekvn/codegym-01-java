package Buoi_03;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        // region [Bài tập 1] Xoá phần tử khỏi mảng
//        int[] arrDel = {10, 3, 5, 7, 1, 0, 4, 0};
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhap phan tu can xoa: ");
////        int index = sc.nextInt();
//
////        if (index <= 0 && index > arrDel.length){
////              System.out.println("Ban nhap vuot qua so luong phan tu trong mang hoac nho hon 0");
////        } else {
////            for (int i = 0; i < arrDel.length; i++) {
////            if (index == arrDel[i]){
////                System.out.println();
////            }
////        }
////        }
//
//        //endregion
//
        // region Bai tap 01
        // 1. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
        //   1. In ra list theo thứ tự giảm dần.
        //   2. Chỉ ra vị trí số 77 trong list(Array)
            int[] arrInt = new int[28];
            int index = 0;
            for (int i = 200; i > 10; i--) {
            if (i % 7 ==0 && i% 5 !=0){
                System.out.print(i + " ");
                arrInt[index] = i;
                index++;
            }
            if (index == 28){
                break;
            }
        }
        System.out.println("\n");
        for ( index = 0; index < arrInt.length; index++) {
            if (arrInt[index] == 77){
                System.out.println(arrInt[index] + " - Vi tri: " + index);
            }
        }
        //endregion 01


        //region Bai tap 2
        int i = 100000;
        while ( i < 999999) {
            int[] arrNumber = new int[6]; //tao mang gan tung value voi index de so sanh vị tris
            int number = i;
            for (int j = 5; j >= 0; j--) {
                arrNumber[j] = number % 10;
                number = number / 10;
            }
            if(arrNumber[0] == arrNumber[5] && arrNumber[1] == arrNumber[4] && arrNumber[3] ==arrNumber[2]){
                System.out.println(arrNumber[0] + "" + arrNumber[1] + arrNumber[2] + arrNumber[3] + arrNumber[4] + arrNumber[5]);
            }
            i++;
        }


    }
}
