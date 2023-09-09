package Buoi_07.ManagementStudent;

/**
 *  Có 2 loại sinh viên bao gồm sinh viên tốt nghiệp loại khá giỏi (GoodStudent) và sinh viên tốt nghiệp loại trung bình
 *  (NormalStudent).
 * + Cả 2 loại sinh viên trên đều phải cung cấp các thông tin sau khi nộp hồ sơ xin việc: Họ tên (fullName), Ngày tháng
 * năm sinh (doB), Giới tính (sex), Số điện thoại (phoneNumber), Tên trường đã học (universityName), Xếp loại tốt nghiệp
 * (gradeLevel).
 * + Riêng sinh viên loại khá giỏi phải có thêm thông tin: điểm trung bình học tập (gpa) theo thang điểm 10, tên của
 * loại học bổng (hoặc giải thưởng) cao nhất đã từng giành được (bestRewardName).
 * + Riêng sinh viên loại trung bình thì phải có thêm các thông tin: điểm TOEIC (englishScore), điểm thi đầu vào chuyên
 * môn do công ty tổ chức thi (entryTestScore) theo thang điểm 10. <br>
 *   Thực hiện các tính năng:
 * + Thiết kế và viết code thể hiện các class của các sinh viên và lớp học của chương trình làm sao để tuân thủ theo mô
 * hình OOP <br>
 *   Lưu ý: Bất kì một sinh viên nào cũng cần có một phương thức có tên là ShowMyInfor để hiển thị thông tin
 *   của sinh viên đó ra màn hình cosole, yêu cầu này là bắt buộc với các thành viên xây dựng code cho chương
 *   trình này. Bạn hãy lưu ý khi thiết kế code để thỏa mãn yêu cầu này.
 *
 *
 *   Kiểm tra ràng buộc dữ liệu cho chương trình. Dữ liệu của các file input phải tuân thủ theo ràng buộc sau:
 *    + Họ tên sinh viên có chiều dài tối đa là 50 ký tự và tổi thiểu là 10 ký tự. Nếu sai cho phép nhập tổng 3 lần.
 *    Quá hạn dừng chương trình và không được nhập thông tin nữa
 *    + Chương trình phải bắt được lỗi sai định dạng ngày tháng năm đối với trường DoB phải theo định dạng dd/MM/YYYY.
 *    Throw InvalidDOBException nếu có thông tin không chính xác
 *    + Số điện thoại: phải là chuỗi số có chiều dài 10 ký tự và phải bắt đầu bằng một trong các chuỗi số: 090, 098,
 *    091, 031, 035 hoặc 038. Throw InvalidPhoneNumberException nếu SĐT không hợp lệ
 *    + Ngoài ra nếu có bất cứ một exception nào khác trong quá trình thực thi chương trình, hãy thông báo ra màn hình
 *    nội dung “Input files have unknow errors !!!”
 *
 * + In ra danh sách sv trúng tuyển theo các nguyên tắc sau:
 *    + Người dùng sẽ nhập vào số lượng sinh viên cần tuyển dụng (tối thiểu là 11, tối đa là 15).
 *    + Chương trình sẽ tự động chọn ra ứng viên phù hợp cho công ty theo các bước như sau:
 *       + Nếu số lượng ứng viên là sinh viên khá giỏi có nhiều hơn số lượng cần tuyển thì xét ưu tiên theo điểm GPA.
 *       Nếu xuất hiện ứng viên khá giỏi có cùng điểm GPA thì xét ưu tiên theo họ tên. Vd: nếu họ tên là Nguyễn Văn A
 *       và Nguyễn Văn B thì ứng viên Nguyễn Văn A được chọn. (Giả sử không bao giờ có sinh viên có trùng họ tên nhau).
 *       + Nếu số lượng ứng viên là sinh viên khá giỏi ít hơn hoặc bằng số lượng cần tuyển thì nhận hết sinh viên khá giỏi.
 *       + Sau khi tuyển hết ứng viên khá giỏi, nếu vẫn chưa đủ số lượng cần tuyển, chương trình sẽ lấy ứng viên trung
 *       bình. Các ứng viên trung bình được xét ưu tiên theo điểm thi đầu vào, nếu điểm thi đầu vào bằng nhau thì xét
 *       đến điểm TOEIC. Nếu xuất hiện ứng viên trung bình có cùng điểm TOEIC thì xét ưu tiên theo họ tên.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ManagementStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();// studentList chua tat ca sv nhap vao
        List<ExcellentStudent> excellentStudentsList = new ArrayList<>();
        List<AverageStudent> averageStudentsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sv: ");
        int quantityStudent = sc.nextInt();
        if (quantityStudent >0 && quantityStudent < 6){
            for (int i = 0; i < quantityStudent; i++) {
                Student student = new Student();
                student.input();
                studentList.add(student);
                if (student.gradeLevel.equalsIgnoreCase("kha") || student.gradeLevel.equalsIgnoreCase("gioi")){
                    System.out.print("điểm trung bình học tập (gpa) theo thang điểm 10: ");
                    float gpa = Float.parseFloat(sc.nextLine());
                    System.out.println("loại học bổng (hoặc giải thưởng) cao nhất đã từng giành được (bestRewardName): ");
                    String bestRewardName = sc.nextLine();
                    ExcellentStudent excellentStudent = new ExcellentStudent(student.fullName, student.sex, student.phoneNumber, student.universityName, student.doB, student.gradeLevel, gpa, bestRewardName);
                    excellentStudentsList.add(excellentStudent);
                } else {
                    System.out.print("điểm TOEIC : ");
                    float englishScore = Float.parseFloat(sc.nextLine());
                    System.out.print("điểm thi đầu vào chuyên môn do công ty tổ chức thi (entryTestScore) theo thang điểm 10: ");
                    float entryTestScore = Float.parseFloat(sc.nextLine());
                    AverageStudent averageStudent = new AverageStudent(student.fullName, student.sex, student.phoneNumber, student.universityName, student.gradeLevel, student.doB, englishScore, entryTestScore);
                    averageStudentsList.add(averageStudent);
                }
                System.out.println("Nhap so luong sinh vien can tuyen");
                int quantityStudentApply = Integer.parseInt(sc.nextLine());
                System.out.println("Danh sach sinh vien trung tuyen");
//              SV  khá giỏi có cùng điểm GPA thì xét ưu tiên theo họ tên
                if (quantityStudentApply <= excellentStudentsList.size()){
                    excellentStudentsList.sort((exstuden1, exstudent2) ->{
                        if (exstuden1.getGpa() == exstudent2.getGpa()){
                            return exstuden1.getFullName().compareTo(exstudent2.getFullName());
                        }
                        return Double.compare(exstuden1.getGpa(), exstudent2.getGpa());
                    });
                    for (ExcellentStudent studentApply: excellentStudentsList) {
                        studentApply.ShowMyInfor();
                    }
                }
//                Nếu số lượng ứng viên là sinh viên khá giỏi ít hơn hoặc bằng số lượng cần tuyển thì nhận hết sinh viên khá giỏi.
                if (quantityStudentApply >= excellentStudentsList.size()){
                    for (ExcellentStudent studentApply: excellentStudentsList) {
                        studentApply.ShowMyInfor();
                    }
                }
//                Sau khi tuyển hết ứng viên khá giỏi, nếu vẫn chưa đủ số lượng cần tuyển, chương trình sẽ lấy ứng viên trung
// *       bình. Các ứng viên trung bình được xét ưu tiên theo điểm thi đầu vào, nếu điểm thi đầu vào bằng nhau thì xét
// *       đến điểm TOEIC. Nếu xuất hiện ứng viên trung bình có cùng điểm TOEIC thì xét ưu tiên theo họ tên.
                if (quantityStudentApply <= averageStudentsList.size()){
                    averageStudentsList.sort((exstuden1, exstudent2) ->{
                        if (exstuden1.getEnglishScore() == exstudent2.getEnglishScore()){
                            return exstuden1.getFullName().compareTo(exstudent2.getFullName());
                        }
                        return Double.compare(exstuden1.getEnglishScore(), exstudent2.getEnglishScore());
                    });
                    for (AverageStudent studentApply: averageStudentsList) {
                        studentApply.ShowMyInfor();
                    }
                }





            }

//            System.out.println("Tat ca sinh vien");
//            for ( Student student: studentList){
//                student.ShowMyInfor();
//            }
            System.out.println("Tat ca sinh vien kha gioi");
            for (ExcellentStudent excellentStudent: excellentStudentsList){
                excellentStudent.ShowMyInfor();
            }
//            System.out.println("Tat ca sinh vien trung binh");
//            for (AverageStudent averageStudent: averageStudentsList){
//                averageStudent.ShowMyInfor();
//            }
        }

    }
}
