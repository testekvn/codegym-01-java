package Buoi_07;

import Buoi_07.James.Cylinder;
import Buoi_07.manageLibrary.*;


public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region Bai1 zalo
        System.out.println("Thông tin xe Luxury");
        LuxuryCar Car1 = new LuxuryCar("Vietnam");
        Car1.run();

        System.out.println("Thông tin xe Family");
        FamilyCar Car2 = new FamilyCar(100);
        Car2.run();
        //endregion

        //region Bai2 zalo
        System.out.println("Thông tin học sinh");
        Student student1 = new Student("quyetpv", 27,"HY",2.8);
        student1.display();
        //Cập nhật gpa
        student1.setGpa(2.9);
        student1.display();

        System.out.println("Thông tin giáo viên");
        Teacher teacher1 = new Teacher("Gia Duy",32, "HN", 3000);
        teacher1.display();
        //Cập nhật salary
        teacher1.setSalary(4000);
        teacher1.display();
        //endregion

        //region Baitap James
        System.out.println("Tính thông số hình trụ tròn");
        Cylinder cylinder = new Cylinder(3,"Blue",2);
        cylinder.displayCircle();
        //endregion
    }
}
