package Buoi_09.QuanLyKhuPho;

import Buoi_07.QuanLyDanCu.HouseHold;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh extends Person{
    List<Person> personList;
    String soNha;
    int soLuongThanhVien;

    public HoGiaDinh(String soNha, List<Person> personList){
        this.soNha = soNha;
        if (personList == null){
            personList = new ArrayList<>();
        }
        this.personList = personList;
        this.soLuongThanhVien = this.personList.size();
    }


    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getSoLuongThanhVien() {
        return this.personList.size();
    }

    public void setSoLuongThanhVien(int soLuongThanhVien) {
        this.soLuongThanhVien = soLuongThanhVien;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "personList=" + personList +
                ", soNha='" + soNha + '\'' +
                ", soLuongThanhVien=" + soLuongThanhVien +
                '}';
    }

    public void addPerson(Person person){
        this.personList.add(person);
        this.soLuongThanhVien = this.personList.size();

    }
}
