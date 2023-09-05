package Buoi_07.student;

import java.util.Scanner;

public class ManagementStudent {
    public static void main(String[] args) {
        // Tạo một mảng chứa danh sách các sinh viên ứng tuyển
        Student[] dsSinhVien = new Student[]{
                new Student("Nguyễn Văn A", 3.6, 85, 810),
                new Student("Trần Thị B", 3.4, 82, 790),
                new Student("Lê Văn C", 3.7, 88, 820),
                new Student("Phạm Thị D", 3.5, 80, 800),
                new Student("Hoàng Văn E", 3.2, 78, 770),
                new Student("Đặng Thị F", 3.8, 90, 830),
                new Student("Nguyễn Thị G", 3.1, 76, 760),
                new Student("Vũ Văn H", 3.9, 92, 840),
                new Student("Trần Văn I", 3.3, 79, 780),
                new Student("Lê Thị J", 4.0, 95, 850),
                new Student("Phạm Văn K", 2.9, 74, 750),
                new Student("Hoàng Thị L", 3.0, 75, 780),
                new Student("Đặng Văn M", 2.8, 73, 740),
                new Student("Vũ Thị N", 2.7, 72, 730),
                new Student("Trần Văn O", 2.6, 71, 720)
        };

        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên cần tuyển dụng từ bàn phím
        System.out.print("Nhập số lượng sinh viên cần tuyển dụng (tối thiểu là 11, tối đa là 15): ");
        int soLuongCanTuyen = sc.nextInt();

        Student[] dsTrungTuyen = new Student[soLuongCanTuyen];

        for (int i = 0; i < soLuongCanTuyen; i++) {
            dsTrungTuyen[i] = dsSinhVien[i];
        }

        // In ra danh sách sinh viên trúng tuyển
        System.out.println("Danh sách sinh viên trúng tuyển là:");
        for (int i = 0; i < soLuongCanTuyen; i++)
        { Student sv = dsTrungTuyen[i];
            // Lấy ra sinh viên thứ i trong mảng dsTrungTuyen
            System.out.println("Họ tên: " + sv.getHoTen());
            System.out.println("Điểm GPA: " + sv.getGpa());
            System.out.println("Điểm thi đầu vào: " + sv.getDiemThiDauVao());
            System.out.println("Điểm TOEIC: " + sv.getDiemToeic());
            System.out.println("Khá giỏi: " + sv.isKhaGioi());
            System.out.println("------------------------"); }
    }
}
