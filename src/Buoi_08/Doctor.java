package Buoi_08;

public class Doctor extends Person implements Actions {
    public Doctor(String name) {
        super(name);
    }

    @Override
    public void setSalary() {
        System.out.println("Doctor : Salary: 5000$");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public String toString() {
        return "Doctor: " + getName();
    }
}
