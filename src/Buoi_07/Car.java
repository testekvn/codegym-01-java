package Buoi_07;

public class Car {
    String color;
    String seatNum;
    private String type;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public void run(){
        System.out.println("Running .....");
    }
}
