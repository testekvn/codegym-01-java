package Buoi_07;

public class Person {
    String name;
    int age;
    String address;
    public Person(){

    }
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Thong tin co ban");
        System.out.println("Name: "+name+" Age: "+age+" Address: "+address);
    }
}
