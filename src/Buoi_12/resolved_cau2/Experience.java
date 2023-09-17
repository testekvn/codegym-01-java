package Buoi_12.resolved_cau2;

import java.util.List;

public class Experience extends Employee {
    //region Fields of Experience
    double expInYear;   //So nam kinh nghiep
    String proSkill;    //Ky nang chuyen mon
    //endregion

    public Experience(String empCode, String fullName, String doB, String email, int empType, List<Certification> certificationList, double expInYear, String proSkill) throws EmailRuntimException {
        super(empCode, fullName, doB, email, empType, certificationList);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public Experience(){}
    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
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

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
