package Buoi_07.BaiTap;

public class Teacher extends Person{
    int salary;
    public Teacher(String name, String address, int age, int salary) {
        super(name, address, age);
        this.name = name; //???
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

//    public Teacher(String name, String address, int age, int salary){
//
//    }


    @Override
    public void display() {
//        super.display();
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Salary: "+ salary);
    }
}
