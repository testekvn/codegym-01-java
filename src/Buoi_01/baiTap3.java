package Buoi_01;
import java.util.Scanner;
public class baiTap3 {
    public static void main(String[] args) {
        int donVi = 2;
        String hangDonVi = null;
        int hangChuc01 = 3;
        String hangChuc = null;
        int hangTram01 = 4;
        String hangTram = null;
        switch (donVi){
            case 1:
                hangDonVi = "one";
                break;
            case 2:
                hangDonVi = "two";
                break;
            case 3:
                hangDonVi = "three";
                break;
            case 4:
                hangDonVi = "four";
                break;
            case 5:
                hangDonVi = "five";
                break;
            case 6:
                hangDonVi = "six";
                break;
            case 7:
                hangDonVi = "seven";
                break;
            case 8:
                hangDonVi = "eight";
                break;
            case 9:
                hangDonVi = "nine";
                break;
            default:
                break;
        }

        switch (hangChuc01){
            case 1:
                hangChuc = "ten";
                break;
            case 2:
                hangChuc = "twenty";
                break;
            case 3:
                hangChuc = "thirty";
                break;
            case 4:
                hangChuc = "fourty";
                break;
            case 5:
                hangChuc = "fifty";
                break;
            case 6:
                hangChuc = "sixty";
                break;
            case 7:
                hangChuc = "seventy";
                break;
            case 8:
                hangChuc = "eighty";
                break;
            case 9:
                hangChuc = "ninety";
                break;
            default:
                break;
        }

        switch (hangTram01){
            case 1:
                hangTram = "one hundred";
                break;
            case 2:
                hangTram = "two hundred";
                break;
            case 3:
                hangTram = "three hundred";
                break;
            case 4:
                hangTram = "four hundred";
                break;
            case 5:
                hangTram = "five hundred";
                break;
            case 6:
                hangTram = "six hundred";
                break;
            case 7:
                hangTram = "seven hundred";
                break;
            case 8:
                hangTram = "eight hundred";
                break;
            case 9:
                hangTram = " nine hundred";
                break;
            default:
                break;
        }

        if (donVi > 0 && donVi <10){
            System.out.println("Doc so la: " + hangDonVi+" " + hangChuc+" " + hangTram);
        }

    }
}
