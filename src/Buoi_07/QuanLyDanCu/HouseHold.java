package Buoi_07.QuanLyDanCu;

import java.util.ArrayList;
import java.util.List;

public class HouseHold {
    int quantityOfHouseHold; // Số lượng thành viên
    String numberHouseHold; // Số nhà
    List<Person> personList; // Danh sách thành viên


    public int getQuantityOfHouseHold() {
        return this.personList.size();
    } // lay ra so luong thanh vien

    public void setQuantityOfHouseHold(int quantityOfHouseHold) {
        this.quantityOfHouseHold = quantityOfHouseHold;
    }

    public String getNumberHouseHold() {
        return numberHouseHold;
    }

    public void setNumberHouseHold(String numberHouseHold) {
        this.numberHouseHold = numberHouseHold;
    }

    public HouseHold(String numberHouseHold, List<Person> personList ){
        this.numberHouseHold = numberHouseHold;
        if (personList == null){ // nếu ds thanhvien = null, thì personList = ArrayList rỗng
            personList = new ArrayList<>();
        }
        this.personList = personList;
        this.quantityOfHouseHold = this.personList.size();
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "quantityOfHouseHold=" + quantityOfHouseHold +
                ", numberHouseHold='" + numberHouseHold + '\'' +
                ", personList=" + personList +
                '}';
    }
    public void addPerson(Person person){ // contructor them thanh vien
        this.personList.add(person); // this the hien cho doi tuong
        this.quantityOfHouseHold = this.personList.size();
    }
}
