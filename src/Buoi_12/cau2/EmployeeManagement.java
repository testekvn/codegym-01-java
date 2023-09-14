package Buoi_12.cau2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeExperience = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach nhan vien: ");
        for (int i = 0; i <9; i++){
            System.out.printf("Nhap loai nhan vien: ");
            int empType = sc.nextInt();

            System.out.printf("Ma nhan vien: ");
            String empCode = sc.nextLine();

            System.out.printf("Ho ten nhan vien: ");
            String fullName = sc.nextLine();

            System.out.printf("Ngay sinh: ");
            String doB = sc.nextLine();

            System.out.printf("Dia chi email nhan vien: ");
            String email = sc.nextLine();

            System.out.printf("Certificates: ");
            String empCertificates = sc.nextLine();

            System.out.printf("Nhap thong tin Certificate:");
            System.out.printf("- ID:");
            String id = sc.nextLine();

            System.out.printf("- Name:");
            String name = sc.nextLine();

            System.out.println("- Rank");
            int rank = sc.nextInt();

            switch (empType){
                case 1:
                    System.out.printf("So nam kinh nghiem: ");
                    double expInYear = sc.nextDouble();

                    System.out.printf("Ky nang chuyen mon: ");
                    String proSkill = sc.nextLine();
                    Experience experience = new Experience(id, name, rank, empCode, fullName, doB, email, empType, expInYear, proSkill);
                    employeeList.add(experience);
                    employeeExperience.add(experience);
                case 2:
                    System.out.printf("Thoi gian tot nghiep: ");
                    String graduationDate = sc.nextLine();

                    System.out.printf("Xep loai tot nghiep: ");
                    String graduationRank = sc.nextLine();
                    Fresher fresher = new Fresher(id, name, rank, empCode, fullName, doB, email, empType, graduationRank, graduationDate);
                    employeeList.add(fresher);
                case 3:
                    System.out.printf("Chuyen nganh dang hoc: ");
                    String majors = sc.nextLine();

                    System.out.printf("Hoc ky dang hoc: ");
                    int semester = sc.nextInt();

                    System.out.printf("Ten truong dang hoc: ");
                    String universityName = sc.nextLine();
                    Intern intern = new Intern(id, name, rank, empCode, fullName, doB, email, empType, majors, semester, universityName);
                    employeeList.add(intern);
            }
            System.out.println("Danh sach nhan vien kinh nghiem:");
            employeeExperience.forEach(e -> System.out.println(e));


        }
    }
}
