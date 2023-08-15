package Buoi_05;

public class Cau2 {
    public static void main(String[] args) {
        int N = 100;
        int Num = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                System.out.println("in re các số lẻ " +i);
            }
            Num += i;

        }
        for( int a = 2; a <= N; a++){
            if(a%2==0){
                System.out.println("In ra các số chẵn" +a);

            }

        }
        //in ra dãy số fibonacci
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        for(int i = 0 ; i<100; i++){
            System.out.print(i+"");

        }
    }

}
