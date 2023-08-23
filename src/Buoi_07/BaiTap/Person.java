package Buoi_07.BaiTap;

public class Person {
    String name, address;
    int age;

    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public void setName(String name){ this.name = name; }
    public String getAddress(){ return this.address; }
    public void setAddress(String address){ this.address = address; }
    public int getAge(){ return this.age; }
    public void setAge(int age){ this.age = age; }

    /**
     * In ra cac thong tin nhu ten, dia chi va tuoi
     */
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
