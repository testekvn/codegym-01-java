package Buoi_08.Qlsv;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodStudent  extends Student{
    int gpa;
    String bestRewardName;

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
    public GoodStudent(){}

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, int gpa, String bestRewardName) {
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
    public class StudentComparator implements java.util.Comparator<GoodStudent>{

        @Override
        public int compare(GoodStudent a, GoodStudent b) {
            return (int) (a.getGpa() - b.getGpa());
        }
    }


    @Override
    public void ShowMyInfor() {
        super.ShowMyInfor();
        System.out.println("Điểm hệ 4: " + gpa);
        System.out.println("Giải thưởng đạt được tốt nhất: " + bestRewardName);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Giải thưởng đạt được tốt nhất: ");
        bestRewardName = sc.nextLine();
        System.out.println("Điểm hệ 4: ");
        gpa = sc.nextInt();
    }

}

