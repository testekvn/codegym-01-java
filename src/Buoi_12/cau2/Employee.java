package Buoi_12.cau2;

import java.util.Scanner;

public abstract class Employee extends Certification {
    //region Fields of Employee
    String empCode;        //Ma nhan vien
    String fullName;       //Ten nhan vien
    String doB;            //Ngay sinh
    String email;          //Dia chi mail nhan vien
    int empType;           //Phan loai nhan vien (1. Experience; 2. Fresher; 3. Intern)


    public Employee(String id, String name, int rank, String empCode, String fullName, String doB, String email, int empType) {
        super(id, name, rank);
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = ValidateEmail(email);
        this.empType = empType;
    }
    //endregion

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

    public void showInfo(){
        System.out.println("Ma nhan vien: "+empCode);
        System.out.println("Ho ten nhan vien: "+fullName);
        System.out.println("Ngay sinh: "+ doB);
        System.out.println("Dia chi email nhan vien: "+email);
        System.out.println("Phan loai nhan vien: "+empType);
        System.out.println("Danh sach bang cap: ");
        System.out.println("- ID: "+id);
        System.out.println("- Name: "+name);
        System.out.println("- Rank: "+rank);
    };



    public String ValidateEmail(String email){
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
        try{
            for (int i = 0; i < email.length(); i++){
                if (email.charAt(i) == '@'){
                    System.out.println("Email hop le");
                }
            }
        }catch (Exception e){
            System.out.println("Email khong hop le: "+e);
        }
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
