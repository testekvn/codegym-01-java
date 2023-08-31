package Buoi_07.manageResident;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Quarter {
    List<Family> familyList;

    public Quarter(List<Family> familyList) {
        this.familyList = Objects.isNull(familyList) ? new ArrayList<>() : familyList;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    @Override
    public String toString() {
        return "Quarter{" +
                "familyList=" + familyList +
                '}';
    }
}
