package Buoi_07.btvn.quanlydanso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    //region Fields
    int numOfPerson;        // So luong thanh vien trong gia dinh
    String homeNum;         // So nha
    List<Person> personList;// Danh sach thanh vien
    // endregion


    public Family(String homeNum, List<Person> personList) {
        this.homeNum = homeNum;
        this.personList = Objects.isNull(personList) ? new ArrayList<>() : personList;
        if (personList == null) {
            personList = new ArrayList<>();
        }
        this.personList = personList;
        this.numOfPerson = this.personList.size();
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public int getNumOfPerson() {
        return this.personList.size();
    }

    public void addPerson(Person newPerson) {
        this.personList.add(newPerson);
        this.numOfPerson = this.personList.size();
    }

    @Override
    public String toString() {
        return "Family{" +
                "numOfPerson=" + numOfPerson +
                ", homeNum='" + homeNum + '\'' +
                ", personList=" + personList +
                '}';
    }
}
