package Test;

public class BaiTap1 {
    public static void main(String[] args) {
        String string = "Software testing is the process of evaluating and verifying that a software product or " +
                "application does what it is supposed to do";
        int countO = 0, countA = 0, countI = 0, countE = 0, countU = 0;
        for (int i = 0; i < string.length(); i++) {
            char a = string.charAt(i);
            switch (a){
                case 'a':
                    countA++;
                    break;
                case 'e':
                    countE++;
                    break;
                case 'i':
                    countI++;
                    break;
                case 'o':
                    countO++;
                    break;
                case 'u':
                    countU++;
                    break;
                default:
                    System.out.println("a");
            }
        }
        System.out.println("Tong so luong nguyen am: " + (countA + countE + countU + countI + countO));
        System.out.println("So luong a: " + countA);
        System.out.println("So luong e: " + countE);
        System.out.println("So luong i: " + countI);
        System.out.println("So luong o: " + countO);
        System.out.println("So luong u: " + countU);
    }
}
