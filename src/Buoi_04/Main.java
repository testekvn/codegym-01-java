package Buoi_04;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        String name = " Vân Anh ";
        String comment = " Một cô gái xinh đẹp!!!";

        System.out.println("Length : " + name.length());
        System.out.println("Index 1: " + name.charAt(1));
        System.out.println("Trim : " + name.trim().length());
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("LowerCase: " + name.toLowerCase());
        System.out.println("Concat: " + name.toUpperCase().concat(comment.toLowerCase()));

        String newStr = "Concat - New " + 2;
        System.out.println(newStr);


        String strFir = "Van ANH ";
        String strSec = "Manh Dung";
        String otherStr = new String("Van Anh");

        String test = "Van Anh";

        if (strFir == test) {
            System.out.println("Same value - ==");
        } else System.out.println("Diff - ==");

        if (strFir.equalsIgnoreCase(otherStr)) {
            System.out.println("Same value - equal");
        } else System.out.println("Diff - equal");

        if (strFir.toLowerCase().contains("VAn".toLowerCase())) {
            System.out.println("Contains - Van");
        }

        String intStr = "123131";
        System.out.println(Integer.parseInt(intStr));
        char c = 'A';
        String s = "A";
        int numC = c;
        System.out.println(Character.getNumericValue('A') + " - " + numC);

        // TO-DO: Check getNumericValue()

        String comA = "ACV";
        String comC = "CBC";
        String comAA = "ACB";
        System.out.println(comA.compareTo(comC));
        System.out.println(comA.compareTo(comAA));


        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder(name);
        System.out.println("Oring: " + stringBuilder);
        stringBuilder.append(" - Automation Engineer");
        System.out.println("New: " + stringBuilder);

        String strRe = "Van Anh - Automation Engineer";
        strRe =strRe.replace("Van Anh", "Minh");
        System.out.println(strRe);
        for (int i = 10; i < 100; i++) {
            StringBuilder builder = new StringBuilder(String.valueOf(i));
            // System.out.println("Or: " + i + " - Builder: " + builder.reverse());
            if (String.valueOf(i).compareTo(builder.reverse().toString()) == 0) {
                //System.out.println(i + " - Thuan nghich");
            }
        }
    }
}
