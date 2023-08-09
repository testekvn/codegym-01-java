package Buoi_03;

public class Bai1_Buoi3 {
    public static void main(String[] args) {
        int[] arrNum;
        arrNum =  new int[30];
        int count=0;
        System.out.println(" Mảng cần tìm là: ");
        for (int num =200; num>=10; num--){
            if (num%7==0 && num%5 !=0 ) {
                arrNum[count]=num;
                System.out.print(" "+arrNum[count]);
                count++;
            }
        }
        for (int i=0;i< arrNum.length;i++){
            if(arrNum[i]==77){
                System.out.println("\n Số 77 ở vị trí thứ: "+i);
            }
        }
    }
}
