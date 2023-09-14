package Buoi_12.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Experience> experienceList = new ArrayList<>();
        List<Intern> internList = new ArrayList<>();
        List<Fresher>fresherList = new ArrayList<>();
        System.out.println("Đây là nhân viên loại nào: 1.Experience || 2.Fresher || Khác.Intern: ");
        int chon = sc.nextInt();
        if(chon ==1){
            Experience experience1 = new Experience();
            Experience experience2 = new Experience();
            Experience experience3 = new Experience();
            experience1.input();
            experience2.input();
            experience3.input();
            experienceList.add(experience1);
            experienceList.add(experience2);
            experienceList.add(experience3);
        }
    }
}
