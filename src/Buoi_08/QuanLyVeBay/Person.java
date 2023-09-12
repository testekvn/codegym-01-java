package Buoi_08.QuanLyVeBay;

import java.util.Scanner;

public class Person {
    String hoten;
    String gioitinh;
    int age;

    public Person(String hoten, String gioitinh, int age) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.age = age;
    }


    public void PrintInfoPerson() {
        System.out.println("Họ tên: " + hoten);
        System.out.println("Giới tính: " + gioitinh);
        System.out.println("Tuổi: " + age);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoten='" + hoten + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", age=" + age +
                '}';
    }

    public void PrintInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        hoten = sc.nextLine();
        System.out.println("Giới tính: ");
        gioitinh = sc.nextLine();
        System.out.println("Tuổi: ");
        age = Integer.parseInt(sc.nextLine());
    }
}
