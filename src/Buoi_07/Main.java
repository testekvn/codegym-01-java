package Buoi_07;

import Buoi_07.Btvn.Person;
import Buoi_07.Btvn.Teacher;


public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        Student fistStu = new Student();
        Student secStu = new Student("Minh");

        Student.setScore(7);
        Student.score = 7;
        Student.changeScore(9);
        //region person
        Person personFirst = new Person("Pham Quang Minh", 23, "Duong Van Be");
        Teacher personTeacher = new Teacher("Gia Duy", 30, "Duy Tan - Cau Giay - Ha Noi", 500000000);
        Buoi_07.Btvn.Student personStudent = new Buoi_07.Btvn.Student("Pham Quang Minh", 23, "Duong Van Be", 2.84);
        System.out.println(" Person :");
        personFirst.display();
        System.out.println(" Teacher :");
        personTeacher.display();
        System.out.println(" Student :");
        personStudent.display();
        //endregion


        //region Circle
        Circle circle = new Circle(1.0);
        //endregion

    }
}
