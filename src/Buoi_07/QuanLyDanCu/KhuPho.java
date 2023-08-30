package Buoi_07.QuanLyDanCu;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HouseHold> houseHoldList;

    public List<HouseHold> getHouseHoldList() {
        return houseHoldList;
    }

    public void setHouseHoldList(List<HouseHold> houseHoldList) {
        this.houseHoldList = houseHoldList;
    }

    @Override
    public String toString() {
        return "KhuPho{" +
                "houseHoldList=" + houseHoldList +
                '}';
    }

    public KhuPho(List<HouseHold> houseHoldList){
        if (houseHoldList == null){
            houseHoldList = new ArrayList<>();
        }
        this.houseHoldList = houseHoldList;
    }
}
