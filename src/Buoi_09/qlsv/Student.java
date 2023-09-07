package Buoi_09.qlsv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public abstract class Student implements Comparable<Student> {
    //protected double gpa;
    //protected int englishScore;
    //protected int entryTestScore;
    //protected double getGpa;
    //region Fields Student
    String fullName;       //Họ tên sinh viên
    String dob;            //Ngày tháng năm sinh
    String sex;            //Giới tính
    String phoneNumber;    //Số điện thoại
    String universityName; //Tên trường đã học
    String gradeLevel;     //Xếp loại tốt nghiệp
    //endregion

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    /*
 Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần. Quá hạn dừng chương trình và không được nhập thông tin nữa
 */
    public String validateFullName(String fullName) {
        int numError = 3; //Số lần nhập sai tối đa
        Scanner sc = new Scanner(System.in);
        while (fullName.length() < 10 || fullName.length() > 50) {
            numError--;
            System.out.println("Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần. Quá hạn dừng chương trình và không được nhập thông tin nữa!");
            System.out.println("Họ và tên: ");
            fullName = sc.nextLine();
            if (numError == 0) {
                System.out.println("Input files have unknow errors !!!");
                break;
            }
        }
        return fullName;
    }

    /*
    Chương trình phải bắt được lỗi sai định dạng ngày tháng năm đối với trường DoB phải theo định dạng dd/MM/YYYY. Throw InvalidDOBException nếu có thông tin không chính xác
     */
    public String validateDOB(String dob) {
        String[] dateParts = dob.split("/");
        if (dateParts.length != 3) {
            System.out.println("Invalid date");
        } else {
                int dd = Integer.parseInt(dateParts[0]);
                int mm = Integer.parseInt(dateParts[1]);
                int yyyy = Integer.parseInt(dateParts[2]);
                if (yyyy < 1970 || yyyy > 2024 || mm < 1 || mm > 12 || dd < 1 || dd > 31) {
                    return "Invalid date";
                }
//                if (mm == 2) {
//                    if (yyyy % 4 == 0) {
//
//                    }
//                }
        }
        return dob;
    }

    /*
    Số điện thoại: phải là chuỗi số có chiều dài 10 ký tự và phải bắt đầu bằng một trong các chuỗi số: 090, 098, 091, 031, 035 hoặc 038. Throw InvalidPhoneNumberException nếu SĐT không hợp lệ
     */
    public String validatePhoneNumber(String phoneNumber) {
        String[] formOfPhoneNumber = {"090", "098", "091", "031", "035", "038"};
        if (phoneNumber.length() == 10) {
            boolean validPhone = false;
            for (String phone : formOfPhoneNumber) {
                if (phoneNumber.startsWith(phone)) {
                    validPhone = true;
                    return phoneNumber;
                }
            }
            if (!validPhone) System.out.println("Throw InvalidPhoneNumberException");
        }
        return phoneNumber;
    }


    public Student(String fullName, String dob, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = validateFullName(fullName);
        this.dob = String.valueOf(validateDOB(dob));
        this.sex = sex;
        this.phoneNumber = validatePhoneNumber(phoneNumber);
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public void ShowMyInfor() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Ngày tháng năm sinh: " + dob);
        System.out.println("Giới tính: " + sex);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Tên trường đã học: " + universityName);
        System.out.println("Xếp loại tốt nghiệp: " + gradeLevel);
    }

    public String studentType() {
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }

    public double getGpa() {
        return 0;
    }

    public int getEntryTestScore() {
        return  0;
    }

    public int getEnglishScore() {
        return 0;
    }
}
