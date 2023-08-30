package Buoi_08.Abstract;

import Buoi_07.QuanLySach.Document;

public class Doctor extends Person{
    @Override
    public void setSalary() {
        System.out.println("Doctor setSalary");
    }
    public Doctor(String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Doctor : " + getName();
    }
}
