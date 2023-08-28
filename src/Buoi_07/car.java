package Buoi_07;

import Buoi_06.Car;

import java.util.Scanner;

public class car {
    static String color;
    public int seatNum;
    public int maxSpeed;

    public car() {
        color = "red";
        seatNum = 4;
        maxSpeed = 300;

    }
    public car(String color){
        car.color=color;
    }
    public  void setSeatNum(int seatNum){
        this.seatNum = seatNum;
    }
    public   void run(){
        System.out.println("color: "+ color+" seatNumber: "+seatNum+" maxSpeed: "+maxSpeed);

    }
}
