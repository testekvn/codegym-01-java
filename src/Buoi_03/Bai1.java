package Buoi_03;
public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 7 nhưng không phải là bội số của 5 là:");
            int [] arrMang = new int[30];
            int index = 0;
        for (int i = 10; i < 200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                arrMang[index] = i;
                index++;
                System.out.println(i);

            }
            }
            for (index = 0; index < arrMang.length; index++) {
                if (arrMang[index] == 77)
                    System.out.print(arrMang[index] + " - Vi tri: " + (index+1));
            }
        }
    }


