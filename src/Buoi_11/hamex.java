package Buoi_11;

import java.util.Random;

public class hamex {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] arr = new int[100];
        System.out.println("Phan tu mang: ");
        for (int i = 0; i < 100; i++)
        {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
    }

}
