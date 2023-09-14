package Buoi_12.KiemTra;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;

    public Fresher() {

    }

    public Fresher(String graduationDate, String graduationRank) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Fresher(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String graduationDate, String graduationRank) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
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

    @Override
    public String toString() {
        return "Fresher{" +
                super.toString() +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(this.toString());
    }
}
