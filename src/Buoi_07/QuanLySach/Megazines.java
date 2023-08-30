package Buoi_07.QuanLySach;

import java.util.Scanner;

public class Megazines extends Document {

    int monthPublish;

    public Megazines(String idDoc, String namePublisher, int numberPublish) {
        super(idDoc, namePublisher, numberPublish);
    }

    public int getMonthPublish() {
        return monthPublish;
    }

    public void setMonthPublish(int monthPublish) {
        this.monthPublish = monthPublish;
    }

    @Override
    public String toString() {
        return "Megazines{" +
                "monthPublish=" + monthPublish +
                '}';
    }



}
