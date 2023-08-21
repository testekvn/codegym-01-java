package Buoi_06;

public class oTo4 {   //class (doi tuong)
    public void oTo1() // Thuoc tinh
    {
        String name;
        String color;
        int type;
    }

    public oTo4(String name, String color){  // Construct
        System.out.println("Ten o to: "+name);
        System.out.println("color: "+color);
    }
    public static void main(String[] args) {
        oTo4 bmw = new oTo4 ("String1","color"); // Object
        oTo4 lexus = new oTo4("ten o to","mau");

    }
}
