package Buoi_11;

import java.util.Random;
import java.util.Scanner;

public class ExceptionSolution {
    public static void main(String[] args) {
        // region Cac loi thuong gap
        System.out.println("Debug: START ------------------------------------------");
        int[] arr = {0, 1, 3};
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        try {
            // Implement your code
            System.out.println(arr[3]);
            System.out.println("VDebug - After exception");
        } catch (Exception e) {
            System.out.println("VDebug - Exception Block");
            System.out.println("VDebug: " + e);
            // Trien khai Exception block con - Loi CheckedException
            // } catch (ArrayIndexOutOfBoundsException e) {
            //   System.out.println("VDebug - ArrayIndexOutOfBoundsException Block");
            //   System.out.println("VDebug: " + e);
        } finally {
            System.out.println("VDebug - Finally Block");
        }
        System.out.println("Debug: END ------------------------------------------\n");
        //endregion

        //region Exception: Chia cho 0
        System.out.println("Debug: START Chia cho 0 ------------------------------------------");
//        Student student = null;
//        try {
//            student.getDoB();
//            int a = 10 / 0;
//            //File file = new File((String) null);
//        } catch (NullPointerException e) {
//            System.out.println("VDebug - Exception:  " + e);
//        } catch (Exception e) {
//            System.out.println("VDebug - Exception:  " + e);
//        } finally {
//
//        }


        System.out.println("Debug: END Chia cho 0 ------------------------------------------\n");
        //endregion
        // region Vi du Exception
        // This is Checked Exception
//        try {
//            System.out.println("Checked Exception");
//        } catch (JavaCheckedException e) {
//            System.out.println(e.getMessage());
//        }

        // This is Checked Exception
//        try {
//            System.out.println("UnChecked Exception");
//        } catch (JavaUnCheckedException e) {
//            System.out.println(e.getMessage());
//        }

        // Implement customized exception
//        try {
//            new Scanner(new File("fileName"));
//        } catch (FileNotFoundException e) {
//            throw new JavaUnCheckedException("Vincent");
//        }

        //endregion

        printArrayValue();
    }

    public static void printArrayValue() {
        System.out.println("\nVDebug printArrayValue -----------------------");
        // Init array
        int[] arr = new int[100];
        System.out.println("Your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.print(arr[i] + " ");
        }

        // User configuration
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nPlease insert the index to get value from array\n" +
                "The index value should be from 0 - 100 and you have 5 times");
        int count = 0;
        while (count < 5) {
            try {
                System.out.printf("The %s times: ", (++count));
                int index = sc.nextInt();
                sc.nextLine();
                System.out.println("Your value: " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Your index is invalid, Please try again!!!");
            } catch (Exception e) {
                System.out.println("Exception occurred." + e);
            }
        }

    }
}
