package Buoi_07.btvn;

import java.util.List;

public class Family {
    int numOfPerson;
    String homeNum;
    List<Person> personList;

    public Family(int numOfPerson, String homeNum, List<Person> personList) {
        this.numOfPerson = numOfPerson;
        this.homeNum = homeNum;
        this.personList = personList;
    }

    public int getNumOfPerson() {
        return numOfPerson;
    }

    public void setNumOfPerson(int numOfPerson) {
        this.numOfPerson = numOfPerson;
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
}
