package Buoi_02;

public class Baitap03 {
    public static void main(String[] args) {
        System.out.println("Bai 3");
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) check = false;
            }
            if (check) System.out.print(i + " ");
        }
    }
}
