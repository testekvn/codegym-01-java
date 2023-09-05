package Buoi_08.QuanLySinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // TODO: Implement your code here

        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên tuyển dụng (tối thiểu là 11, tối đa là 15): ");
        int numOfStudent = sc.nextInt();
        if (numOfStudent < 0 || numOfStudent > 15) {
            System.out.println("Input files have unknow errors !!!");
        }
        for (int i = 0; i < numOfStudent; i++) {
            System.out.print("Loại sinh viên (1 for GoodStudent, 2 for NormalStudent): ");
            int studentType = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Họ và tên: ");
            String fullName = sc.nextLine();

            System.out.print("Dob (dd/MM/yyyy): ");
            String doB = sc.nextLine();

            System.out.print("Sex: ");
            String sex = sc.nextLine();

            System.out.print("Phone number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Tên trường đã học: ");
            String universityName = sc.nextLine();

            System.out.print("Xếp loại tôt nghiệp: ");
            String gradeLevel = sc.nextLine();
            if (studentType == 1) {
                System.out.print("GPA: ");
                float gpa = sc.nextFloat();
                sc.nextLine();
                System.out.print("Học bổng(giải thưởng): ");
                String bestRewardName = sc.nextLine();
                GoodStudent goodStudent = new GoodStudent(fullName, doB, sex, phoneNumber, universityName,
                        gradeLevel, gpa, bestRewardName);
                studentList.add(goodStudent);
                goodStudent.ShowMyInfor();
            } else if (studentType == 2) {
                System.out.print("Điểm TOEIC: ");
                int englishScore = sc.nextInt();
                sc.nextLine();
                System.out.print("Điểm chuyên môn: ");
                float entryTestScore = sc.nextFloat();
                sc.nextLine();
                NormalStudent normalStudent = new NormalStudent(fullName, doB, sex, phoneNumber, universityName,
                        gradeLevel, englishScore, entryTestScore);
                studentList.add(normalStudent);
                normalStudent.ShowMyInfor();
            }
        }
    }
}




