package Buoi_07.btvn2_9_Bai3;

import java.util.Scanner;

public class GoodStudent extends Student {
    double gpa;
    String bestRewardName;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    public GoodStudent() {
    }

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
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
        System.out.println("Điểm hệ 4: " + gpa);
        System.out.println("Giải thưởng đạt được tốt nhất: " + bestRewardName);
    }

    @Override
    public String input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Giải thưởng đạt được tốt nhất: ");
        bestRewardName = sc.nextLine();
        System.out.println("Điểm hệ 4: ");
        gpa = sc.nextDouble();
        return null;
    }
}
