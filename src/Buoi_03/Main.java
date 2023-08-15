package Buoi_03;
import javax.lang.model.util.ElementScanner6;
import javax.management.MBeanNotificationInfo;
import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
//
//        String[] ex = new String[1];
//        for (int i = 0; i < ex.length; i++) {
//            System.out.println("Ten nguoi yeu: "+ ex[i]);
//        }
//
//        //region thuc hanh tao mang int size = 50
//        int[] arr = new int[50];
//        //Gan gia tri la so chan giam dan tu 120
//        int count =0;
//        for (int i =120; i>0; i--){
//            if (i % 2 ==0){
//                arr[count] = i;
//                //System.out.print(arr[count]+ " ");
//                count++;
//            }
//            if (count == 50) break;
//        }
//        //Tim vi tri so 68 trong mang va in ra vi tri do
//        for (int j =0; j< arr.length; j++){
//            if (arr[j] == 68) System.out.println("Vi tri so 68 la: " + (j+1));
//        }
//        //endregion
//        int max = Integer.MIN_VALUE;
//        for (int maxvalue:arr){
//            if (maxvalue < max){
//                maxvalue = max;
//            }
//        }
//        //BTVN: Dung while tim so nho nhat
//
//        //region Bai tap mang
//        int[] arr1 = {10,4,6,7,8,6,0,0,0,0};
//        int[] arr2 = {1,4,6,7,8,6,2,3,5,0};
//        int[][] arr3= {{1,2,3},{4,5,6},{8,7,9}};
//        System.out.println("Mang 1: ");
//        for (int i =0; i < arr1.length; i++) System.out.print(arr1[i]+ " ");
//        System.out.println("\nMang 2: ");
//        for (int i =0; i < arr2.length; i++) System.out.print(arr2[i]+ " ");
//        System.out.println("\nMang 2 chieu hinh vuong:");
//        for (int i =0; i< arr3.length; i++){
//            for (int j =0; j < arr3[i].length; j++){
//                System.out.print(arr3[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println("\nBai1. Xoa 1 phan tu trong mang1");
//        System.out.println("Bai2. Them 1 phan tu vao mang2 ");
//        System.out.println("Bai3. Gop mang 1 va mang 2");
//        System.out.println("Bai4. Tim phan tu nho nhat trong mang1");
//        System.out.println("Bai5. Tim phan tu lon nhat trong mang 2 chieu:");
//        System.out.println("Bai6. Tong cac so o duong cheo mang 2 chieu hinh vuong");
//        System.out.println("Nhap 9 de chuyen bai tren slack");
//        System.out.printf("\nNhap bai tap can lam: ");
//        int[] newarr1 = new int[arr1.length];
//        int[] newarr2 = new int[arr2.length+1];
//        int[] Gopmang = new int[arr1.length+ arr2.length];
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            int option = sc.nextInt();
//            if (option == 9) break;
//            switch (option){
//                case 1:
//                    System.out.print("Nhap phan tu can xoa trong mang1: ");
//                    int N = sc.nextInt();
//                    int indexDelete = arr1.length+1;
//                    for (int i = 0; i < arr1.length; i++) {
//                        if (arr1[i] == N) {
//                            indexDelete = i;
//                        }
//                    }
//                    for (int j = 0, k = 0; j < newarr1.length; j++) {
//                        if (j != indexDelete) {
//                            newarr1[k] = arr1[j];
//                            k++;
//                        }
//                    }
//                    arr1 = newarr1;
//                    System.out.printf("Mang1 sau khi xoa: ");
//                    for (int value1: arr1){
//                        System.out.print(value1+ " ");
//                    }
//                    break;
//                case 2:
//                    System.out.printf("Nhap phan tu can them vao trong mang2: ");
//                    int addValue = sc.nextInt();
//                    int addIndex = 2;
//                    for (int i = 0, j = 0; i < newarr2.length; i++){
//                        if (i == addIndex){
//                            newarr2[i] = addValue;
//                        }
//                        else {
//                                newarr2[i] = arr2[j];
//                                j++;
//                        }
//                    }
//                    arr2 = newarr2;
//                    System.out.printf("Mang2 sau khi them 1 phan tu vao vi tri thu 3 la: ");
//                    for (int value2: arr2){
//                        System.out.print(value2+ " ");
//                    }
//                    break;
//                case 3:
//                    for (int i =0; i< arr1.length; i++)
//                        Gopmang[i] = arr1[i];
//                    for (int i =0; i< arr2.length; i++)
//                        Gopmang[arr1.length +i] = arr2[i];
//                    System.out.println("Mang moi sau khi gop mang 1 va mang 2: ");
//                    for (int value3: Gopmang)
//                        System.out.print(value3+ " ");
//                    break;
//                case 4:
//                    int min = Integer.MAX_VALUE;
//                    for (int i =0; i < arr1.length; i++){
//                        if (min > arr1[i])
//                            min = arr1[i];
//                    }
//                    System.out.println("Phan tu nho nhat trong mang 1 la: "+ min);
//                    break;
//                case 5:
//                    int max5 = Integer.MIN_VALUE;
//                    for (int i =0; i< arr3.length; i++){
//                        for (int j =0; j < arr3[i].length; j++){
//                            if (arr3[i][j] > max5)
//                                max5 = arr3[i][j];
//                        }
//                    }
//                    System.out.println("So lon nhat trong mang 2 chieu la: "+ max);
//                    break;
//                case 6:
//                    int sum=0;
//                    for (int i =0; i< arr3.length; i++){
//                        sum += arr3[i][i];
//                        sum += arr3[i][arr3.length- i -1];
//                    }
//                    System.out.println("Tong cac so o duong cheo mang 2 chieu hinh vuong: "+ sum);
//                    break;
//            }
//        }
//        //endregion Bai1
//
//        //region Bai1 tren slack
//        //1. Viết chương trình tìm các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:
//             //1. In ra list theo thứ tự giảm dần.
//        int count1 =0;
//        int count2 =0;
//        System.out.println("Các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong khoảng 10 -> 200:");
//        for (int i=200; i>=10; i--){
//            if (i %7 ==0 && i %5 !=0){
//                System.out.print(i+ " ");
//                count1++;
//            }
//        }
//             //2. Chỉ ra vị trí số 77 trong list(Array)
//        int[] arrs1 = new int[count1];
//        for (int i=200; i>=10; i--){
//            if (i %7 ==0 && i %5 !=0){
//                arrs1[count2] =i;
//                count2++;
//            }
//        }
//        for (int index=0; index< arrs1.length; index++){
//            if (arrs1[index] == 77){
//                System.out.println("\nVi tri so 77 trong list la: "+(index+1));
//            }
//        }
//
//        //endregion
//
//        //region Bai2 tren Slack
//        /*2. Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải
//         hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
//        Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855)*/
//        System.out.println("List các số thuận nghịch độc có sáu chữ số:");
//        for (int i = 100000; i <= 999999; i++) {
//            int num = i;
//            int reverse = 0;
//            while (num != 0) {
//                int digit = num % 10;
//                reverse = reverse * 10 + digit;
//                num /= 10;
//            }
//            if (i == reverse) {
//                System.out.print(i + " ");
//            }
//        }
//        //endregion
//
//        //region Bai3 Slack
//        //3. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.
//        System.out.print("Nhap so a: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.print("\nNhap so b: ");
//        int b = sc.nextInt();
//        int UCLN = UCLN(a,b);
//        int BCNN = BCNN(a, b, UCLN);
//        System.out.println("UCLN la: "+ UCLN);
//        System.out.println("BCNN la: "+ BCNN);
//        //endregion

