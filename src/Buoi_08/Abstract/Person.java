package Buoi_08.Abstract;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void setSalary();
}
