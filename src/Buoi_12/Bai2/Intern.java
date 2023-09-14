package Buoi_12.Bai2;

import java.util.Scanner;

public class Intern extends  Employee{
    String majors;
    String semester;
    String universityName;

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public Intern() {

    }

    public Intern(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String majors, String semester, String universityName) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showMyInfor() {
        super.showMyInfor();
        System.out.println("chuyên ngành: "+majors);
        System.out.println("Học kỳ đang học: "+semester);
        System.out.println("Trường: "+universityName);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Chuyên ngành: ");
        majors = sc.nextLine();
        System.out.println("Học kỳ: ");
        semester =sc.nextLine();
        System.out.println("Trường: ");
        universityName = sc.nextLine();
    }
}
