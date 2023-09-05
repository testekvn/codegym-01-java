package Buoi_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        //region for

        for (int i = 1; i <= 10; i++) {

        }

        for (int i = 1; i < 11; i++) {

        }

        System.out.println("So le");
        for (int val = 200; val >= 10; val--) {
            if (val % 2 == 1) System.out.print(" " + val);
        }


        // Create a integer list  from 0 to 14
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            integerList.add(i);
        }

        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        System.out.println();
        System.out.println(integerList);
        System.out.println("Print a list: ");
        for (int val : integerList) { // for(i= 0; i<=14; i++) {int val = list.get(i)}
            System.out.print(val + " ");
        }

        System.out.println("\nLambda in Java: \n");
        integerList.forEach(v -> System.out.print(v + "  "));

        //endregion

        //region while

        System.out.println("\n While: \n");
        int count = 0;
        while (count < 5) {
            System.out.println(" " + count);
            count++;
            //if (count >= 5) break;
        }

        System.out.println("\n\n While true:");
        count = 0;
        while (true) {
//            if (count<5){
//                System.out.println(" " + count);
//                count++;
//            }else break;

            if (count >= 5) break;
            System.out.println(" " + count);
            count++;
        }

        // In ra so le tu 0 - 100;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }

        int value = 0;
        while (true) {
            if (value % 2 == 1)
                System.out.println(value);
            value++;
            if (value > 100) break;
        }

        value = 0;
        while (value < 100) {
            // Neu value = 3 thi se tiep tuc va khong xu ly cac ham phia sau
            if (value == 3) {
                value++;
                continue;
            }
            if (value % 2 == 1)
                System.out.println(value);
            value++;
        }

        //endregion

        //region do-while

        System.out.println("Do - While: \n");
        count = 0;
        do {
            // chay o day 1 lan
            System.out.println(count);
            count++;
        } while (count < 0);

        //endregion

        //region for-each

        int num = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("enter your number: ");
            num = sc.nextInt();
            sum+= num;
        }while (num!= 0);
        System.out.println(sum);
        //endregion

        //region break

        //endregion

        //region continue

        //endregion


    }
}
