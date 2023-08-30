package Buoi_08.Abstract;

import Buoi_08.Interface.Interface;

public class Teacher extends Person implements Interface {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void setSalary() {
        System.out.println("Teacher setSalary");
    }

    @Override
    public String toString() {
        return "Teacher" + getName();
    }

    @Override
    public void learn() {

    }

    @Override
    public void hangOut() {

    }
}
