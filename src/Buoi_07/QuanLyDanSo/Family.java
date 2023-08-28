package Buoi_07.QuanLyDanSo;

public class Family {
    int family_member;
    String apartment_number;

    public Family(int family_member, String apartment_number) {
        this.family_member = family_member;
        this.apartment_number = apartment_number;
    }

    public int getFamily_member() {
        return family_member;
    }

    public void setFamily_member(int family_member) {
        this.family_member = family_member;
    }

    public String getApartment_number() {
        return apartment_number;
    }

    public void setApartment_number(String apartment_number) {
        this.apartment_number = apartment_number;
    }
}
