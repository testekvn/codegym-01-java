package Test.QuanLyNhanVien;

/**
 * Experience có thêm thuộc tính:
 * Số năm kinh nghiệm (expInYear),
 * Kỹ năng chuyên môn (proSkill)
 */
public class Experience extends Employee{
    int expInYear; // Số năm kinh nghiệm
    String proSkill; // Kỹ năng chuyên môn

    public Experience() {}

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Số năm kinh nghiệm: " + expInYear);
        System.out.println("Kỹ năng chuyên môn" + proSkill);
    }

    public Experience(String empCode, String fullName, String doB, String email, String empType, String empCertificates, int expInYear, String proSkill) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String type() {
        return "Experience";
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
