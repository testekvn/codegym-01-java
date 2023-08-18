package Buoi_06;

public class Object {

    String name, color, type;
    // Contructor co tham so
    public Object(String name, String color){
        System.out.println("Method has 2 params");
        System.out.println("Phone name: " + name);
        System.out.println("Color " + color);
        System.out.println("\n ");
    }


    public Object(){
        System.out.println("Method no param");
    }

    public Object(String name){
        System.out.println("Car name : " + name);
    }

    public static void main(String[] args) {
        Object car = new Object("BWM");
        Object phone = new Object("Iphone", "black");
        Object noParam = new Object();
    }
}
