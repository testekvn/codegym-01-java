package Buoi_07;

public class teacher extends perSon {
    int salary;

    public teacher(String name, int age, String address, int salary) {
        super(name,age,address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        System.out.println("Update salary!");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary + "$");
        System.out.println("==============================================");
    }
}
