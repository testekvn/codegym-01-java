package Buoi_03;

public class Bai4 {
    public static void main(String[] args) {
        int[] arrEx = {2, 7, 6, 8, 9, 21, 34, 56, 32, 12, 37};
        int count = 0;
//        System.out.println("Length: " + arrEx.length);
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
//        for (int i = arrEx.length - 1; i >= 0; i--) {
//            if (maxValue < arrEx[i])
//                maxValue = arrEx[i];
//        }
//        for (int value : arrEx) {
//            if (maxValue < value)
//                maxValue = value;
//        }
        while (true) {
            if(minValue<=arrEx[count]){
                minValue = arrEx[count];
            }
            count++;
            if(count>arrEx.length-1);
            break;
        }
        System.out.println("Giá Trị Nhỏ Nhất "+ minValue);
//
//        System.out.println("Sum: "+(arrEx[0]+ arrEx[arrEx.length-1]));
//        while(true){
//            if(maxValue<arrEx[count]){
//                maxValue = arrEx[count];
//            }
//            count++;
//            if(count > arrEx.length-1);
//            break;
//    }
//        System.out.println("Giá Trị Lớn Nhất "+ maxValue);

    }
}
