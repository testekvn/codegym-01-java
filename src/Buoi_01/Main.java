package Buoi_01;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        do {
            System.out.println("-----Menu chức năng-----");
            System.out.println("1. Hiển thị thời gian hệ thống");
            System.out.println("2. Khai báo và sử dụng biến");
            System.out.println("3. Sử dụng toán tử");
            System.out.println("4. Giải phương trình bậc nhất");
            System.out.println("5. Tính số ngày trong tháng");
            System.out.println("6. Kiểm tra năm nhuận");
            System.out.println("7. Tính chỉ số cơ thể");
            System.out.println("8. Hiển thị lời chào");
            System.out.println("9. Chuyển đổi tiền tệ");
            System.out.println("10.Đọc số thành chữ ");
            System.out.println("11. Thoát");
            System.out.println("---Mời bạn chọn từ 1-11--- ");
            Scanner scanner = new Scanner(System.in);
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    Date time = new Date();
                    System.out.println("Hệ thống đang là: " + time);
                    break;
                case 2:
                    int i = 10;
                    float f = 20.5f;
                    double d = 20.5;
                    boolean logic = true;
                    char c = 'a';
                    String s = "Hà nội";
                    System.out.println("i = " + i);
                    System.out.println("f = " + f);
                    System.out.println("d = " + d);
                    System.out.println("logic = " + logic);
                    System.out.println("c = " + c);
                    System.out.println("String = " + s);
                    break;
                case 3:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập chiều dài(mét): ");
                    double dai = scanner1.nextDouble();
                    System.out.println("Mời bạn nhập chiều rộng(mét): ");
                    double rong = scanner1.nextDouble();
                    double S = dai * rong;
                    System.out.println("Diện tích hình chữ nhật là: " + S + "mét vuông");
                    break;
                case 4:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhập hệ số a: ");
                    double A = scanner2.nextDouble();
                    System.out.println("Nhập hệ số b: ");
                    double B = scanner2.nextDouble();
                    System.out.println("Nhập hệ số c: ");
                    double C = scanner2.nextDouble();
                    System.out.println("Phương trình vừa nhập:" + A + "x + " + B + " = " + C);
                    if (A != 0) {
                        System.out.println("Phương trình có 1 nghiệm duy nhất x= "+(C-B)/A);
                    }else if(B==C && B==0) {
                        System.out.println("Phương trình có vô số nghiệm");
                    }else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                    break;
                case 5:
                    Scanner scanner3= new Scanner(System.in);
                    System.out.println("Mời bạn nhập tháng: ");
                    int month = scanner3.nextInt();
                    switch (month){
                        case 2:
                            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                            break;
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("Tháng "+month+" có 31 ngày");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Tháng "+month+" có 30 ngày");
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + month);
                    }
                    break;
                case 6:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập năm: ");
                    int year = scanner4.nextInt();
                    if (year%100==0){
                        if(year%400==0){
                            System.out.println("Năm "+year+" là năm nhuận");
                        }else {
                            System.out.println("Năm "+year+" không phải là năm nhuận");
                        }
                    }else if (year%4==0){
                        System.out.println("Năm "+year+" là năm nhuận");
                    }else {
                        System.out.println("Năm "+year+" không phải là năm nhuận");
                    }
                    break;
                case 7:
                    Scanner scanner5= new Scanner(System.in);
                    System.out.println("Mời bạn nhập chiều cao (mét): ");
                    double h = scanner5.nextDouble();
                    System.out.println("Mời bạn nhập cân nặng (kg): ");
                    double w = scanner5.nextDouble();
                    double bmi= w/Math.pow(h, 2);
                    System.out.println("Chiều cao của bạn là: "+h+" mét");
                    System.out.println("Cân nặng của bạn là: "+w+" kg");
                    if(bmi<18.5) System.out.println("Chỉ số bmi của bạn là: "+bmi+" -bạn đang ở mức Underweight");
                    if(bmi<25.0 && bmi>=18.5) System.out.println("Chỉ số bmi của bạn là: "+bmi+" -bạn đang ở mức Normal");
                    if(bmi<30.0 && bmi>=25.0) System.out.println("Chỉ số bmi của bạn là: "+bmi+" -bạn đang ở mức Overweight");
                    if(bmi>=30.0) System.out.println("Chỉ số bmi của bạn là: "+bmi+" -bạn đang ở mức Obese");
                    break;
                case 8:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("Nhập tên của bạn: ");
                    String name = scanner6.nextLine();
                    System.out.println("Hello: "+ name);
                    break;
                case 9:
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập số tiền cần chuyển đổi");
                    long dola = scanner.nextLong();
                    long money = dola * 23000;
                    System.out.println(dola+" USD = "+money+" Vnđ");
                    break;
                case 10:
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("Mời bạn nhập số cần đọc: ");
                    int num = scanner8.nextInt();
                    int a = num%10;
                    int b = (num/10)%10;
                    if (num==0) System.out.println(num+"-Không");
                    if(num<10){
                        switch (a){
                            case 1:
                                System.out.println(a+ "-Một");
                                break;
                            case 2:
                                System.out.println(a+ "-Hai");
                                break;
                            case 3:
                                System.out.println(a+ "-Ba");
                                break;
                            case 4:
                                System.out.println(a+ "-Bốn");
                                break;
                            case 5:
                                System.out.println(a+ "-Năm");
                                break;
                            case 6:
                                System.out.println(a+ "-Sáu");
                                break;
                            case 7:
                                System.out.println(a+ "-Bảy");
                                break;
                            case 8:
                                System.out.println(a+ "-Tám");
                                break;
                            case 9:
                                System.out.println(a+ "-Chín");
                                break;
                        }

                    }
                    break;
                default:
                    System.out.println("Tạm biệt");
                    cont = false;
                    break;
            }
        } while (cont);
    }
}
