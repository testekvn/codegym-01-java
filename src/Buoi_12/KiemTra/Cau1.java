package Buoi_12.KiemTra;

public class Cau1 {
    public static void main(String[] args) {
        String a = "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do.";
        int count = 0;
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'u' || ch == 'e' || ch == 'o' || ch == 'a' || ch == 'i') {
                count++;
            }
        }
        System.out.println("Số nguyên âm: " + count);

    }
}
