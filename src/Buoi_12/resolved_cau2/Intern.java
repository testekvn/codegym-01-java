package Buoi_12.resolved_cau2;

import java.util.List;

public class Intern extends Employee {
    //region Fields of Intern
    String majors;           //Chuyen nganh dang hoc
    int semester;            //Hoc ky dang hoc
    String universityName;   //Ten truong dang hoc
    //endregion


    public Intern(String empCode, String fullName, String doB, String email, int empType, List<Certification> certificationList, String majors, int semester, String universityName) {
        super(empCode, fullName, doB, email, empType, certificationList);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", certificationList=" + empCertificates +
                '}';
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());
    }
}
