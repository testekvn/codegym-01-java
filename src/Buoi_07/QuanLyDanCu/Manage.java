package Buoi_07.QuanLyDanCu;

import java.util.ArrayList;
import java.util.List;

public class Manage {
    public static void main(String[] args) {
        //region create Person
        Person personFirst = new Person("Uy Minh", "Cau Giay", "001301026177", 3 );
        Person personSecond = new Person("Uy Quyen", "Phu Xuyen", "001301026178", 7 );
        Person personThird = new Person("Uy Vu", "Phu Xuyen", "001301026179", 8 );


        //create list member of household
        List<Person> personList = new ArrayList<>();
        personList.add(personFirst);
        personList.add(personSecond);
        personList.add(personThird);

        System.out.println(personList);
        //endregion

        //region create HouseHold
        HouseHold houseHoldFirst = new HouseHold("181 Tran Quoc Vuong", personList);
        System.out.println("Household' s member " + houseHoldFirst.getQuantityOfHouseHold());
        // create list household
        List<HouseHold> houseHoldList = new ArrayList<>();

        houseHoldList.add(houseHoldFirst);
        System.out.println(houseHoldList);

        //create new member of household, add in
        Person personFourth = new Person("Van Anh", "Ha Noi", "00130102666", 22);
        houseHoldFirst.addPerson(personFourth);
        System.out.println("Household' s new member " + houseHoldFirst.getQuantityOfHouseHold());
        //endregion

        // region KhuPho
        List<HouseHold> khuPho = new ArrayList<>();
        khuPho.add(houseHoldFirst);
        KhuPho quarter = new KhuPho(khuPho);
        System.out.println("Khu pho: " + quarter.getHouseHoldList());
        //endregion
    }
}
