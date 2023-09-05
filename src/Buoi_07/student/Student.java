package Buoi_07.student;

public class Student implements Comparable<Student>{
    // Các thuộc tính của sinh viên
    private final String hoTen; // Họ tên
    private final double gpa; // Điểm GPA
    private final int diemThiDauVao; // Điểm thi đầu vào
    private final int diemToeic; // Điểm TOEIC
    private final boolean khaGioi; // Có phải là sinh viên khá giỏi hay không

    // Phương thức khởi tạo của lớp SinhVien
    public Student(String hoTen, double gpa, int diemThiDauVao, int diemToeic) {
        this.hoTen = hoTen;
        this.gpa = gpa;
        this.diemThiDauVao = diemThiDauVao;
        this.diemToeic = diemToeic;
        this.khaGioi = (gpa >= 3.5 && diemThiDauVao >= 80 && diemToeic >= 800); // Điều kiện để là sinh viên khá giỏi
    }

    // Phương thức so sánh hai sinh viên theo các tiêu chí khác nhau
    public int compareTo(Student sv) {
        if (this.khaGioi && !sv.khaGioi) { // Nếu sinh viên này khá giỏi mà sinh viên kia không khá giỏi thì ưu tiên sinh viên này
            return -1;
        }
        if (!this.khaGioi && sv.khaGioi) { // Nếu sinh viên này không khá giỏi mà sinh viên kia khá giỏi thì ưu tiên sinh viên kia
            return 1;
        }
        if (this.khaGioi && sv.khaGioi) { // Nếu cả hai sinh viên đều khá giỏi thì so sánh theo điểm GPA
            if (this.gpa > sv.gpa) { // Nếu điểm GPA của sinh viên này cao hơn điểm GPA của sinh viên kia thì ưu tiên sinh viên này
                return -1;
            }
            if (this.gpa < sv.gpa) { // Nếu điểm GPA của sinh viên này thấp hơn điểm GPA của sinh viên kia thì ưu tiên sinh viên kia
                return 1;
            }
            if (this.gpa == sv.gpa) { // Nếu điểm GPA của cả hai sinh viên bằng nhau thì so sánh theo họ tên
                return this.hoTen.compareTo(sv.hoTen); // Sử dụng phương thức compareTo của lớp String để so sánh họ tên theo thứ tự từ điển
            }
        }
        if (!this.khaGioi && !sv.khaGioi) { // Nếu cả hai sinh viên đều không khá giỏi thì so sánh theo điểm thi đầu vào
            if (this.diemThiDauVao > sv.diemThiDauVao) { // Nếu điểm thi đầu vào của sinh viên này cao hơn điểm thi đầu vào của sinh viên kia thì ưu tiên sinh viên này
                return -1;
            }
            if (this.diemThiDauVao < sv.diemThiDauVao) { // Nếu điểm thi đầu vào của sinh viên này thấp hơn điểm thi đầu vào của sinh viên kia thì ưu tiên sinh viên kia
                return 1;
            }
            if (this.diemThiDauVao == sv.diemThiDauVao) { // Nếu điểm thi đầu vào của cả hai sinh viên bằng nhau thì so sánh theo điểm TOEIC
                if (this.diemToeic > sv.diemToeic) { // Nếu điểm TOEIC của sinh viên này cao hơn điểm TOEIC của sinh viên kia thì ưu tiên sinh viên này
                    return -1;
                }
                if (this.diemToeic < sv.diemToeic) { // Nếu điểm TOEIC của sinh viên này thấp hơn điểm TOEIC của sinh viên kia thì ưu tiên sinh viên kia
                    return 1;
                }
                if (this.diemToeic == sv.diemToeic) { // Nếu điểm TOEIC của cả hai sinh viên bằng nhau thì so sánh theo họ tên
                    return this.hoTen.compareTo(sv.hoTen); // Sử dụng phương thức compareTo của lớp String để so sánh họ tên theo thứ tự từ điển
                }
            }
        }
        return 0; // Trả về 0 nếu hai sinh viên bằng nhau theo tất cả các tiêu chí
    }

    // Phương thức trả về họ tên của sinh viên
    public String getHoTen() {
        return this.hoTen;
    }

    // Phương thức trả về điểm GPA của sinh viên
    public double getGpa() {
        return this.gpa;
    }

    // Phương thức trả về điểm thi đầu vào của sinh viên
    public int getDiemThiDauVao() {
        return this.diemThiDauVao;
    }

    // Phương thức trả về điểm TOEIC của sinh viên
    public int getDiemToeic() {
        return this.diemToeic;
    }

    // Phương thức trả về trạng thái khá giỏi của sinh viên
    public boolean isKhaGioi() {
        return this.khaGioi;
    }
}
