package Buoi_07;

public class Main {
    public static int a = 5;
    public static int b = 10;
    public static String className = "Main.class";
    String classNamePrivate = "Main.class";

    public static void main(String[] args) {
        // TODO: Implement your code here

        //region swap
//        int a = 5;
//        int b = 10;
        swap(a, b);
        System.out.println("Num a: " + a);
        System.out.println("Num b: " + b);
        // endregion
        //region Person
        Person quyetPV = new Person("Quyet");
        Person minhNQ = new Person("Minh");
        System.out.println("Persion 1 - Bef: " + quyetPV.getName());
        System.out.println("Persion 2 - Bef: " + minhNQ.getName());

        swapPerson(quyetPV, minhNQ);

        System.out.println("Persion 1 - Af: " + quyetPV.getName());
        System.out.println("Persion 2 - Af: " + minhNQ.getName());

        //endregion

        //region Static
        System.out.println("\n=========== Static Variable/Method =================\n");
        String add = Person.addStatic;
        System.out.println("static var - addStatic: " + add);

        Person staticPer = new Person("Vincent");
        String addPrivate = staticPer.getAddPrivate();
        System.out.println("static var - addPrivate: " + addPrivate);

        // Call a static method
        Person.printInfo();

        //endregion
    }

    public static void swapPerson(Person firstPer, Person secPer) {
        String temp = firstPer.getName();

        firstPer.setName(secPer.getName());
        secPer.setName(temp);
    }

    /**
     * Swap int
     *
     * @param firstNum
     * @param secondNum
     */
    public static void swap(int firstNum, int secondNum) {
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        a = firstNum;
        b = secondNum;

        System.out.println("firstNum - af: " + firstNum);
        System.out.println("secondNum - af: " + secondNum);
    }
}
