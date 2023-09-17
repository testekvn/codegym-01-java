package Test.QuanLyNhanVien;

import java.util.*;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        // Nhập vào mỗi loại 3 nhân viên (sử dụng scanner hoặc fake data) vào danh sách quản lý
        Employee fresherFirst = new Fresher("1", "Nguyen Van Anh", "07/09/2001", "vananh25@gmail.com","Fresher", "Tieng Anh", "11/11/2022", "8");
        Experience experience = new Experience("2", "Nguyen Minh Anh", "17/10/2001", "minhanh25@gmail.com","Experience", "Tieng Phap", 3, "Code");
        Experience experienceSd = new Experience("3", "Nguyen Ngoc Anh", "19/12/2000", "ngocanh99@gmail.com","Experience", "Tieng Trung", 5, "Code");
        Employee intern = new Intern("4", "Nguyen Lam Anh", "09/06/2003", "ngocanh99@gmail.com", "Intern", "Tieng Thai", "Front end", "Ky Fall", "FPT Poly");
        // Fresher
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(fresherFirst);

        List<Experience> experienceList = new ArrayList<>();
        experienceList.add(experienceSd);
        experienceList.add(experience);
//        employeeList.add(experience);
//        employeeList.add(experienceSd);
        employeeList.add(intern);
        System.out.println("Danh sach nhan vien: ");
        System.out.println(employeeList);
        System.out.println(experienceList);
        // Viết chương trình tìm tất cả các nhân viên experience .

        System.out.println("Tất cả các nhân viên experience");
        for (Experience a: experienceList) {
            a.showInfo();
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap loai tai lieu can tim kiem: \nNhap 1: Experience \nNhap 2: Intern \nNhap 3: Fresher");
//        String typeEmp = sc.nextLine();
//        Map<String, List<Employee>> map = new HashMap<>();
//        boolean check = true;
//        for (Employee employee: employeeList) {
//            String searchType = employee.type();
//            if (searchType.equalsIgnoreCase(typeEmp)){
//                List<Employee> tmp;
//                if (!map.containsKey(typeEmp)){
//                    tmp = new ArrayList<>();
//                } else {
//                    tmp = map.get(typeEmp);
//                }
//                tmp.add(employee);
//                map.put(typeEmp, tmp);
//                check = false;
//            }
//        }
//        if (check){
//            System.out.println("Nhap lai");
//        } else {
//            System.out.println("Danh sach Experience");
//            System.out.println(map.get(typeEmp));
//
//        }
    }
}
