package Buoi_05;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tháng: ");
        month = scanner.nextInt();
            switch (month){
                case 2:
                    System.out.println("Tháng 2 có 28 hoặc 29 ngày - Feb ");
                    break;
                case 1:System.out.println("Tháng "+month+" có 31 ngày - Jan");
                    break;
                case 3:System.out.println("Tháng "+month+" có 31 ngày - Mar");
                    break;
                case 5:System.out.println("Tháng "+month+" có 31 ngày - May");
                    break;
                case 7:System.out.println("Tháng "+month+" có 31 ngày - Jul");
                    break;
                case 8:System.out.println("Tháng "+month+" có 31 ngày - Aug");
                    break;
                case 10:System.out.println("Tháng "+month+" có 31 ngày - Oct");
                    break;
                case 12:System.out.println("Tháng "+month+" có 31 ngày - Dec");
                    break;
                    
                case 4:System.out.println("Tháng "+month+" có 30 ngày - Apr");
                    break;
                case 6:System.out.println("Tháng "+month+" có 30 ngày - Jun");
                    break;
                case 9:System.out.println("Tháng "+month+" có 30 ngày - Sep");
                    break;
                case 11:System.out.println("Tháng "+month+" có 30 ngày - Nov");
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + month);
            }
    }
}
