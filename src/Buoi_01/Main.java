package Buoi_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region Bai1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello: "+ name);
        //endregion

        //region Bai2
        System.out.println("Nhap so tien USD: ");
        double usd = sc.nextDouble();
        double quydoivnd = usd * 23000;
        System.out.println("So tien sau khi quy doi tu USD > VND la: " + quydoivnd + "vnd");
        //endregion

        //region Bai3
        while (true){
            System.out.println("Nhap can nang: ");
            int weight = sc.nextInt();
            String result1 = "";
            String result2 = "";
            String result3 = "";
            int num1 = weight/100;          //Lấy số hàng trăm
            int num2 = (weight%100)/10;     //Lấy số hàng chục
            int num3 = ((weight%100)%10);   //Lấy số hàng đơn vị
            if (weight == -1){              //Dừng việc nhập khi nhập -1
                break;
            }
            if (weight >0 && weight <1000){
                switch (num1){
                    case 0:
                        break;
                    case 1:
                        result1 = "one hundered";
                        break;
                    case 2:
                        result1 = "two hundered";
                        break;
                    case 3:
                        result1 = "three hundered";
                        break;
                    case 4:
                        result1 = "four hundered";
                        break;
                    case 5:
                        result1 = "five hundered";
                        break;
                    case 6:
                        result1 = "six hundered";
                        break;
                    case 7:
                        result1 = "seven hundered";
                        break;
                    case 8:
                        result1 = "eight hundered";
                        break;
                    case 9:
                        result1 = "nine hundered";
                        break;
                }
                switch (num2){
                    case 0:
                        result2 = "ten";
                        break;
                    case 1:
                        switch (num3){
                            case 0:
                                result2 = "ten";
                                break;
                            case 1:
                                result2 = "eleven";
                                break;
                            case 2:
                                result2 = "twelve";
                                break;
                            case 3:
                                result2 = "thirteen";
                                break;
                            case 4:
                                result2 = "fourteen";
                                break;
                            case 5:
                                result2 = "fifteen";
                                break;
                            case 6:
                                result2 = "sixteen";
                                break;
                            case 7:
                                result2 = "seventeen";
                                break;
                            case 8:
                                result2 = "eighteen";
                                break;
                            case 9:
                                result2 = "nineteen";
                                break;
                        }
                        break;
                    case 2:
                        result2 = "twenty";
                        break;
                    case 3:
                        result2 = "thirty";
                        break;
                    case 4:
                        result2 = "forty";
                        break;
                    case 5:
                        result2 = "fifty";
                        break;
                    case 6:
                        result2 = "sixty";
                        break;
                    case 7:
                        result2 = "seventy";
                        break;
                    case 8:
                        result2 = "eighty";
                        break;
                    case 9:
                        result2 = "ninety";
                        break;
                }
                switch (num3){
                    case 0:
                        break;
                    case 1:
                        result3 = "one";
                        break;
                    case 2:
                        result3 = "two";
                        break;
                    case 3:
                        result3 = "three";
                        break;
                    case 4:
                        result3 = "four";
                        break;
                    case 5:
                        result3 = "five";
                        break;
                    case 6:
                        result3 = "six";
                        break;
                    case 7:
                        result3 = "seven";
                        break;
                    case 8:
                        result3 = "eight";
                        break;
                    case 9:
                        result3 = "nine";
                        break;
                }
                if (weight <10){
                    System.out.println("Can nang cua ban la: "+ result3);
                }
                else if (weight >=10 && weight <20){
                    System.out.println("Can nang cua ban la: "+ result2);
                }
                else if (weight >= 20 && weight <100){
                    System.out.println("Can nang cua ban la: "+ result2 + " "+ result3);
                }
                else if (weight%100 == 0){
                    System.out.println("Can nang cua ban la: "+ result1);
                }
                else if (weight%100 >=10 && weight%100 <20){
                    System.out.println("Can nang cua ban la: "+ result1 + " and "+ result2);
                }
                else {
                    System.out.println("Can nang cua ban la: "+ result1 + " and "+ result2 +" "+ result3);
                }
            }
            else System.out.println("out of ability");
        }
        //endregion
    }
}
