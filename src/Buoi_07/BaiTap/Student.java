package Buoi_07.BaiTap;

public class Student extends Person{
    double gpa;

    public Student(String name, String address, int age, double gpa) {
        super(name, address, age);
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("GPA: "+ gpa);
    }
}
