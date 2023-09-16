package Test.QuanLyNhanVien;

/**
 * Công ty cần quản lý nhân viên để phục vụ đánh giá, xếp loại và khen thưởng cho nhân viên, bạn hãy phát triển chương trình chi tiết như sau:
 * Công ty sẽ có 03 cấp bậc nhân viên (Intern, Fresher, Experience), trong đó tất cả các nhân viên (Employee) đều có các thông tin chung như:
 * Thuộc tính:
 * empCode: Mã nhân viên,
 * fullName: Họ tên nhân viên
 * doB: Ngày sinh
 * email: Địa chỉ email nhân viên
 * empType: Phân loại nhân viên (1: Experience;  2: Fresher; 3: Intern)
 * empCertificates : Danh sách bằng cấp
 */
public class Employee {
    String empCode;
    String fullName;
    String doB;
    String email;
    String empType; //Phân loại nhân viên (1: Experience;  2: Fresher; 3: Intern)
    String empCertificates; //Danh sách bằng cấp

    public Employee() {
    }

    public Employee(String empCode, String fullName, String doB, String email, String empType, String empCertificates) {
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = email;
        this.empType = empType;
        this.empCertificates = empCertificates;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public String getEmpCertificates() {
        return empCertificates;
    }

    public void setEmpCertificates(String empCertificates) {
        this.empCertificates = empCertificates;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType='" + empType + '\'' +
                ", empCertificates='" + empCertificates + '\'' +
                '}';
    }
    public String type(){
        return "Employee";
    }
    public void showInfo(){
        System.out.println("Ma nhan vien: "+empCode);
        System.out.println("Ho ten nhan vien: "+fullName);
        System.out.println("Ngay sinh: "+ doB);
        System.out.println("Dia chi email nhan vien: "+email);
        System.out.println("Phan loai nhan vien: "+empType);
        System.out.println("Danh sach bang cap: ");
    };

}