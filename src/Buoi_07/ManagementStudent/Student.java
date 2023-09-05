package Buoi_07.ManagementStudent;

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
    String fullName, sex, phoneNumber, universityName, gradeLevel;


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

    public Student(String fullName, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
    public void ShowMyInfor(){
        System.out.println("Full name: "+  fullName);
        System.out.println("Sex: "+  sex);
        System.out.println("Phone number: "+  fullName);
        System.out.println("University' name: "+  universityName);
        System.out.println("Grade level: "+  gradeLevel);
    }
}
