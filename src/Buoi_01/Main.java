package Buoi_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        numberConvert();
        // TODO: Implement your code here
        // V.Anh nay di hoc

        // Add comment for Git

        // region Project Hello World
        System.out.println("Van Anh");

        System.out.print("Van Anh ");
        System.out.print("Manh");
        System.out.println();

        System.out.printf("%s - %s\n", "Dung", "Quyet");
        String TXT_LOCATOR = "//div[@placeholder='%s']\n";
        System.out.printf(TXT_LOCATOR, "Vincent");
        System.out.printf(TXT_LOCATOR, "Phung");
        // endregion

        //region Coding comment
        // Comment code
        /**
         * Comment multi lines
         */
        /**
         *
         */
        //endregion

        // region Variable : Biến trong Java

        // region Init Variable
        int index = 10;     // Khai bao bien index va gan gia tri 10
        int index2;         // Khai bao bien index2
        index2 = 10;        // Gan gia tri index2 = 10
        //region Const
        final String TXT_LOCATOR_XPATH = "//div[@placeholder='%s']\n";
        // TXT_LOCATOR_XPATH ="New Tech";          // Cannot assign for a final var
        //endregion
        byte varByte = 1;
        byte temp = Byte.MAX_VALUE;
        short varShort = 1000;
        int varInt = 100000;
        int varMinInt = Integer.MIN_VALUE;
        long varLong = 100000000;
        float varFloat = 1.0f;
        double varDouble = 5.5d;
        boolean varBoolean = true;
        char varChar = 'A';

        System.out.println("Bien char: " + varChar);
        System.out.printf("Bien char: %s", varChar);

        // endregion

        // region Toán tử
        int N = 10;
        if (N % 2 == 0) {
            System.out.println("La so chan: " + N);
        } else {
            System.out.println("La so le: " + N);
        }

        String result = "So le ";
        if (N % 2 == 0) {
            result = "So chan ";
        }
        System.out.println(result + N);

        result = (N % 2) != 0 ? "So le " : "So chan";
        System.out.println(result + N);

        //region Toan tu mot ngoi
        int mResult = 3;
        mResult = mResult + 2;              // mResult = 5
        System.out.println("mResult 1: " + mResult);
        mResult += 2;                       // mResult = 7
        System.out.println("mResult 2: " + mResult);
        System.out.println("mResult 3: " + mResult--);
        //  System.out.println("mResult 3: " + mResult);
        //  mResult = mResult - 1;
        System.out.println("mResult 4: " + mResult);
        System.out.println("mResult 4: " + --mResult);
        //endregion

        int num1 = 5, num2 = 6;
        //        if(num1> 0 && num2 > num1) => TRUE
        //        if(num1> 7 && num2 > num1) => FALSE
        // endregion

        // region If - Else : Cấu trúc điều kiện
        /**
         * Ngu canh:
         * 0: - Troi nang/  1: - Troi mua
         * 11: - Di choi/   12: - Di hoc
         *
         */

        int weather = 0;
        if (weather == 1) {
            System.out.println("V.A o nha");
        }

        if (weather == 1) System.out.println("V.A o nha");

        // Troi mua  -> V.A o nha va troi nang V.A di choi
        if (weather == 1) {
            System.out.println("V.A o nha");
        } else {
            System.out.println("V.A di choi");
        }

        // Troi nang & V.A khong di hoc thi V.A di choi
        int goToSchool = 0;
        if (weather == 1) {
            System.out.println("V.A o nha");
        } else {
            if (goToSchool != 12) {
                System.out.println("V.A di choi");
            }
        }

        /**
         * Xep loai hoc sinh: Gioi = 10; Kha: 8 - 10; TB 5 - 8; Yeu : < 5
         */
        int score = 10;
        String rate = "Gioi";
        if (score < 5) {
            rate = "Yeu";
        } else if (score < 8) {
            rate = "TB";
        } else if (score < 10) {
            rate = "Kha";
        } else if (score == 10) {
            rate = "Gioi";
        }
        // endregion

        // region If - Else lồng : Cấu trúc điều kiện lồng

        // endregion

        // region If - Else bậc thang : Cấu trúc điều kiện bậc thang

        // endregion


        // region Switch case : Cấu trúc điều kiện

        int month = 8;
        switch (month) {
            case 6:
                System.out.println("Ju");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 7:
                System.out.println("Jul");
                break;
            default:
                System.out.println("Auto Test");
        }
        // endregion


        // endregion
    }

    private static void numberConvert() {
        int N = 261;
        String numText = "";
        int count = 0;
        while (true) {
            int tmpNum = N % 10;    // So du
            N = N / 10;
            count++;
            switch (count) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            if (N == 0) break;
        }



        // 261 -tmpNum = 1 ; N = 26
        // 26 - tmpNum = 6; N =2
        // 2  - tmpNum = 2; N=0

    }
}
