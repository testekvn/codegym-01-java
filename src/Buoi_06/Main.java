package Buoi_06;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        //region Fibo

        int N = 99;
        int firstNum = 1, secondNum = 1, sum = 0;
        System.out.print(firstNum + " " + secondNum);
        for (int i = 0; i < N; i++) {
            sum = firstNum + secondNum;
            if (sum > N) break;
            System.out.print(" " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }

        while ((sum = firstNum + secondNum) <= N) {
            System.out.print(" " + sum);
            firstNum = secondNum;
            secondNum = sum;
        }

        //endregion
    }
}
