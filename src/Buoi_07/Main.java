package Buoi_07;

import Buoi_06.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        System.out.println("-----------Bai 1----------");
        luxuryCar luxuryCar =  new luxuryCar("Rolls Royce");
        luxuryCar.run();
        familyCar familyCar = new familyCar("1kW");
        familyCar.run();
        System.out.println("-------------End--------------");
        System.out.println("-----------Bai 2--------------");
        Student student = new Student("Phung",20,"Nam Dinh",2.5);
        student.display();
        Teacher teacher = new Teacher("Vincent", 30, "Ha Noi",2000);
        teacher.display();
        System.out.println("--------------End-------------");

    }
}
