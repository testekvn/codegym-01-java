package Buoi_07.QuanLySach;

public class Newspapers extends Document {
    String dayPublish;

    public Newspapers(String idDoc, String namePublisher, int numberPublish, String dayPublish) {
        super(idDoc, namePublisher, numberPublish);
        this.dayPublish = dayPublish;
    }

    public String getDayPublish() {
        return dayPublish;
    }

    public void setDayPublish(String dayPublish) {
        this.dayPublish = dayPublish;
    }

    @Override
    public String toString() {
        return "Newspapers{" +
                "dayPublish='" + dayPublish + '\'' +
                ", idDoc='" + idDoc + '\'' +
                ", namePublisher='" + namePublisher + '\'' +
                ", numberPublish=" + numberPublish +
                '}';
    }

    @Override
    public String getType() {
        return "3";
    }
}
