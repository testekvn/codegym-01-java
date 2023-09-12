package Buoi_08.QuanLySinhVien;

import java.util.Scanner;

public class NormalStudent extends Student {
    int englishScore;      //điểm TOEIC
    int entryTestScore; //điểm thi chuyên môn

    public int getEnglishScore() {
        return englishScore;
    }

    public int getEntryTestScore() {
        return entryTestScore;
    }

    //endregion
    public NormalStudent(String fullName, String dob, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, int entryTestScore) {
        super(fullName, dob, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void ShowMyInfor() {
        System.out.println("Thông tin NormalStudent");
        super.ShowMyInfor();
        System.out.println("Điểm TOEIC: "+ englishScore);
        System.out.println("Điểm thi chuyên môn: "+entryTestScore);
    }

    @Override
    public String studentType() {
        return "2";
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", dob='" + doB + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student student) {
//        int toeicCompare = Double.compare(englishScore, student.englishScore);
//        int entryScoreComapre = Double.compare(entryTestScore, student.entryTestScore);
//        if (entryScoreComapre != 0) {
//            return -entryScoreComapre;
//        } else if (toeicCompare != 0) {
//            return -toeicCompare;
//        }
        return this.fullName.compareTo(student.getFullName());
    }
}
