package Buoi_12;

import java.util.Scanner;

public class Employee {
    static String empCode;
    static String fullName;
    static String doB;
    static String email;
    static int empType;
    static String empCartificates;
    Scanner scanner = new Scanner(System.in);
    public Employee(String empCode, String fullName, String doB, String email, int empType, String empCartificates) {
        super();
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = email;
        this.empType = empType;
        this.empCartificates = empCartificates;
    }

    public String getEmpCode() {
        return empCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDoB() {
        return doB;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpType() {
        return empType;
    }

    public String getEmpCartificates() {
        return empCartificates;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public void setEmpCartificates(String empCartificates) {
        this.empCartificates = empCartificates;
    }
    public void nhap() {
        System.out.print("Nhập mã nhân viên: ");
        empCode = scanner.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        fullName = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        doB = scanner.nextLine();
        System.out.print("Nhập mail: ");
        email = scanner.nextLine();
        System.out.print("Phân loại nhân viên: ");
        empType = scanner.nextInt();
        System.out.print("Danh sách bằng cấp: ");
        empCartificates = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "scanner=" + scanner +
                '}';
    }

    public Employee() {
        super();
    }

}
