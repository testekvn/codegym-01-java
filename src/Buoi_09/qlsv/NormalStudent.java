package Buoi_09.qlsv;

import java.util.TooManyListenersException;

public class NormalStudent extends Student {
    //region Fields NormalStudent
    int englishScore;      //điểm TOEIC
    double entryTestScore; //điểm thi chuyên môn

    //endregion
    public NormalStudent(String fullName, String dob, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, double entryTestScore) {
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
                ", dob='" + dob + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
