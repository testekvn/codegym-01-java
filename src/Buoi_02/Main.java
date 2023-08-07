package Buoi_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hinh chu nhat");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }

        System.out.println("Hinh tam giac");
        for (int i = 7; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println("*  ");
        }

        System.out.println("Hinh vuong");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*  ");
            }
            System.out.println("*  ");
        }
    }
}
