package Buoi_12.Bai2;

import java.util.Scanner;

public class Fresher extends Employee{
    String graduationYear;
    String graduationRank;

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public Fresher() {
    }

    public Fresher(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String graduationYear, String graduationRank) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.graduationYear = graduationYear;
        this.graduationRank = graduationRank;
    }

    @Override
    public void showMyInfor() {
        super.showMyInfor();
        System.out.println("Năm tốt nghiệp: "+ graduationYear);
        System.out.println("Xếp loại tốt nghiệp: "+graduationRank);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("năm tốt nghiệp: ");
        graduationYear =sc.nextLine();
        System.out.println("Xếp loại tốt nghiêp: ");
        graduationRank =sc.nextLine();
    }
}
