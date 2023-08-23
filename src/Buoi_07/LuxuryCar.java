package Buoi_07;

public class LuxuryCar extends Car {
    String license_plates;
    public LuxuryCar(String license_plates){
        this.license_plates = license_plates;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("LuxuryCar have license plates : "+license_plates);
    }

    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar("30H1-55555");
        luxuryCar.run();
    }
}

