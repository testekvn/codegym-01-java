package Buoi_06;

import java.util.Random;

public class Person {
    String name;                // Ten
    int age;                    // Tuoi
    String dob;                 // Ngay sinh
    String identityCard;        // CCCD

    // Khoi tao 1 constructor for Person Class
    public Person() {
        System.out.println("This is a person");
        name ="Auto Test";
        identityCard= "21233213";
    }

    public Person(String name) {
        System.out.println("This is : " + name);
    }

    public static void main(String[] args) {
        // Khoi tao object without params
        Person vAnh = new Person();     // Tao ra V.Anh
        Person dDung = new Person();

        //region Vi du ve method
//        sum(2, 4);
//        int sum = 2 + 4;
//        sum(4, 7);
//        int sum = 4 + 7;
        // endregion

        //region Constructor with params
        Person pvQuyet = new Person("PV Quyet");
        Person dhPhung = new Person("PH Phung");

        //endregion
    }

    public static void sum(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        System.out.println(sum);
    }


    public void sleep() {
    }

    // Phuong thuc cua doi tuong Person: An
    public void eat() {
        System.out.println("eat");
    }

    // Phuong thuc cua doi tuong Person: Choi the thao
    public void play(String sportName) {
        System.out.println("play");
    }


}
