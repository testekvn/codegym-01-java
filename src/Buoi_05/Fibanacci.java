package Buoi_05;

public class Fibanacci {
    public static void main(String[] args) {
        int numFirst = 1, numSecond = 1, sum = 0, N =9;
        System.out.print(numFirst + " " + numSecond);
        while (N > numFirst + numSecond){
            sum = numFirst + numSecond;
            System.out.print(" " + sum);
            numFirst = numSecond;
            numSecond = sum;
        }


//        for (int i = 0; i < ; i++) {

//        }
    }
}
