package Buoi_07;

public class Car {
    static String color; //Màu xe
    int seatNum;  //Số ghế
    String type; //Loại xe

    //Xe mặc định
    public Car(){
        type = "Sedan";
        seatNum = 5;
        color = "Black";
    }
    //Constructor with param "color"
    public Car(String color){
        Car.color = color;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public void run(){
        System.out.println("SeatNumber: "+ seatNum);
        System.out.println("Type: " + type);
        System.out.println("Color: "+ color);
        System.out.println("Running...");
    }

}
