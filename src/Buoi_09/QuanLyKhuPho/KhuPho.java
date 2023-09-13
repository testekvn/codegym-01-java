package Buoi_09.QuanLyKhuPho;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> listHoGiaDinh;

    public KhuPho(List<HoGiaDinh> listHoGiaDinh) {
        if (listHoGiaDinh == null){
            listHoGiaDinh = new ArrayList<>();
        }
        this.listHoGiaDinh = listHoGiaDinh;
    }

    public List<HoGiaDinh> getListHoGiaDinh() {
        return listHoGiaDinh;
    }

    public void setListHoGiaDinh(List<HoGiaDinh> listHoGiaDinh) {
        this.listHoGiaDinh = listHoGiaDinh;
    }
}
