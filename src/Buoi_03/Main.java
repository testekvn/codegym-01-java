package Buoi_03;

import com.sun.nio.sctp.SctpStandardSocketOptions;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        /*
        String[] arrString;
        arrString = new String[1];
        arrString[0]="Quynh";
        System.out.println("Length: "+ arrString.length);
        System.out.println("value: "+ arrString[0]);

         */
        //In mảng 50 phần tử ; các phần tử là số chẵn nhỏ hơn bằng 120; từ 120 đổ xuống
        /*
        int[] arrSo;
        arrSo =  new int[50];
        int count=0;
        for (int num =120; num>0;num--){
            if (num%2==0 ){
                arrSo[count]=num;
                System.out.print(" "+arrSo[count]);
                count++;
            }if(count==50)break;
        }
        for (int i=0;i< arrSo.length;i++){
            if(arrSo[i]==68){
                System.out.println(" vi tri: "+i);
            }
        }
        */


//               Xây dựng chương trình: Mảng arr = {2,7,6,8,9,21,34,56,32,12,37}
//               1. Tìm phần tử lớn nhất trong mảng và in ra thông tin (sử dụng vòng While)
//               2. Tính tổng số đầu tiên và số cuối cùng
        int[] arrNum ={2,7,6,8,9,21,34,56,32,12,37};
        int count = 0;
        int max= arrNum[0];
        while (true) {
            if (max<= arrNum[count]){
                max = arrNum[count];
            }
            count++;
            if (count> arrNum.length-1)break;
        }
        System.out.println("Max "+ max);
        System.out.println("Sum: "+(arrNum[0]+ arrNum[arrNum.length-1]));




        }
}


