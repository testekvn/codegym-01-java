package Buoi_05;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        int tongLe=0;
        int tongChan=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số N: ");
        n = scanner.nextInt();
        for(int i =1; i<=n;i++){
            if(i%2==1){
                tongLe += i;
                System.out.print(tongLe);
            }else {
                tongChan+=i;
                System.out.println(tongChan);
            }
        }
    }
}
