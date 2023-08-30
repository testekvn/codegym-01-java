package Buoi_08;

import Buoi_08.Abstract.Doctor;
import Buoi_08.Abstract.Person;
import Buoi_08.Abstract.Teacher;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here
//        override ghi de phuong thang cha de xu ly
//        tính trừu tượng:
//        interface quan ly hanh dong, hanh vi chung. tat cả thang con se implement de trien khai . override tat ca phuong thuc cua class interface
//        ArrayList<> la ds va khong gioi han phan
//        da hinh chung tên phuong thuc nhung khac tham so truyen vào

        Person newPersonDoctor = new Doctor("Van Anh");
        newPersonDoctor.setSalary();
        Person newPersonTeacher = new Teacher("Gia Duy");
        newPersonTeacher.setSalary();
    }
}
