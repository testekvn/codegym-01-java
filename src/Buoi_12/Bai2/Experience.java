package Buoi_12.Bai2;

import java.util.Scanner;

public class Experience extends Employee{
    int explnYear;
    String proSkill;

    public int getExplnYear() {
        return explnYear;
    }

    public void setExplnYear(int explnYear) {
        this.explnYear = explnYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    public Experience() {
    }

    public Experience(String empCode, String fullName, String doB, String email, String empType, String empCertificates, int explnYear, String proSkill) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.explnYear = explnYear;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "explnYear=" + explnYear +
                ", proSkill='" + proSkill + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
    }

    @Override
    public void showMyInfor() {
        super.showMyInfor();
        System.out.println("Năm kinh nghiệm: "+ explnYear);
        System.out.println("Kỹ năng chuyên môn: "+proSkill);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Năm kinh nghiệm: ");
        explnYear = Integer.parseInt(sc.nextLine());
        System.out.println("Kỹ năng chuyên môn: ");
        proSkill =sc.nextLine();
    }
}
