package Buoi_02;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        do {
            System.out.println("-----Menu chức năng-----");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Tính tiền lãi cho vay");
            System.out.println("3. Tìm ước chung lớn nhất");
            System.out.println("4. Thiết kế menu cho ứng dụng");
            System.out.println("5. Hiển thị các loại hình");
            System.out.println("6. Hiển thị 20 số nguyên tố đầu tiên");
            System.out.println("7. Hiển thị các số nguyên tố nhỏ hơn 100");
            System.out.println("8. Thoát");
            System.out.println("---Mời bạn chọn từ 1-8--- ");
            Scanner scanner = new Scanner(System.in);
            int chon = scanner.nextInt();
            switch (chon){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Mời bạn nhập số bất kỳ:");
                    int number = scanner1.nextInt();
                    if (number < 2){
                        System.out.println(number + " không phải là số nguyên tố");
                    } else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check)
                            System.out.println(number + " là số nguyên tố");
                        else
                            System.out.println(number + " không phải là số nguyên tố");
                    }
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Nhập số tiền cần gửi: ");
                    double money = scanner2.nextDouble();
                    System.out.println("Nhập số tháng gửi: ");
                    int month = scanner2.nextInt();
                    System.out.println("Tỉ lệ lãi suất (%/năm): ");
                    double p = scanner2.nextDouble();
                    double tienLai = money * (p/12) * month;
                    System.out.println("Bạn vừa gửi số tiền: "+ money+" trong vòng: "+month+" tháng với lãi suất: "+p+" %/năm.");
                    System.out.println("Số tiền lãi là: "+ tienLai);
                    break;
                case 3:
                    int a, b;
                    Scanner nhap = new Scanner (System.in);
                    System.out.println("Nhap so thu nhat: ");
                    a = nhap.nextInt();
                    System.out.println("Nhap so thu hai: ");
                    b = nhap.nextInt();
                    if(a < 0)
                        a = -a;
                    if(b < 0)
                        b = -b;
                    if (a == 0 && b == 0)
                        System.out.println("Khong co uoc so chung lon nhat");
                    else
                    {
                        while (a!= 0 && b!= 0)
                        {
                            if(a > b)
                                a = a%b;
                            else
                                b = b%a;
                        }
                        if (a == 0)
                            System.out.println("UCLN là : "+b); //b la USCLN.
                        else
                            System.out.println("UCLN là: "+a); //a la USCLN.
                    }
                    break;
                case 4:
                    int choice = -1;
                    Scanner scanner3 = new Scanner(System.in);
                    while (choice!=0) {
                        System.out.println("---Menu---");
                        System.out.println("1. Draw the triangle");
                        System.out.println("2. Draw the square");
                        System.out.println("3. Draw the rectangle");
                        System.out.println("0. Exit");
                        System.out.println("Enter your choice: ");
                        System.out.println("Mời bạn chọn từ 0-3:");
                        choice = scanner3.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Draw the triangle");
                                System.out.println("******");
                                System.out.println("*****");
                                System.out.println("****");
                                System.out.println("***");
                                System.out.println("**");
                                System.out.println("*");
                                break;
                            case 2:
                                System.out.println("Draw the square");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                break;
                            case 3:
                                System.out.println("Draw the rectangle");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                System.out.println("* * * * * *");
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println("!!!!!!!!");

                        }
                    }
                    break;
                case 5:
                    int chose;
                    int height;
                    int width;
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Nhập chiều dài: ");
                    height = scanner4.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    width = scanner4.nextInt();

                    System.out.println("1. In hình cữ nhật");
                    System.out.println("2. In hình tam giác");
                    System.out.println("Mời bạn chọn in hình: ");
                    chose = scanner4.nextInt();
                    switch (chose){
                        case 1:
                            for (int i=0;i<=height;i++){
                                for(int j=0;j<=width;j++){
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i=0;i<height;i++){
                                for (int j=0;j<=i;j++){
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                    }

                    break;
                case 6:
                    int c=0;
                    int status = 1;
                    int snt = 3;
                    System.out.println("20 số nguyên tố đầu tiên là:");
                    System.out.println(2);
                    for ( int i = 2 ; i <=20 ;  )
                    {
                        for ( int j = 2 ; j <= Math.sqrt(snt) ; j++ )
                        {
                            if ( snt%j == 0 )
                            {
                                status = 0;
                                break;
                            }
                        }
                        if ( status != 0 )
                        {
                            System.out.println(snt);
                            i++;
                            c++;
                        }
                        status = 1;
                        snt++;
                    }
                    break;
                case 7:
                    for (int num = 1; num < 100; ++num)
                    {
                        int cout = 0; // đếm số ước của a
                        for (int i = 2; i <= Math.sqrt(num); i++)
                        {
                            if (num % i == 0)
                            {
                                cout++;
                            }
                        }
                        if (cout == 0 && num > 1)
                            System.out.println(""+ num);
                    }
                    break;
                default:
                    System.out.println("Tạm biệt");
                    cont = false;
                    break;

            }
       }while (cont);

    }
    }
