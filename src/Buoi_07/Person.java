package Buoi_07;

public class Person {
    //Thông tin cơ bản về 1 người
    String name;
    String address;
    int age;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    //Method lấy/cập nhật thông tin người
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
    }
}
