package Buoi_07.btvn2_9_Bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Student {
    String fullName;
    String doB;
    String sex;
    String phoneNumber;
    String universityName;
    String gradeLevel;

    public Student() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", doB=" + doB +
                ", sex=" + sex +
                ", phoneNumber=" + phoneNumber +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    public void ShowMyInfor() {
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Ngày tháng năm sinh: " + doB);
        System.out.println("Giới tính: " + sex);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Trường đại học: " + universityName);
        System.out.println("Xếp loại tốt nghiệp: " + gradeLevel);
    }

    public void input() {
        int numError = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên sinh viên: ");
        fullName = sc.nextLine();
        while (fullName.length() < 10 || fullName.length() > 50) {
            numError--;
            System.out.println("Họ tên tối thiểu 10 ký tự và tối đa 50 ký tự");
            System.out.println("Nhập sai tối đa 3 lần, lần thứ 4 sai sẽ dừng chương trình");
            System.out.println("Mời bạn nhập lại");
            System.out.println("Họ và tên: ");
            fullName = sc.nextLine();
            if (numError == 0) {
                System.out.println("Input files have  errors !!!");
                System.exit(1);
            }
        }
        System.out.println("Ngày tháng năm sinh: ");
        doB = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        try {
            df.parse(doB);
        } catch (ParseException e) {
            System.out.println("Invalid date");
        }
        System.out.println("Giới tính: ");
        sex = sc.nextLine();
        System.out.println("Số điện thoại: ");
        phoneNumber = sc.nextLine();
        String[] formOfPhoneNumber = {"090", "098", "091", "031", "035", "038"};
        if (phoneNumber.length() == 10) {
            boolean co = false;
            for (String phone : formOfPhoneNumber) {
                if (phoneNumber.startsWith(phone)){
                    co = true;
                    break;
                }
            }
            if(!co) System.out.println(" ");
        }else {
            System.out.println("Input files have  errors !!!");
        }
        System.out.println("Trường đại học: ");
        universityName = sc.nextLine();
        System.out.println("Xếp loại tốt nghiệp: ");
        gradeLevel = sc.nextLine();
    }
}
