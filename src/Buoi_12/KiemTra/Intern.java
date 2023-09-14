package Buoi_12.KiemTra;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {

    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String empCode, String fullName, String doB, String email, String empType, String empCertificates, String majors, int semester, String universityName) {
        super(empCode, fullName, doB, email, empType, empCertificates);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                super.toString() +
                "majors='" + majors + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
    public void showInfo(){
        System.out.println(this.toString());
    }
}
