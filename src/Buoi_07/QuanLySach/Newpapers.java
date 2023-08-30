package Buoi_07.QuanLySach;

public class Newpapers extends Document{
    String dayPublish;

    public Newpapers(String idDoc, String namePublisher, int numberPublish) {
        super(idDoc, namePublisher, numberPublish);
    }

    public String getDayPublish() {
        return dayPublish;
    }

    public void setDayPublish(String dayPublish) {
        this.dayPublish = dayPublish;
    }

    @Override
    public String toString() {
        return "Newpapers{" +
                "dayPublish='" + dayPublish + '\'' +
                '}';
    }
}
