package Buoi_02;

public class Bai1 {


    public static void main(String[] args) {
        System.out.println("Hình Chữ Nhật Là :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("j");
            }
            System.out.println("i");
        }

        System.out.println("Hình Tam Giác Là");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("j");
            }
            System.out.println("i");
        }
        System.out.println("Hình Tam Giác");
        for (int I=0; I<4; I++){
            for (int i=0; i<(4-I); i++){
                System.out.print("I");
            }
            System.out.println("i");
        }

        System.out.println("Hình Vuông Là ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("j");
            }
            System.out.println("i");
        }
    }
}