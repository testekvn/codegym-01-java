package Buoi_12.resolved_cau2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
Code processing......... Chưa chạy được
 */
public class EmployeeManagement {
    public static void main(String[] args) throws EmailRuntimException {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        //Input the employee information
        int employeeCount = 1;
        int empType;
        System.out.println("Input the information: ");

        boolean isFakeData = true;
        if (!isFakeData){
            while (employeeCount <= 9){
                System.out.printf("\nEmployee: %s \nSelect employee type (1: Experience; 2:Fresher; 3:Intern ): ", employeeCount);
                ++employeeCount;
                empType = sc.nextInt();
                Employee employee;
                if (empType == 1){
                    employee = new Experience();
                } else if (empType == 2) {
                    employee = new Fresher();
                }else {
                    employee = new Intern();
                }
                //Input the employee information
                System.out.print("\tEnter empCode: ");
                String empCode = sc.nextLine();
                employee.setEmpCode(empCode);

                System.out.print("\tEnter full name: ");
                String fullName = sc.nextLine();
                employee.setFullName(fullName);

                System.out.print("\tEnter ngay sinh (dd/mm/yyyy): ");
                String doB = sc.nextLine();
                employee.setDoB(doB);

                System.out.print("\tEnter email: ");
                String email = sc.nextLine();
                employee.setEmail(email);

                System.out.print("\tEnter danh sach bang cap: ");
                employee.setEmpCertificates(DataCertification());

                if (empType == 1){
                    //Input employee Experience
                    System.out.print("\tEnter expInYear: ");
                    double expInYear = sc.nextDouble();
                    ((Experience) employee).setExpInYear(expInYear);

                    System.out.print("\tEnter proSkill: ");
                    String proSkill = sc.nextLine();
                    ((Experience) employee).setProSkill(proSkill);
                } else if (empType == 2) {
                    //Input employee Fresher
                    System.out.print("\tEnter graduationDate (dd/mm/yyyy): ");
                    String graduationDate = sc.nextLine();
                    ((Fresher) employee).setGraduationDate(graduationDate);

                    System.out.print("\tEnter graduationRank: ");
                    String graduationRank = sc.nextLine();
                    ((Fresher) employee).setGraduationRank(graduationRank);
                } else {
                    //Input employee Intern
                    System.out.print("\tEnter majors: ");
                    String majors = sc.nextLine();
                    ((Intern) employee).setMajors(majors);

                    System.out.print("\tEnter semester: ");
                    int semester = sc.nextInt();
                    ((Intern) employee).setSemester(semester);

                    System.out.print("\tEnter universityName: ");
                    String universityName = sc.nextLine();
                    ((Intern) employee).setUniversityName(universityName);
                }
                employee.showInfo();
                employeeList.add(employee);
            }
        } else {
            employeeList = FakeDataEmployee();
        }

        //Danh sach nhan vien kinh nghiem
        System.out.println("Danh sach nhan vien kinh nghiem: ");
        for (Employee employee: employeeList){
            if (employee.getEmpType() == 1){
                employee.showInfo();
                System.out.println();
            }
        }
        //Danh sach nhan vien co certificate va rank tu 8 tro len
        System.out.println("Danh sach nhan vien co certificate va rank tu 8 tro len: ");
        for (Employee employee: employeeList){
            List<Certification> certificationList = employee.getEmpCertificates();
            for (Certification certification: certificationList){
                if (certification.getRank() >=8){
                    employee.showInfo();
                }
            }
        }
    }


    //Danh sach bang cap
    private static List<Certification> DataCertification(){
        List<Certification> empCertificates = new ArrayList<>();
        empCertificates.add(new Certification("01","BestAward1",5));
        empCertificates.add(new Certification("02","BestAward2",6));
        empCertificates.add(new Certification("03","BestAward3",7));
        empCertificates.add(new Certification("04","BestAward4",8));
        empCertificates.add(new Certification("05","BestAward5",9));
        empCertificates.add(new Certification("06","BestAward6",10));
        return empCertificates;
    }
    //Danh sach nhan vien
    private static List<Employee> FakeDataEmployee() throws EmailRuntimException {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Intern("I01","Nguyen Van A","01/01/1999","nguyenvana@gmail.com",3, Collections.singletonList(DataCertification().get(0)),"DTVT",2,"HUST"));
        employeeList.add(new Intern("I02","Nguyen Van B","02/02/1999","nguyenvanb@gmail.com",3, Collections.singletonList(DataCertification().get(1)),"DTVT",2,"HAUI"));
        employeeList.add(new Intern("I03","Nguyen Van C","03/03/1999","nguyenvanc@gmail.com",3, Collections.singletonList(DataCertification().get(2)),"DTVT",2,"HANU"));
        employeeList.add(new Fresher("F01","Pham Van A","04/04/1998","phamvanA@gmail.com",2, Collections.singletonList(DataCertification().get(3)),"01/06/2020","Gioi"));
        employeeList.add(new Fresher("F02","Pham Van B","05/05/1998","phamvanB@gmail.com",2, Collections.singletonList(DataCertification().get(4)),"01/06/2020","Kha"));
        employeeList.add(new Fresher("F03","Pham Van C","06/06/1998","phamvanC@gmail.com",2, Collections.singletonList(DataCertification().get(5)),"01/06/2020","Gioi"));
        employeeList.add(new Experience("E01","Tran Van A","07/07/1997","tranvanA@gmail.com",1, Collections.singletonList(DataCertification().get(5)),4,"Management"));
        employeeList.add(new Experience("E02","Tran Van B","08/08/1996","tranvanB@gmail.com",1, Collections.singletonList(DataCertification().get(4)),5,"Management"));
        employeeList.add(new Experience("E03","Tran Van C","09/09/1995","tranvanC@gmail.com",1, Collections.singletonList(DataCertification().get(3)),6,"Management"));
        return employeeList;
    }
}
