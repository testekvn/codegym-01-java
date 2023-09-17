package Buoi_12.resolved_cau2;

import java.util.List;

public class Fresher extends Employee {
    //region Fields of Fresher
    String graduationDate;  //Thoi gian tot nghiep
    String graduationRank; //Xep loai tot nghiep
    //endregion

    public Fresher(String empCode, String fullName, String doB, String email, int empType, List<Certification> certificationList, String graduationDate, String graduationRank) throws EmailRuntimException {
        super(empCode, fullName, doB, email, empType, certificationList);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }
    public Fresher(){}
    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
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

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }
}
