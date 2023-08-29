package Buoi_08;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Person person = new Doctor("Doctor " + i);
            personList.add(person);
            doctors.add((Doctor) person);
        }

        System.out.println("Length :" + personList.size());
        System.out.println("Length :" + personList.get(1));

        Person ae = new AEngineer("Minh");
        personList.add(ae);
        System.out.println("Length :" + personList.size());
        System.out.println("Length :" + personList.get(personList.size()-1));

        // doctors.add((Doctor) ae); Lỗi cast dữ liệu
    }
}
