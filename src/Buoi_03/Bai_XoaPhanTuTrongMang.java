package Buoi_03;

import java.util.Scanner;

public class Bai_XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arrNum ={10,4,6,7,8,6,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Xóa phần tử thứ: ");
        int index = scanner.nextInt();
        arrNum[index]=0;
        int temp;
        for(int i=0;i<=arrNum.length-8;i++){
            System.out.print(" "+arrNum[i]);
            }
        for (int j =index;j<arrNum.length-1;j++){
            temp=arrNum[j];
            arrNum[j]=arrNum[j+1];
            arrNum[j+1]=temp;
            System.out.print(" "+arrNum[j]);
        }
    }
}
