package Buoi_08;

public class Duck extends Animal implements Actions{
    public Duck(String name) {
        setName(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " - quoạc quoạc");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
