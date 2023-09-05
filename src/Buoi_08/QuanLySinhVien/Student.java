package Buoi_08.QuanLySinhVien;

public class Student {
    String fullName;
    String doB;
    String sex;
    String phoneNumber;
    String universityName;
    String gradeLevel;

    public Student(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
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

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", doB=" + doB +
                ", sex='" + sex + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    public void ShowMyInfor() {
        System.out.println("Họ Và Tên: " + fullName);
        System.out.println("Giới Tính: " + sex);
        System.out.println("Số Điện Thoại: " + fullName);
        System.out.println("Tên Trường: " + universityName);
        System.out.println("Xếp Loại Tốt Nghiệp: " + gradeLevel);
    }
}

