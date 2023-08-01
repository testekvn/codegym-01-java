package Buoi_00.chua_btvn.pq_minh;

public class Cau4 {
    public static void main(String[] args) {
        int[] Num = {2, 7, 6, 8, 9, 21, 34, 56, 32, 12, 37};
        int max = Num[0];
        for (int i = 0; i < Num.length; i++) {
            if (Num[i] > max) {
                max = Num[i];
            }
        }
        System.out.println("In ra phần tử lớn nhất trong mảng:" + max);
        System.out.print(Num[0]+ Num[10]);
    }
}
