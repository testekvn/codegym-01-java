package Buoi_08.btvn.svmanagement;

/**
 * Khai bao doi tuong Student
 */
public class Student {
    private String fullName;
    private String doB;
    private String gender;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public Student() {
    }

    public Student(String fullName, String doB, String gender, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String sex) {
        this.gender = sex;
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
                ", doB='" + doB + '\'' +
                ", Gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
    public void ShowMyInfo() {
        System.out.println(this.toString());
    }
}
