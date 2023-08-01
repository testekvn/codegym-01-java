//package Buoi_00.chua_btvn;
//
//import java.util.Scanner;
//
//public class PhungDH {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.println("Mời bạn nhập số:");
//        String num = sc.nextLine();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Bang cuu chuong voi so vua nhap:" + num * i);
//        }
//    }
//
//    // Bài 1
//    public static void bai01(String[] args) {
//        String hoten;
//        String birth;
//        String chuyennganh;
//        String muctieu;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ho ten:");
//        String hoten = sc.nextLine();
//        System.out.println("Ngay//thang//nam sinh:");
//        String birth = sc.nextLine();
//        System.out.println("Chuyen nganh hoc:");
//        String chuyennganh = sc.nextLine();
//        System.out.println("Muc tieu hoc:");
//        String muctieu = sc.nextLine();
//        System.out.println(".................................");
//        System.out.println("%s %s %s %s" + hoten + birth + chuyennganh + muctieu);
//
//    }
//    // Bài 2
//
//    // Bài 3
//    public static void bai03(String[] args) {
//        int num;
//        System.out.println("Mời bạn nhập số:");
//        String num = sc.nextLine();
//        System.out.println("%d\n" + num);
//        if (num % 2 == 0) {
//            System.out.println("Đây là số chẵn!");
//        } else {
//            System.out.println("Đây là số lẻ!");
//        }
//    }
//
//    //Bài 4
//    public static void bai04(String[] args) {
//        int mang[] = new int[]{2, 7, 6, 8, 9, 21, 34, 56, 32, 12, 37};
//        int max = mang[0];
//        int min = mang[0];
//        int tong = mang[0] + mang[10];
//        for (int i = 0; i < mang.lenght; i++) {
//            if (mang[i] < min {
//                min = mang[i];
//            }
//            if (mang[i] > max) {
//                max = mang[i];
//            }
//        }
//        System.out.println("so nho nhat" + min);
//        System.out.println("so nho nhat" + max);
//        System.out.println("Tong dau cuoi" + tong);
//    }
//
//    // Bài 5
//    public static void bai05(String[] args) {
//        double a, b, c, x1, x2, delta;
//        String ketQua = "";
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.print("Nhập a (a # 0): ");
//            a = scanner.nextDouble();
//        } while (a == 0);
//        System.out.print("Nhập b: ");
//        b = scanner.nextDouble();
//        System.out.print("Nhập c: ");
//        c = scanner.nextDouble();
//        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: " + a + "x^2 + " + b + "x + " + c + " = 0");
//        delta = b * b - 4 * a * c;
//
//        if (delta < 0) {
//            ketQua = "Phương trình vô nghiệm!";
//        } else if (delta == 0) {
//            x1 = x2 = -b / (2 * a);
//            System.out.println("Phương trinh có nghiệm kép là x1 = x2 = " + x1);
//        } else {
//            x1 = (-b + Math.sqrt(delta)) / (2 * a);
//            x2 = (-b - Math.sqrt(delta)) / (2 * a);
//            ketQua = "Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2;
//        }
//        System.out.println(ketQua);
//
//    }
//}
