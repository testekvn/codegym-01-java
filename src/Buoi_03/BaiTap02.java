package Buoi_03;

import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap một số nguyên bất kỳ: ");
        int number = sc.nextInt();
        String stringNumber = ""+ number;
//        System.out.println(number);
//        System.out.println(stringNumber);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        System.out.println(sum);

        System.out.println("\n");
//        Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
//        1. In ra list theo thứ tự giảm dần.
//        2. Chỉ ra vị trí số 77 trong list(Array)
        int[] arrSort = new int[29];
        int index77 = 0;
        for (int i = 200; i > 10; i--) {
            if (i % 7 == 0 && i % 5 !=0){
                System.out.print(i + " ");
                arrSort[index77] = i;
                index77++;
            }
            if (index77 == 29){
                break;
            }
        }
        System.out.println("\n");
        System.out.print("Vi tri 77: ");
        for (index77 = 0; index77 < arrSort.length; index77++) {
            if (arrSort[index77]==21){
                System.out.println(index77);
            }
        }

        //region So nghich doc Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta
        // vẫn nhận được một số giống nhau. Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số
        int a = 100000;
        while (a<999999){
            int[] arrInt = new int[6];
            int number = a;
            for (int i = 5; i >= 0 ; i--) {
                arrInt[i] = number % 10;
                number = number / 10;
            }
            if (arrInt[0] == arrInt[5] && arrInt[1]== arrInt[4] && arrInt[2] == arrInt[3]){
                System.out.println(arrInt[0] + "" + arrInt[1] + arrInt[2] + arrInt[3] + arrInt[4] + arrInt[5]);
            }
            a++;
        }

        //endregion

        // region UCLN & BCNN
        System.out.print("Nhap một số nguyên bất kỳ a : ");
        int numbera = sc.nextInt();
        System.out.print("Nhap một số nguyên bất kỳ b : ");
        int numberb = sc.nextInt();
        int ucln= 1;
        int bcnn = 1;
        for (int i = 1; i <= numbera && i<= numberb ; i++) {
            if (numbera%i==0 && numberb%i==0){
                ucln = i;
            }
        }
        System.out.println("Ước chung lớn nhất: "+ ucln);


        // Bội chung nhỏ nhất
        if (numbera > numberb){
            bcnn =numbera;
        } else {
            bcnn = numberb;
        }
        while (true){
            if (bcnn % numbera == 0 && bcnn%numberb == 0){
                System.out.println("Boi chung nho nhất: "+ bcnn);
                break;
            }
            bcnn++;
        }


        //endregion
    }
}
