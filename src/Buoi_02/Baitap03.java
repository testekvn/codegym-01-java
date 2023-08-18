package Buoi_02;

public class Baitap03 {
    public static void main(String[] args) {
        System.out.println("Bai 3");
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) System.out.print(i + " ");
            // 2 3 4 5 7 9 11 13 17 19 23 25 29 31 37 41 43 47 49 53 59 61 67 71 73 79 83 89 97
            // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        }
    }
}
