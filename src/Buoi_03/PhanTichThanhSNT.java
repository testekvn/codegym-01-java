package Buoi_03;
import java.util.Scanner;
public class PhanTichThanhSNT {
    public static void main(String[] args) {
        int n;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        n = nhap.nextInt();
        while(n<2)
        {
            System.out.println("Ban vua nhap mot so khong hop le.Vui long nhap lai: ");
            n = nhap.nextInt();
        }
        for(int i=2; i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                if(n==1)
                    System.out.print(i);
                else
                    System.out.print(i+" x ");
            }
            if (n==1)
                break;
        }
    }
}
