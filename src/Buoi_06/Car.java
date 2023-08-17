package Buoi_06;

// Tao 1 class Car - Doi tuong Car
public class Car {
    // Khai bao thuoc tinh : Cac gia tri dac trung cua doi tuong
    String name;
    String color;
    String type;

    // Constructor with all params
    public Car(String name, String color, String type) {
        // body :
        if (name.equalsIgnoreCase("BMW")) {
            System.out.println("Xe BMW cua V.Anh");
        }

        if (name.equalsIgnoreCase("Lexus")) {
            System.out.println("Xe Lexus cua Duy");
        }

        if (name.equalsIgnoreCase("Kia")) {
            System.out.println("Xe Kia cua Manh");
        }
    }

    // Constructor without params
    public Car() {
       // System.out.println("Xe nha V.Anh");
    }

    public Car(String name) {
    }

    public Car(String name, String color) {
        System.out.println("Name : " + name + " - Color: " + color);
    }


    public static void main(String[] args) {
        Car bmwCar = new Car("BMW", "Red");
        Car lexCar = new Car("Lexus", "Black");
        Car i10 = new Car("Hyundai", "Black");
        Car morning = new Car("Kia", "Red", "hat back");
        Car suvBMW = new Car("BMW", "Red", "SUV");
        Car va = new Car();
    }
}
