package Buoi_08.QuanLyVeBay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ChuyenBay> chuyenBayList = new ArrayList<>();
        List<HanhKhach> hanhKhachList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng chuyến bay : ");
        int numChuyenBay = sc.nextInt();
        for (int i =0; i<numChuyenBay;i++){
            ChuyenBay chuyenBay =new ChuyenBay();
            chuyenBay.PrintInfo();
            chuyenBayList.add(chuyenBay);
        }
        System.out.println("Danh sách chuyến bay: "+chuyenBayList);
        System.out.println("Nhập số lượng hành khách: ");
//        int numHanhKhach = sc.nextInt();
//        for (int j =0;j<numHanhKhach;j++){
////            HanhKhach hanhKhach = new HanhKhach();
//            hanhKhach.PrintInfo();
//            hanhKhachList.add(hanhKhach);
//        }
//        System.out.println("Danh sách hành khách trên chuyến bay: ");
    }

    }

