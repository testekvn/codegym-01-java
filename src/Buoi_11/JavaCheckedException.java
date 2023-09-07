package Buoi_11;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class JavaCheckedException {
    public static void main(String[] args) {
//        //region Exception chia cho 0
//
//        try{
//            int a = 10 / 0;
//            //System.out.println("qDebug: khong the chia cho O");
//        }
//        catch (ArithmeticException e){
//            System.out.println("qDebug: Con");
//            System.out.println("qDebug:"+e);
//        }
//        catch (Exception e){
//            System.out.println("qDebug"+e);
//        }
//
//        finally {
//            System.out.println("qDebug: final debug");
//        }
//        //endregion
        //region bai tap jame
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        Random rd = new Random();
        for (int i = 0; i< arr.length; i++){
            arr[i]= rd.nextInt();
        }
        System.out.println("Nhap vi tri phan tu trong mang:");
        int num = sc.nextInt();
        try{
            System.out.println("Nhap phan tu thu"+num+" "+arr[num]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("qDebug-Con: "+e);
        }
        catch (Exception e){
            System.out.println("qDebug: "+e);
        }
        //endregion
    }

}
