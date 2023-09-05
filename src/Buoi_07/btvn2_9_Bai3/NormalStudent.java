package Buoi_07.btvn2_9_Bai3;

import java.util.Scanner;

public class NormalStudent extends Student {
    int englishScore;
    double entryTestScore;

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    public NormalStudent() {

    }

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, double entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
                ", fullName='" + fullName + '\'' +
                ", doB=" + doB +
                ", sex='" + sex + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    public void ShowMyInfor() {
        super.ShowMyInfor();
        System.out.println("Điểm Toeic: " + englishScore);
        System.out.println("Điểm test đầu vào: " + entryTestScore);
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm Toeic: ");
        englishScore = Integer.parseInt(sc.nextLine());
        System.out.println("Điểm test đầu vào: ");
        entryTestScore = sc.nextDouble();


    }
}
