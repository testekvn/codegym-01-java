package Buoi_07.QuanLyDanCu;

import java.util.ArrayList;
import java.util.List;

public class HouseHold {
    int quantityOfHouseHold; // Số lượng thành viên
    String numberHouseHold; // Số nhà
    List<Person> personList; // Danh sách thành viên


    public int getQuantityOfHouseHold() {
        return this.personList.size();
    }

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
        if (personList == null){ // nếu ds mem = null, thì personList = ArrayList rỗng
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
    public void addPerson(Person person){
        this.personList.add(person);
        this.quantityOfHouseHold = this.personList.size();
    }
}
