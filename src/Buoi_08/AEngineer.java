package Buoi_08;

public class AEngineer extends Person {
    public AEngineer(String name) {
        super(name);
    }

    @Override
    public void setSalary() {
        System.out.println("AEngineer : Salary: 3000$");
    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }


    public void play(int time){
    }
    public void play(int time, String a){
    }


    @Override
    public String toString() {
        return "AE: " + getName();
    }
}
