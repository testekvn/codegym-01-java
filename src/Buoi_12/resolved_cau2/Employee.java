package Buoi_12.resolved_cau2;

import java.util.Scanner;
import java.util.List;

public abstract class Employee {
    //region Fields of Employee
    String empCode;                         //Ma nhan vien
    String fullName;                        //Ten nhan vien
    String doB;                             //Ngay sinh
    String email;                           //Dia chi mail nhan vien
    int empType;                            //Phan loai nhan vien (1. Experience; 2. Fresher; 3. Intern)
    List<Certification> empCertificates;  //Danh sach bang cap
    //endregion

    public Employee(String empCode, String fullName, String doB, String email, int empType, List<Certification> empCertificates) throws EmailRuntimException {
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = ValidateEmail(email);
        this.empType = empType;
        this.empCertificates = empCertificates;
    }
    public Employee(){}
    //endregion

    //region getter and setter
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

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public List<Certification> getEmpCertificates() {
        return empCertificates;
    }

    public void setEmpCertificates(List<Certification> empCertificates) {
        this.empCertificates = empCertificates;
    }
    //endregion

    //Phuong thuc abstract showInfo in ra thong tin nhan vien
    public abstract void showInfo();


    //kiem tra tinh hop le cua email (email phai co ky tu @)
    public static String ValidateEmail(String email) throws EmailRuntimException {
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        if (email.matches("@")) {
            return email;
        } else throw new EmailRuntimException("The email is invalid!");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", certificationList=" + empCertificates +
                '}';
    }
}
