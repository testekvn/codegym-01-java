package Buoi_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
//        equal ss giá trị của chuỗi ;
//                == ss giá trị ô nhớ ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        int UCLN = UCLN(a, b);
        int BCNN = BCNN(a, b);

        System.out.println("Ước số chung lớn nhất là " + UCLN);
        System.out.println("Bội số chung nhỏ nhất nhất là " + BCNN);

    }

    private static int BCNN(int a, int b) {

        return (a*b)/UCLN(a,b);
    }

    private static int UCLN(int a, int b) {
            While(a!=b);{
                if(a>b){
                    a = a -b;
                }
                else b = b -a;
        }
        return a;
    }

    private static void While(boolean b) {
    }

}





