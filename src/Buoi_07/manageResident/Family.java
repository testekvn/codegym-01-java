package Buoi_07.manageResident;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    //region Fields
    int numOfPerson;
    String homeNum;
    List<Person> personList;
    //endregion

    public Family(int numOfPerson, String homeNum, List<Person> personList) {
        this.homeNum = homeNum;
        this.personList = Objects.isNull(personList) ? new ArrayList<>() : personList;
        this.numOfPerson = this.personList.size();
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
    public void addPerson(Person person){
        this.personList.add(person);
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
