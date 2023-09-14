package Buoi_07.btvn2_9_Bai3;

import java.util.*;

public class QuanLyTuyenSinh {
    public static void main(String[] args) {
        List<GoodStudent> goodStudentList = new ArrayList<>();
        List<NormalStudent> normalStudentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên ứng tuyển: ");
        int n = scanner.nextInt();
        if(n<1 || n>20){
            System.out.println("Bạn phải nhập tối thiểu là 1 sinh viên và tối đa là 20 sinh viên");
            System.exit(0);
        }else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập sinh viên thứ: " + (i + 1));
                System.out.println("Đây là sinh viên khá giỏi ?: y/n ?");
                Scanner sc = new Scanner(System.in);
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    GoodStudent goodStudent = new GoodStudent();
                    goodStudent.input();
                    goodStudentList.add(goodStudent);
                }
                else {
                    NormalStudent normalStudent = new NormalStudent();
                    normalStudent.input();
                    normalStudentList.add(normalStudent);
                }
            }
        }
        int chon = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------Menu-------------");
            System.out.println("1. Hiển thị danh sách sinh viên ứng tuyển");
            System.out.println("2. Hiển thị danh sách sinh viên trúng tuyển");
            System.out.println("0. Thoát");
            System.out.println("Enter your choice: ");
            System.out.println("Mời bạn chọn từ 0-3:");
            chon = sc.nextInt();
            switch (chon) {
                case 1: System.out.println("Danh sách sinh viên ứng tuyển: \n" + goodStudentList + normalStudentList);
                break;
                case 2: if((goodStudentList.size()+normalStudentList.size()) <=3){
                        System.out.println("Danh sách trúng tuyển: "+goodStudentList + normalStudentList);
                    }else if(goodStudentList.size()<=1 && normalStudentList.size()>=3) {
                    normalStudentList.sort(new Comparator<NormalStudent>() {
                        @Override
                        public int compare(NormalStudent o1, NormalStudent o2) {
                            if (o1.getEnglishScore() < o2.getEnglishScore()) {
                                return 1;
                            } else if (o1.getEnglishScore() > o2.getEnglishScore()) {
                                return -1;
                            } else
                                return 0;
                        }
                    });

                    for(NormalStudent p : normalStudentList){
                        System.out.println(p.getFullName());
                    }
                }
                break;
                case 0: System.exit(0);
                break;
                default: System.out.println("Mời bạn chọn lại !!!!!!!!");
            }
        }
    }
}
