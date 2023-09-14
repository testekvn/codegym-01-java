package Buoi_10.CD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhsachCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cd> cdList = new ArrayList<>();
//        System.out.println("1-Nhập Thông Tin CD \n" + "2-Danh Sách CD \n" + "3-Số Lương CD \n" + "4-Tổng Tiền CD\n" + "5-Danh Sách Giảm Dần Theo Giá Thành\n" + "6-Danh Sách Tăng Dần Theo Tên CD\n" + "7-Toàn Bộ Danh Sách");
        System.out.print("1-Số Lượng CD");
        int numOfCd = sc.nextInt();
        sc.nextLine();
        System.out.println("CD Thứ:");
        while (cdList.size() < numOfCd) {
            System.out.println("\t\tCD Thứ " + (cdList.size() + 1));
            Cd cd = new Cd();
            System.out.print("\t\tMã CD:");
            cd.setIdCD((sc.nextInt()));
            sc.nextLine();
            System.out.print("\t\tTên CD:");
            cd.setTuaCD(sc.nextLine());
            System.out.print("\t\tTên Ca Sĩ:");
            cd.setCaSi((sc.nextLine()));
            System.out.print("\t\tSố Lượng Bài Hát:");
            cd.setSoBaiHat(sc.nextInt());
            System.out.print("\t\tGiá Thành:");
            cd.setGiaThanh(sc.nextInt());
            sc.nextLine();
            cdList.add(cd);

        }
        //fake data
        cdList.addAll(fakeCdDataForTesting());
        //gia thanh
        for(Cd c : cdList){

        }
    }

    private static List<Cd> fakeCdDataForTesting() {
            List<Cd> cdList = new ArrayList<>();
            cdList.add(new Cd(1,"a","Minh",111,150000));
            cdList.add(new Cd(2,"b","Minh",112,160000));
            cdList.add(new Cd(3,"c","Minh",113,170000));
            cdList.add(new Cd(4,"d","Minh",114,180000));
            return  cdList;
    }
}




