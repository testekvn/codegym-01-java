package Buoi_07.btvn2_9_Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTuyenSinh {
    public static void main(String[] args) {
        List<Student> studentList = null;
        studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên ứng tuyển: ");
        int n = scanner.nextInt();
        if(n<1 || n>20){
            System.out.println("Bạn phải nhập tối thiểu là 1 sinh viên và tối đa là 20 sinh viên");
            System.exit(0);
        }else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập sinh viên thứ: " + (i + 1));
                System.out.println("Đây là sinh viên khá giỏi ?: y/n ?");
                Scanner sc = new Scanner(System.in);
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    GoodStudent goodStudent = new GoodStudent();
                    goodStudent.input();
                    studentList.add(goodStudent);
                }
                else {
                    NormalStudent normalStudent = new NormalStudent();
                    normalStudent.input();
                    studentList.add(normalStudent);
                }
            }
        }
        int chon = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------Menu-------------");
            System.out.println("1. Nhập danh sách sinh viên ứng tuyển");
            System.out.println("2. Hiển thị danh sách sinh viên trúng tuyển");
            System.out.println("0. Thoát");
            System.out.println("Enter your choice: ");
            System.out.println("Mời bạn chọn từ 0-3:");
            chon = sc.nextInt();
            List<Student> studentsGoodList = new ArrayList<>();
            List<Student> studentsNormalList = new ArrayList<>();
            switch (chon) {
                case 1: System.out.println("Danh sách sinh viên ứng tuyển: \n" + studentList);
                break;
                case 2:
                    for(Student student: studentList){
                        if(student.getGradeLevel().equalsIgnoreCase("Giỏi" )|| student.getGradeLevel().equalsIgnoreCase("Khá")){
                            studentsGoodList.add(student);

                        }else {
                            studentsNormalList.add(student);

                        }
                    }
                    if(studentsGoodList.size()<=15 && studentsNormalList.size()<=15 &&(studentsGoodList.size()+studentsNormalList.size()) <=15){
                        System.out.println("Danh sách trúng tuyển: "+studentsGoodList +" "+studentsNormalList);
                    }else {
                        System.out.println("Chờ xét các điều kiện khác !!!");
                    }

                break;
                case 0: System.exit(0);
                break;
                default: System.out.println("Mời bạn chọn lại !!!!!!!!");
            }
        }
    }
}
