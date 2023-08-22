package Buoi_07;

public class Person {
    public static String addStatic = "Ho Chi Minh";
    String name;
    String addPrivate = "Ha Noi";

    public Person(String name) {
        this.name = name;
    }

    // Static method
    public static void printInfo() {
        System.out.println("This is static variable");
    }

    public String getAddPrivate() {
        return addPrivate;
    }

    public void setAddPrivate(String addPrivate) {
        this.addPrivate = addPrivate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
