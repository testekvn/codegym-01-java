package manageLibrary.QuanLyNhanVien;

/**
 * Intern có thêm thuộc tính:
 * Chuyên ngành đang học (majors),
 * Học kì đang học (semester),
 * Tên trường đang học ()
 */
public class Intern extends Employee{
    String majors;
    String semester;
    String universityName;

    public Intern() {}

    public Intern(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String majors, String semester, String universityName) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String type() {
        return "Intern";
    }
}
