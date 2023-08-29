package Buoi_08;

public class Dog extends Animal implements Actions {
    public Dog(String name) {
        setName(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cho keu gau gau");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " = eat");
    }

    @Override
    public void play() {

    }
}
