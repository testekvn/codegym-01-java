package Buoi_02;

public class Bai2 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0 && i > 1)
                System.out.println("" + i);
        }
    }
}
