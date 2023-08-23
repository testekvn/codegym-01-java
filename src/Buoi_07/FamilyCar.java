package Buoi_07;

public class FamilyCar extends Car {
    int horse_power;
    public FamilyCar(int horse_power){
        this.horse_power = horse_power;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("FamilyCar speed "+horse_power+"km/h");
    }

    public static void main(String[] args) {
        FamilyCar familyCar = new FamilyCar(500);
        familyCar.run();
    }
}
