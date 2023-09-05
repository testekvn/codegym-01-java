package Buoi_07.btvn2_9_Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTuyenSinh {
    public static void main(String[] args) {
        List<Student> studentList = null;
        studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên tuyển sinh: ");
        int n = scanner.nextInt();
        if(n<1 || n>15){
            System.out.println("Bạn phải nhập tối thiểu là 1 sinh viên và tối đa là 15 sinh viên");
            System.exit(0);
        }else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập sinh viên thứ: " + (i + 1));
                System.out.println("Đây là sinh viên giỏi: y/n ?");
                Scanner scanner1 = new Scanner(System.in);
                String choice = scanner1.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    GoodStudent goodStudent = new GoodStudent();
                    goodStudent.input();
                    studentList.add(goodStudent);
                }
                if (choice.equalsIgnoreCase("n")) {
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
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Sắp xếp");
            System.out.println("0. Thoát");
            System.out.println("Enter your choice: ");
            System.out.println("Mời bạn chọn từ 0-3:");
            chon = sc.nextInt();
            studentList = new ArrayList<>();
            switch (chon) {
                case 1 -> System.out.println("Danh sách: \n" + studentList);
                case 2 -> System.out.println("Sắp xếp");
                case 0 -> System.exit(0);
                default -> System.out.println("Mời bạn chọn lại !!!!!!!!");
            }
        }
    }
}
