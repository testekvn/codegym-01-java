package Buoi_07.manageResident;

import java.util.ArrayList;
import java.util.List;

public class manageResident {
    public static void main(String[] args) {
        //1. Tao person
        Person person1 = new Person("Nguyen",20,"Sinh Vien","20");
        Person person2 = new Person("Pham", 21, "Sinh Vien","21");

        //Tao danh sach thanh vien trong family
        List<Person> family1 = new ArrayList<>();
        family1.add(person1);
        family1.add(person2);

        System.out.println("Danh sach:\n"+family1);

        //2. Tao family
        Family family = new Family(4,"CT01", family1);

        //Add new person
        Person person3 = new Person("Tran",22,"Sinh Vien","22");
        family.addPerson(person3);

        //3. Tao khu pho
        List<Family> quarter1 = new ArrayList<>();
        quarter1.add(family);
        quarter1.add(family);
        Quarter quarter = new Quarter(quarter1);
        System.out.println("Khu pho list:\n"+quarter.getFamilyList());
    }
}
