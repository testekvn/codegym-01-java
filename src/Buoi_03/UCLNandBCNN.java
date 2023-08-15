package Buoi_03;

import java.util.Scanner;

public class UCLNandBCNN {
    public static void main(String[] args) {
        int a,b,ucln = 0,bcnn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0 && b%i==0)
                ucln = i;
        }
        System.out.println("Ước chung lớn nhất là: "+ ucln);
        bcnn= (a*b)/ucln;               //Công thức tính BCNN theo UCLN
        System.out.println("Bội chung nhỏ nhất là: "+bcnn);


    }
}
