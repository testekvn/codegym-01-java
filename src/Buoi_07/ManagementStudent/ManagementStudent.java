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

import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ManagementStudent {
    public static void main(String[] args) {
        List<Student> studentList;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String fullName = sc.nextLine();
        System.out.print("Ngay sinh: ");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);
//        System.out.println(strDate);
//        System.out.println(fullName);
//        if (fullName.length() <= 50 && fullName.length()>=10){
////            studentList.add()
//        } else {
//            System.out.println();
//        }
    }
}
