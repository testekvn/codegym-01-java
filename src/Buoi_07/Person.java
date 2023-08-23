package Buoi_07;

public class Person {
    public static String varStatic;
    String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void swapName(Person personSt, Person personNd){

    }
    public static void main(String[] args) {
        Person personFirst = new Person("First");
        Person personSecond = new Person("Second");


    }
}
