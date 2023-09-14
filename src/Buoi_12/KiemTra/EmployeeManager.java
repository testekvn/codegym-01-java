package Buoi_12.KiemTra;

import Buoi_10.CD.Cd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        List<Experience> experiences = new ArrayList<>();
        List<Fresher> freshers = new ArrayList<>();
        List<Intern> interns = new ArrayList<>();
        int employeeCount = 1;
        String employeeType = null;
        System.out.print("1-Số Lượng Nhân Viên");
        int numOfCd = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhân viên thứ:");
        while (employees.size() < numOfCd) {
            System.out.println("\t\tNhân viên thứ " + (employees.size() + 1));
            Employee employee = new Employee();
            System.out.print("\t\tMã nhân viên :");
            employee.setEmpCode(sc.nextLine());
            System.out.print("\t\tHọ tên nhân viên :");
            employee.setFullName(sc.nextLine());
            System.out.print("\t\tNgày sinh :");
            employee.setDoB(sc.nextLine());
            System.out.print("\t\tĐịa chỉ email :");
            employee.setEmail(sc.nextLine());
            System.out.print("\t\tPhân Loại Nhân Viên :");
            employee.setEmpType(sc.nextLine());
            System.out.print("\t\tDanh sách bằng cấp");
            employee.setEmpCertificates(sc.nextLine());
            employees.add(employee);
            employee.showInfo();
            if(employeeType.equalsIgnoreCase("1")){
                System.out.println("\t This ís Experience");
                System.out.print("\t\t Số kinh nghiệm");
                ((Experience) employee).setExplnYear(Integer.parseInt(sc.nextLine()));
                System.out.print("\t\tKĩ năng chuyên môn");
                ((Experience)employee).setProSkill(sc.nextLine());
            }else {
                System.out.print("\t this is fresher");
                System.out.print("\t Thời Gian Tốt Nghiệp");
                ((Fresher)employee).setGraduationDate(sc.nextLine());
                System.out.print("\t Xếp loạin tốt nghiệp");
                ((Fresher)employee).setGraduationRank(sc.nextLine());
            }
        }
        //fake data
    }


    public static List<Employee> fakeDataForTesting() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Experience("E111", "Phạm Quang Minh", "13/09/2001", "minh@gmail.com", "1", "1", 2, "java"));
        employees.add(new Experience("E112", "Phạm Minh Quang", "13/08/2002", "quang@gmail.com", "1", "2", 3, "java,php"));
        employees.add(new Experience("E113", "Minh Quang Phạm", "13/07/2003", "pham@gmail.com", "1", "3", 4, "java,php,c#"));
        employees.add(new Fresher("F211", "Nguyễn Quang Minh", "23/09/2001", "minh1@gmail.com", "2", "1", "22/6/2023", "Khá"));
        employees.add(new Fresher("F212", "Nguyễn Quang Long", "12/10/2001", "long1@gmail.com", "2", "2", "26/6/2022", "Giỏi"));
        employees.add(new Fresher("F213", "Nguyễn Quang Thắng", "18/12/2001", "thang@gmail.com", "2", "2", "2/9/2023", "Giỏi"));
        employees.add(new Intern("I313", "Nguyễn Quang Trường", "28/2/2001", "truong@gmail.com", "3", "2", "cNTT", 2, "Hunre"));
        employees.add(new Intern("I312", "Nguyễn Quang Vinh", "18/1/2001", "vinh@gmail.com", "3", "1", "CNTT", 2, "HUBT"));
        employees.add(new Intern("I311", "Nguyễn Quang Duy", "1/12/2001", "duy@gmail.com", "3", "4", "CNTT", 2, "HUST"));
        return employees;

    }

}



