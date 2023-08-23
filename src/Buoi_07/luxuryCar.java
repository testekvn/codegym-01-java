package Buoi_07;

public class luxuryCar extends  car {
    String type = "Trong Luong";

    public luxuryCar(String lexus) {
    }

    public static void main(String[] args) {
        luxuryCar lc = new luxuryCar("lexus");
        lc.show();
    }

}