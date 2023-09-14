package Buoi_12.Bai2;

import java.util.Scanner;

public class Employee {
    String empCode;
    String fullName;
    String doB;
    String email;
    String empType;
    String empCertificates;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getEmpCertificates() {
        return empCertificates;
    }

    public void setEmpCertificates(String empCertificates) {
        this.empCertificates = empCertificates;
    }

    public Employee() {
    }

    public Employee(String empCode, String fullName, String doB, String email, String empType, String empCertificates) {
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = email;
        this.empType = empType;
        this.empCertificates = empCertificates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
    }
    public  void showMyInfor(){
        System.out.println("Mã nhân viên: "+ empCode);
        System.out.println("Họ và tên: "+fullName);
        System.out.println("Ngày tháng năm sinh: "+ doB);
        System.out.println("Email: "+email);
        System.out.println("Loại nhân viên: "+empType);
        System.out.println("Bằng cấp: "+ empCertificates);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        empCode =sc.nextLine();
        System.out.println("Nhập họ tên nhân viên: ");
        fullName =sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh: ");
        doB = sc.nextLine();
        System.out.println("Nhập địa chỉ email nhân viên: ");
        email =sc.nextLine();
        System.out.println("Nhập loại nhân viên: 1.Experience 2.Fresher 3.Intern: ");
        empType =sc.nextLine();
        System.out.println("Nhập bằng cấp: ");
        empCertificates =sc.nextLine();
    }
}
