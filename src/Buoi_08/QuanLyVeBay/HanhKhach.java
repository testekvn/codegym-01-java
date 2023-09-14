package Buoi_08.QuanLyVeBay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HanhKhach extends Person {
    List<ChuyenBay> chuyenbayList;  //Danh sach chuyen bay
    int soluong;                    //So luong ve hanh khach mua

    public HanhKhach(String hoten, String gioitinh, int age, List<ChuyenBay> chuyenbayList, int soluong) {
        super(hoten, gioitinh, age);
        this.soluong = soluong;
        this.chuyenbayList = new ArrayList<>();
    }

    //Tính tổng tiền vé đã mua
    public double tinhTienVe() {
        double tien = 0;
        for (ChuyenBay chuyenbay : chuyenbayList) {
            tien += chuyenbay.getGiave();
        }
        return tien;
    }

    //Đặt vé
    public void datVe() {
        //processing
    }

    //Hiển thị thông tin hành khách
    @Override
    public void PrintInfoPerson() {
        super.PrintInfoPerson();
        System.out.println("Danh sách chuyến bay: " + chuyenbayList);
        System.out.println("Số lượng vé của hành khách: " + soluong);
    }

    public List<ChuyenBay> getChuyenbayList() {
        return chuyenbayList;
    }

    public void setChuyenbayList(List<ChuyenBay> chuyenbayList) {
        this.chuyenbayList = chuyenbayList;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "HanhKhach{" + "chuyenbayList=" + chuyenbayList + ", soluong=" + soluong + ", hoten='" + hoten + '\'' + ", gioitinh='" + gioitinh + '\'' + ", age=" + age + '}';
    }

    public void PrintInfo() {
        Scanner sc = new Scanner(System.in);
        super.PrintInfo();
        System.out.println("Tổng số vé: ");
        soluong = Integer.parseInt(sc.nextLine());
    }
}

