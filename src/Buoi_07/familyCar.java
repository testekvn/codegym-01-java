package Buoi_07;

public class familyCar extends car{
    String mau = "Do";
    public familyCar(String mau) {

    }

    public static void main(String[] args) {
        familyCar fc = new familyCar("Vang");
        fc.setMau("Xanh");
    }
}
