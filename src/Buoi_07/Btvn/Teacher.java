package Buoi_07.Btvn;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

}
