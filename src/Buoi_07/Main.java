package Buoi_07;

import Buoi_07.BaiTap.Person;
import Buoi_07.BaiTap.Teacher;
import Buoi_07.James.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        // Access modify

        // thuoc tinh la bien, p
        // java khong cho phep da ke thua do ====>> nguyen tac thiet ke cua Java
        // Ke thua da cap: single, multilevel, hier

        Student.changeScore(8);
        Student studentName = new Student("Van Anh");
        System.out.println(studentName.getName());

        studentName.setName("Manh Dung");
        System.out.println(studentName.getName());


        //region Ke thua
        //region Car
        System.out.println("\n ================ Car =================\n");
        SportCar extendSportCar = new SportCar(500);
        extendSportCar.run();

        LuxuryCar extendLuxuryCar = new LuxuryCar("Viet Nam");
        extendLuxuryCar.run();

        FamilyCar extendFamilyCar = new FamilyCar("old people");
        extendFamilyCar.run();

        //endregion

        //region Person
        System.out.println("\n ================ Person =================\n");
        Person personFirst = new Person("Van Anh", "Ha Noi", 18);
        Teacher personTeacher = new Teacher("Gia Duy", "Ha Noi", 32, 5000);
        Buoi_07.BaiTap.Student personStudent = new Buoi_07.BaiTap.Student("Van Anh", "Ha Noi", 19, 9.0);
        System.out.println("================== Display person ===================");
        personFirst.display();
        System.out.println("================== Display teacher ==================");
        personTeacher.display();
        System.out.println("================== Display student ===================");
        personStudent.display();

        //endregion

        //region Phuong trinh bac hai
        System.out.println("================== Phuong trinh bac hai ===================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a : ");
        int numA = sc.nextInt();
        System.out.print("Nhap so b : ");
        int numB = sc.nextInt();
        System.out.print("Nhap so c : ");
        int numC = sc.nextInt();

        QuadraticEquation ptrinh = new QuadraticEquation(numA, numB, numC);
        if (ptrinh.getDiscriminant() < 0){
            System.out.println("Vo nghiem");
        } else if (ptrinh.getDiscriminant() == 0){
            System.out.println("Ptrinh co nghiem kep " + (-numC/numB));
        } else {
            System.out.println("Ptrinh co 2 nghiem " + ptrinh.getRoot1() + " va " + ptrinh.getRoot2());
        }

        //endregion
    }
}
