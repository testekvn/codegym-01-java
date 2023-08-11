package Buoi_03;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        // region Xoá giá trị trong mảng và gán giá trị đã xoá bằng 0
//        int[] arrDelVal = {1, 5, 4, 6, 2, 8};
        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap gia tri can xoa: ");
//        int value = sc.nextInt();
//        for (int i = 0; i < arrDelVal.length; i++) {
//            if (arrDelVal[i] == value){
//                arrDelVal[i] = 0;
//            }
//        }
//        System.out.println("Mang sau khi xoa gia tri");
//        for (int j : arrDelVal) {
//            System.out.print(j + " ");
//        }
         // endregion

        System.out.println("\n");
        // region Xoá vị trí trong mảng và gán = 0
//        int[] arrDelIn = {1, 2, 3, 6, 4, 8};
//        System.out.print("Nhap vi tri can xoa: ");
//        int vitri = sc.nextInt();
//        arrDelIn[vitri-1] = 0;
//        System.out.println("Mang sau khi xoa phan tu: ");
//        for (int j: arrDelIn) {
//            System.out.print(j + " ");
//        }
        // endregion

        //region Xoá giá trị trong mảng và mảng sẽ được đẩy các giá trị sau

        int[] arrDelUpdate = {1, 2, 3, 6, 4, 8};
        System.out.print("Nhap gia tri can xoa: ");
        int valueUpdate = sc.nextInt();
        int vitri=0;
        for (int i = 0; i < arrDelUpdate.length; i++) {
            if (arrDelUpdate[i] == valueUpdate){
                vitri = i;
            }
        }
        for (int i = vitri; i < arrDelUpdate.length; i++) {
            if (i == arrDelUpdate.length-1){
                arrDelUpdate[i] = 0;
            } else {
                arrDelUpdate[i] = arrDelUpdate[i+1];
            }
        }
        for (int j : arrDelUpdate) {
            System.out.print(j + " ");
        }
        //endregion
    }
}
