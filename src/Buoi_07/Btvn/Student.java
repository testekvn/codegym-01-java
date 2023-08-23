package Buoi_07.Btvn;

public class Student extends Person {
    double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + gpa);
    }
}
