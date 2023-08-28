package Buoi_07;

public class Student extends Person {
    double gpa;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(String name, int age, String address, double gpa){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Gpa: "+ gpa);
    }
}
