package Buoi_07.QuanLyDanSo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    int family_member;
    String apartment_number;
    List<Person> personList;


    public Family( String apartment_number, List<Person> personList) {
        this.apartment_number = apartment_number;
        this.personList = Objects.isNull(personList) ? new ArrayList<>() : personList;
        this.family_member = this.personList.size();
    }

    public int getFamily_member() {
        return this.personList.size();
    }


    public String getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(String apartment_number) {
        this.apartment_number = apartment_number;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
