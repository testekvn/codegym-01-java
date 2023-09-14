package Buoi_12.KiemTra;

import java.security.cert.Certificate;
import java.util.List;

public class Employee {
    private String empCode; // Mã Nhân Viên
    private String fullName; // Họ Và Tên;
    private String doB; // Ngày Sinh
    private String email; // email
    private String empType;
    private String empCertificates;
    List<Certificate> certificates;


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

    public void showInfo() {
        System.out.println(this.toString());
    }

}
