package Buoi_07.btvn.quanlydanso;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<Family> familyList;

    public KhuPho(List<Family> familyList) {
        if (familyList == null) {
            familyList = new ArrayList<>();
        }
        this.familyList = familyList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    public int getNumOfFamily() {
        return this.familyList.size();
    }

    @Override
    public String toString() {
        return "KhuPho{" +
                "familyList=" + familyList +
                '}';
    }
}
