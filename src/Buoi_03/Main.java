package Buoi_03;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        // Khai bao mang int - arrInt

        int[] arrInt;
        arrInt = new int[10];

        int[] vaInt = new int[10];
        vaInt[0] = 1;
        vaInt[1] = 2;
//        vaInt[10] = 10; // throw ArrayIndexOutOfBound

        System.out.println("Length : " + vaInt.length);
        System.out.println("Value : " + vaInt[0]);

        String[] arrLoves = new String[10];
        arrLoves[0] = "Lan";
        arrLoves[1] = "Hue";

        for (int i = 0; i < arrLoves.length; i++) {
            arrLoves[i] = "Love - " + i;
            System.out.println("Name: " + arrLoves[i]);
        }

        // Tao 1 mang kieu int size 50;
        int[] arr = new int[50];
        // Gan gia tri la so chan giam dan tu 120
        int index = 0;
        for (int value = 120; value > 0; value--) {
            if (value % 2 == 0) {
                //System.out.println("So chan: " + value);
                arr[index] = value;  // 48
                index++;
            }
            if (index == 50) {
//                System.out.println(arr[49]);
                break;
            }
        }
        // Tim vi tri so 68 trong mang va in ra vi tri do
        for (index = 0; index < arr.length; index++) {
            if (arr[index] == 68)
                System.out.print(arr[index] + " - Vi tri: " + index);
        }

        int[] arrTest = {1, 2, 4, 5, 77, 321, 434, 65};
        for (index = 0; index < arrTest.length; index++) {
            if (arrTest[index] == 77)
                System.out.println("\nVi tri: " + (index + 1));
        }

        // region Bai Kiem Tra

        /**
         * 4. Xây dựng chương trình: Mảng arr = {2,7,6,8,9,21,34,56,32,12,37}
         *    1. Tìm phần tử lớn nhất trong mảng và in ra thông tin
         *    2. Tính tổng số đầu tiên và số cuối cùng
         */

        int[] arrEx = {2, 7, 6, 8, 9, 21, 34, 56, 32, 12, 37};
        System.out.println("Length: " + arrEx.length);
        int maxValue = Integer.MIN_VALUE;
//        for (int i = arrEx.length - 1; i >= 0; i--) {
//            if (maxValue < arrEx[i])
//                maxValue = arrEx[i];
//        }
        for (int value : arrEx) {
            if (maxValue < value)
                maxValue = value;
        }

        // TO-DO: BTVN Su dung while de tim gia tri nho nhat

        System.out.println("Max Value: " + maxValue);
        System.out.println("Sum : " + (arrEx[0] + arrEx[arrEx.length - 1]));
        //


    }
}
