package Buoi_07;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
        //region Bai2 zalo
        System.out.println("Thông tin học sinh");
        student student1 = new student("quyetpv", 27,"HY",2.8);
        student1.display();
        //Cập nhật gpa
        student1.setGpa(2.9);
        student1.display();

        System.out.println("Thông tin giáo viên");
        teacher teacher1 = new teacher("Gia Duy",32, "HN", 3000);
        teacher1.display();
        //Cập nhật salary
        teacher1.setSalary(4000);
        teacher1.display();
        //endregion
    }
}
