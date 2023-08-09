package Buoi_03;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        String[] ex = new String[1];
        for (int i = 0; i < ex.length; i++) {
            System.out.println("Ten nguoi yeu: "+ ex[i]);
        }

        //region thuc hanh tao mang int size = 50
        int[] arr = new int[50];
        //Gan gia tri la so chan giam dan tu 120
        int count =0;
        for (int i =120; i>0; i--){
            if (i % 2 ==0){
                arr[count] = i;
                //System.out.print(arr[count]+ " ");
                count++;
            }
            if (count == 50) break;
        }
        //Tim vi tri so 68 trong mang va in ra vi tri do
        for (int j =0; j< arr.length; j++){
            if (arr[j] == 68) System.out.println("Vi tri so 68 la: " + (j+1));
        }
        //endregion
        int max = Integer.MIN_VALUE;
        for (int maxvalue:arr){
            if (maxvalue < max){
                maxvalue = max;
            }
        }
        //BTVN: Dung while tim so nho nhat
    }
}
