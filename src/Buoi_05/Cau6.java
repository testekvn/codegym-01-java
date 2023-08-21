package Buoi_05;

import java.util.Scanner;

public class Cau6 {
    public static void main(String[] args) {
    int n;
        System.out.println("Nhâp số n: ");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
        for (int i=0;i<=n;i++){
        if(i%2==1){
            System.out.print(" Weird");
        }else if(i>1&&i<5){
            System.out.print(" NotWeird");
        } else if (i>5&&i<21) {
            System.out.print(" Weird");
        } else if (i>20) {
            System.out.print(" NotWeird");
        } else System.out.print(" "+i);
    }
}
}
