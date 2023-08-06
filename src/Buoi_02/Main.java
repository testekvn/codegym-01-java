package Buoi_02;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        for (int i = 200; i >=10 ; i--) {
            String m ="so le";
            if(i%2==1){
                m = "so chan";
            }
            System.out.print(m +i);
        }
        System.out.println("so le");
        for (int j = 200; j >=10 ; j--) {
            if(j %2==1) System.out.print(""+j);
        }
        System.out.println("\n\n in ra so le");
      int  count = 0;
        while (count <100){
            if(count%2==1)
                System.out.println(count);
            count++;
            }
        }

    }


