package Buoi_11;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        System.out.println("START");

        try {
            int a = 10 / 0;
            System.out.println("Ko the chia cho  0");
        } catch (ArithmeticException e){
        System.out.println(" ex1");
    }
        catch (Exception b) {
            System.out.println("ex2");
        }
        finally {
            System.out.println("final");
        }


        System.out.println("END");
    }
}
