package Buoi_09.qlsv;

import Buoi_07.manageLibrary.Document;

import java.text.SimpleDateFormat;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Student> goodStudentList = new ArrayList<>();
        List<Student> normalStudentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên tuyển dụng (tối thiểu là 11, tối đa là 15): ");
        int numOfStudent = sc.nextInt();
        if (numOfStudent < 11 || numOfStudent > 15) {
            System.out.println("Input files have unknow errors !!!");
        }
        System.out.println("Mhap danh sach 12 sinh vien:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Loại sinh viên (1 for GoodStudent, 2 for NormalStudent): ");
            int studentType = sc.nextInt();
            sc.nextLine();

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
//            for (Student type : studentList){
//                String sType = type.studentType();
//            }
            if (studentType == 1) {
                System.out.print("GPA: ");
                double gpa = sc.nextDouble();
                sc.nextLine();
                System.out.print("Học bổng(giải thưởng): ");
                String bestRewardName = sc.nextLine();
                GoodStudent goodStudent = new GoodStudent(fullName, doB, sex, phoneNumber, universityName,
                        gradeLevel, gpa, bestRewardName);
                studentList.add(goodStudent);
                goodStudentList.add(goodStudent);
                goodStudent.ShowMyInfor();
            } else if (studentType == 2) {
                System.out.print("Điểm TOEIC: ");
                int englishScore = sc.nextInt();
                sc.nextLine();
                System.out.print("Điểm chuyên môn: ");
                int entryTestScore = sc.nextInt();
                sc.nextLine();
                NormalStudent normalStudent = new NormalStudent(fullName, doB, sex, phoneNumber, universityName,
                        gradeLevel, englishScore, entryTestScore);
                studentList.add(normalStudent);
                normalStudentList.add(normalStudent);
                normalStudent.ShowMyInfor();
            }
            else System.out.println("Thông tin nhập loại sinh viên không hợp lệ");
        }
        //System.out.println(studentList);
//        Map<String, List<Student>> studentMap = new HashMap<>();
//        for (Student student: studentList){
//            String type = student.studentType();
//            if (type.equalsIgnoreCase(studentType))
//        }
        //Collections.sort(goodStudentList);
        //Collections.sort(normalStudentList);
        //Sắp xếp sinh viên theo GPA nếu cùng GPA sắp xếp theo tên
        goodStudentList.sort((s1, s2) -> {
            int gpaResult = Double.compare(s2.getGpa(), s1.getGpa());
            if (gpaResult == 0) {
                gpaResult = s1.getFullName().compareTo(s2.getFullName());
            }
            return gpaResult;
        });
//        normalStudentList.sort((s3, s4) -> {
//            int toeicResult = Double.compare(s4.englishScore, s3.englishScore);
//            int entryScoreResult = Double.compare(s4.entryTestScore, s3.entryTestScore);
//            if (entryScoreResult !=0){
//                return entryScoreResult;
//            } else if (toeicResult !=0) {
//                return toeicResult;
//            }
//            else {
//                return s3.getFullName().compareTo(s4.getFullName());
//            }
//        });
        //Sắp xếp sinh viên theo điểm Toeic
        normalStudentList.sort((s1, s2) -> {
            int toeicResult = Double.compare(s2.getEnglishScore(), s1.getEnglishScore());
            if (toeicResult == 0) {
                toeicResult = s1.getFullName().compareTo(s2.getFullName());
            }
            return toeicResult;
        });
        //Sắp xếp sinh viên theo điểm thi đầu vào
        normalStudentList.sort((s1, s2) -> {
            int entryResult = Double.compare(s2.getEntryTestScore(), s1.getEntryTestScore());
            if (entryResult == 0) {
                entryResult = s1.getFullName().compareTo(s2.getFullName());
            }
            return entryResult;
        });


        goodStudentList.forEach(e -> System.out.println(e));
        normalStudentList.forEach(e -> System.out.println(e));
        if (goodStudentList.size() > numOfStudent){
            System.out.println("Danh sách trúng tuyển: ");
            for (int i = 0; i < numOfStudent && i < goodStudentList.size(); i++) {
                System.out.println(goodStudentList.get(i));
            }
        } else if (goodStudentList.size() <= numOfStudent) {
            System.out.println(goodStudentList);
            for (int j = 0; j < (numOfStudent - goodStudentList.size()); j++) {
                System.out.println(normalStudentList.get(j));
            }
        }
    }
}
