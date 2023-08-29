package Buoi_08;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        Person person_1 = new Doctor("vAnh");
        person_1.setSalary();

        Person person_2 = new AEngineer("Minh");
        person_2.setSalary();

        System.out.println("---------------------");
        Animal duck = new Duck("VitTay");
        duck.makeSound();

        Animal dog = new Dog("ChoTay");
        dog.makeSound();
    }
}
