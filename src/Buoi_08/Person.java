package Buoi_08;

public abstract class Person  implements Actions{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void setSalary();

}
