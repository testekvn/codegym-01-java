package Buoi_12;

public class Cau1 {
    public static void main(String[] args) {
        String str = "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do.";
        int ucount = 0, ecount = 0, ocount = 0,acount =0, icount =0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if(ch == 'u') { ucount++; }
        else if((ch == 'e')) {
            ecount++;
        } else if (ch == 'o') {
            ocount++;
        } else if (ch =='a') {
            acount++;
        } else if (ch =='i') {
            icount++;
        }
        }
        System.out.println("Số nguyên u: " + ucount);
        System.out.println("Số nguyên e: " + ecount);
        System.out.println("Số nguyên o: " + ocount);
        System.out.println("Số nguyên a: " + acount);
        System.out.println("Số nguyên i: " + icount);
    }
}
