package manageLibrary.QuanLyNhanVien;

/**
 * Fresher có thêm thuộc tính:
 * Thời gian tốt nghiệp(graduationDate),
 * Xếp loại tốt nghiệp (graduationRank)
 */
public class Fresher extends Employee{
    String graduationDate;
    String graduationRank;

    public Fresher() {}

    @Override
    public String type() {
        return "Fresher";
    }

    public Fresher(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String graduationDate, String graduationRank) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
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
