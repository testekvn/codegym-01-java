package Buoi_12;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
    public void nhapIntern() {
        System.out.print("Nhập mã nhân viên: ");
        empCode = scanner.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        fullName = scanner.nextLine();
        System.out.print("Ngày sinh: ");
        doB = scanner.nextLine();
        System.out.print("Nhập mail: ");
        email = scanner.nextLine();
        System.out.print("Phân loại nhân viên: ");
        empType = scanner.nextInt();
        System.out.print("Danh sách bằng cấp: ");
        empCartificates = scanner.nextLine();
        System.out.print("Chuyên ngành đang học: ");
        majors = scanner.nextLine();
        System.out.print("Học kỳ đang học: ");
        semester = scanner.nextLine();
        System.out.print("Tên trường đang học: ");
        universityName = scanner.nextLine();
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
    public String toString() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

}
