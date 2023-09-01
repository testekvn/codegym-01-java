package Buoi_07.QuanLySach;

import java.util.Scanner;

public class Megazines extends Document {

    String monthPublish;

    public Megazines(String idDoc, String namePublisher, int numberPublish, String monthPublish) {
        super(idDoc, namePublisher, numberPublish);
        this.monthPublish = monthPublish;
    }

    public String getMonthPublish() {
        return monthPublish;
    }

    public void setMonthPublish(String monthPublish) {
        this.monthPublish = monthPublish;
    }

    @Override
    public String toString() {
        return "Megazines{" +
                "monthPublish='" + monthPublish + '\'' +
                ", idDoc='" + idDoc + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberPublish=" + numberPublish +
                '}';
    }

    @Override
    public String getType() {
        return "2";
    }
}
