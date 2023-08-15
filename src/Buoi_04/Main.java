package Buoi_04;
import java.util.*;

public class Main {
    public static final char CHAR_55 = 55;
    public static void main(String[] args) {

            int n = 178;
        Main ConvertNumber = null;
        System.out.println("So " + n + " trong he co so 2 = "
                    + ConvertNumber.convertNumber(n, 2));
            System.out.println("So " + n + " trong he co so 16 = "
                    + ConvertNumber.convertNumber(n, 16));
        }

        /**
         * chuyen doi so nguyen n sang he co so b
         *
         * @author viettuts.vn
         * @param n: so nguyen
         * @param b: he co so
         * @return he co so b
         */
        public static String convertNumber(int n, int b) {
            if (n < 0 || b < 2 || b > 16 ) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            int m;
            int remainder = n;

            while (remainder > 0) {
                if (b > 10) {
                    m = remainder % b;
                    if (m >= 10) {
                        sb.append((char) (CHAR_55 + m));
                    } else {
                        sb.append(m);
                    }
                } else {
                    sb.append(remainder % b);
                }
                remainder = remainder / b;
            }
            return sb.reverse().toString();
        }


//region BT moi
//        int N = 10;
//        int HS =2;
//        StringBuilder result = new StringBuilder();
//        while (N>0)
//        {
//            int s = N%HS;
//            result.append(s);
//            N /= HS;
//            if (N<HS) {
//                result.append(N);
//                break;
//            }
//    }
//        System.out.println("Ket qua: "+result.reverse());
//
//    //endregion
    }
