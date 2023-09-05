package Buoi_09.qlve;

import java.util.ArrayList;
import java.util.List;

public class Hanhkhach extends Nguoi{
    List<Chuyenbay> chuyenbayList;  //Danh sach chuyen bay
    int soluong;                    //So luong ve hanh khach mua
    public Hanhkhach(String hoten, String gioitinh, int age, List<Chuyenbay> chuyenbayList, int soluong) {
        super(hoten, gioitinh, age);
        this.soluong = soluong;
        this.chuyenbayList = new ArrayList<>();
    }
    //Tính tổng tiền vé đã mua
    public double tinhTienVe() {
        double tien = 0;
        for (Chuyenbay chuyenbay : chuyenbayList) {
            tien += chuyenbay.getGiave();
        }
        return tien;
    }
    //Đặt vé
    public void datVe(){
        //processing
    }

    //Hiển thị thông tin hành khách
    @Override
    public void PrintInfoPerson() {
        super.PrintInfoPerson();
        System.out.println("Danh sách chuyến bay: "+chuyenbayList);
        System.out.println("Số lượng vé của hành khách: "+soluong);
    }

    public List<Chuyenbay> getChuyenbayList() {
        return chuyenbayList;
    }

    public void setChuyenbayList(List<Chuyenbay> chuyenbayList) {
        this.chuyenbayList = chuyenbayList;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
