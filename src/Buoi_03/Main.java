package Buoi_03;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region bai tap
        int[] arrInt;
        arrInt = new int[50];
        int count = 0;
        for (int i = 10; i < 201; i++) {
            if (i % 2 == 0) {
  //              System.out.println("So Chan: " + i);
                arrInt[count] = i;
                count++;
            }

            if (count == 50) break;

            }
        for (int i = 0; i < arrInt.length; i++) {
           if (arrInt[i] == 68)
               System.out.println("Vi tri: "+(i+1)); //cong them 1 neu la nguoi dung
            //endregion
        }
    }
}