//        //region Bai4 Slack
//        //4. Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số b bất kì (1< b≤ 36).
//        int N = 10;
//        int hs = 2;
//        StringBuffer strchangehs = new StringBuffer();
//            while (N>0) {
//            int s = N % hs;
//            //System.out.print(s);
//            strchangehs.append(s);
//            N /= hs;
//            if (N < hs) {
//                strchangehs.append(N);
//                //System.out.println(N);
//                break;
//            }
//        }
//        System.out.println("Result: "+ strchangehs.reverse());
//        //endregion
//
//        //region Bai5 Slack
//        //5. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
//        System.out.println("Nhap so nguyen can tinh: ");
//        Scanner s5= new Scanner(System.in);
//        int number5 = s5.nextInt();
//        int sum5 = 0;
//        while (number5 > 0){
//            int num5 = number5 %10;
//            sum5 += num5;
//            number5 /=10;
//        }
//        System.out.println("Tong cac chu so cua so nguyen "+ number5 +" la: "+ sum5);
//
//        //endregion
//        //region Bai6 Slack
//        //6. Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
//        System.out.println("Nhap so nguyen: ");
//        Scanner s6 = new Scanner(System.in);
//        int number6 = s6.nextInt();
//        System.out.println("Phan tich so nguyen "+ number6+" thanh cac thua so nguyen to la: ");
//        for (int i = 2; i <= number6; i++){
//            while ( number6 % i == 0){
//                System.out.print(i);
//                number6 /= i;
//                if (number6 > 1) {
//                    System.out.print(" x ");
//                }
//            }
//        }
//        //endregion
//    }
//    public static int UCLN(int a, int b) {
//        while (b!= 0){
//            int temp =b;
//            b = a%b;
//            a = temp;
//        }
//        return a;
//    }
//    public static int BCNN(int a, int b, int UCLN){
//        return ((a*b)/UCLN);
//    }
    }
}
