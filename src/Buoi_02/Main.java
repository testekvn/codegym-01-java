package Buoi_02;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region Bai1
        System.out.println("This is menu to draw");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Please click the number to draw picture or exit: ");

        while (true){
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if (option == 4) break;
            switch (option){
                case 1:
                    System.out.println("The rectangle(10x3):");
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 10; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle:");
                    System.out.println("The corner: top-left:");
                    for (int i = 5; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("The corner: top-right:");
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j < i; j++){
                            System.out.print(" ");
                        }
                        for (int j = i; j < 5; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner: botton-left:");
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("The corner: botton-right:");
                    for (int i = 5; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 5 - i +1; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Isosceles triangle: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            if (i == 0|| j == i || j == 7 - i - 1) {
                                System.out.print("* ");
                            } else System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Error, please try again");
            }
            System.out.print("Please click the number to draw picture or exit: ");;
        }
        //endregion
        //region Bai2
        System.out.print("Số lượng số nguyên tố cần in ra là: ");
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers){
            if (songuyento(N)){
                System.out.print(N+ " ");
                count++;
            }
            N++;
        }
        System.out.println();
        //endregion
        //region Bai3
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int i =2; i < 100; i++){
            if (songuyento(i)){
                System.out.print(i+" ");
            }
        }

        //region for basic
//        for (int i = 0; i < 210 ; i++) {
//            if (i %2 !=0){
//                System.out.println("i la so le: " + i);
//            }
//        }
        //endregion

        //region foreach
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            integerList.add(i);   //[0,1,2,..14]
//        }
//        System.out.println(integerList);
//        System.out.println("List:");
//        for (int val :integerList){
//            System.out.print(val+" ");
//        }
        //endregion

        //region while
//        int count =0;
//        System.out.println("Cac so le tu 0 den 100: ");
//        while (count <100){
//            if(count % 2 != 0)
//                System.out.print(count + " ");
//            count++;
//        }
        //endregion while

        //region do-while
//        int count1 =0;
//        do {
//            //chay o day 1 lan
//            System.out.println(count1);
//        }
//        while (count1 <0);

        //region foreach
//        List<Integer> integerList = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            integerList.add(i);   //[0,1,2,..14]
//        }
//        System.out.println(integerList);
//        System.out.println("List:");
//        for (int val :integerList){
//            System.out.print(val+" ");
//        }
        //endregion

        //region while
//        int count =0;
//        System.out.println("Cac so le tu 0 den 100: ");
//        while (count <100){
//            if(count % 2 != 0)
//                System.out.print(count + " ");
//            count++;
//        }
        //endregion while

        //region do-while
//        int count1 =0;
//        do {
//            //chay o day 1 lan
//            System.out.println(count1);
//        }
//        while (count1 <0);
        //endregion
    }
    //region kiem tra so nguyen to
    public static boolean songuyento(int num){
        if (num < 2){
            return false;
        }
        for (int i =2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    //endregion kiem tra so nguyen to
}
