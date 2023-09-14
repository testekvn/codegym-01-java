package Buoi_12.cau1;

public class Demsonguyen {
    public static void main(String[] args) {
        String chuoi = "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do";
        String newChuoi = chuoi.toLowerCase();
        int countU = 0, countE = 0, countO = 0, countA = 0, countI = 0;
        for (int i = 0; i < newChuoi.length(); i++) {
            char key = newChuoi.charAt(i);
            if (key == 'u') {
                countU++;
            }
            if (key == 'e') {
                countE++;
            }
            if (key == 'o') {
                countO++;
            }
            if (key == 'a') {
                countA++;
            }
            if (key == 'i') {
                countI++;
            }
        }
        System.out.println("So luong cac nguyen am trong chuoi la: " + (countU + countE + countO + countA + countI));
        System.out.println("So luong nguyen am U la:" + countU);
        System.out.println("So luong nguyen am E la:" + countE);
        System.out.println("So luong nguyen am O la:" + countO);
        System.out.println("So luong nguyen am A la:" + countA);
        System.out.println("So luong nguyen am I la:" + countI);
    }
}
