package Buoi_12.resolved_cau2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) throws EmailRuntimException {
//        List<Employee> employeeList = new ArrayList<>();
//        List<Employee> employeeExperienceList = new ArrayList<>();

    }

    //Danh sach bang cap
    public static List<Certification> DataCertification(){
        List<Certification> empCertificates = new ArrayList<>();
        empCertificates.add(new Certification("01","BestAward1",5));
        empCertificates.add(new Certification("02","BestAward2",6));
        empCertificates.add(new Certification("03","BestAward3",7));
        empCertificates.add(new Certification("04","BestAward4",8));
        empCertificates.add(new Certification("05","BestAward5",9));
        empCertificates.add(new Certification("06","BestAward6",10));
        return empCertificates;
    }
}
