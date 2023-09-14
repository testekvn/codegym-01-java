package Buoi_12.cau2;

public class Intern extends Employee{
    //region Fields of Intern
    String majors;           //Chuyen nganh dang hoc
    int semester;            //Hoc ky dang hoc
    String universityName;   //Ten truong dang hoc

    public Intern(String id, String name, int rank, String empCode, String fullName, String doB, String email, int empType, String majors, int semester, String universityName) {
        super(id, name, rank, empCode, fullName, doB, email, empType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
    //endregion

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
    public void showInfo() {
        super.showInfo();
        System.out.println("Chuyen nganh dang hoc: "+majors);
        System.out.println("Hoc ky dang hoc: "+semester);
        System.out.println("Ten truong dang hoc: "+universityName);
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
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
