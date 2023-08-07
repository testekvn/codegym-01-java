package Buoi_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //region Bai1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello: "+ name);
        //endregion
        //region Bai2
        System.out.println("Nhap so tien USD: ");
        double vnd = 23000;
        double usd = sc.nextDouble();
        double rate = usd * vnd;
        System.out.println("So tien sau khi quy doi la: " + rate + "vnd");
        //endregion

    }
}
