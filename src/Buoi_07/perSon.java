package Buoi_07;

public class perSon {
    // information declaration
    int age;
    String name;
    String address;
   // constructor
    public perSon (String name, int age, String address){
    this.age = age;
    this.name = name;
    this.address = address;
    }
    // method get and set information
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
