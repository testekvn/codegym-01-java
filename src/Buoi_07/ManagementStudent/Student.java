package Buoi_07.ManagementStudent;

import com.sun.org.apache.xerces.internal.impl.dv.xs.StringDV;

import java.util.Scanner;

/**
 * Cả 2 loại sinh viên trên đều phải cung cấp các thông tin sau khi nộp hồ sơ xin việc:
 * Họ tên (fullName),
 * Ngày tháng năm sinh (doB),
 * Giới tính (sex),
 * Số điện thoại (phoneNumber),
 * Tên trường đã học (universityName),
 * Xếp loại tốt nghiệp (gradeLevel).
 */
public class Student {
    String fullName, sex, phoneNumber, universityName, gradeLevel, doB;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
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

    public Student(String fullName, String sex, String phoneNumber, String universityName, String gradeLevel, String doB) {
        //ham tao ra doi tuong, cac tham so truyen vao co san
        this.fullName = fullName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
            this.doB = doB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                ", doB='" + doB + '\'' +
                '}';
    }
    public Student(){ }

    public void ShowMyInfor(){
        System.out.println("Full name: "+  fullName);
        System.out.println("Sex: "+  sex);
        System.out.println("Phone number: "+  fullName);
        System.out.println("University' name: "+  universityName);
        System.out.println("Grade level: "+  gradeLevel);
        System.out.println("Date of birthday: "+  doB);
    }

    public void input(){ // ham void la ham khong tra ve
        // Student la kieu du lieu ham tra ve, ma Student la doi tuong => ham tra ve doi tuong la Student
        int countError = 4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: ");
        fullName = sc.nextLine();
        while (fullName.length() > 50 || fullName.length()<10){
            countError--;
            System.out.println("Họ tên tối thiểu 10 ký tự và tối đa 50 ký tự");
            System.out.println("Nhập sai tối đa 3 lần, lần thứ 4 sai sẽ dừng chương trình");
            System.out.println("Mời bạn nhập lại");
            System.out.println("Họ và tên: ");
            fullName = sc.nextLine();
            if (countError == 0){
                System.out.println("Dung");
                break;
            }
        }
        System.out.print("Ngày tháng năm sinh: ");
        doB = sc.nextLine();
        String[] formatDateOfBirth = doB.split("/");
        System.out.print("Giới tính: ");
        sex = sc.nextLine();
        System.out.print("Số điện thoại: ");
        phoneNumber = sc.nextLine();
        String[] formatPhoneNumber = {"090", "098", "091", "031", "035", "038"};
        if (phoneNumber.length() == 10){
            boolean isCheck = false;
            for (String phone: formatPhoneNumber) {
                if (phoneNumber.startsWith(phone)){
                    isCheck = true;
                    break;
                }
            }
            if (!isCheck) System.out.println(" ");
        } else {
            System.out.println("Sai");
        }
        System.out.print("Tên trường đã học: ");
        universityName = sc.nextLine();
        System.out.print("Xếp loại tốt nghiệp : ");
        gradeLevel = sc.nextLine();
//        Student student = new Student(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        // hoac return student;
    }
}
