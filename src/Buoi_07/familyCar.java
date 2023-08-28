package Buoi_07;

public class familyCar extends car {
    public String powerCar;
    public familyCar(String powerCar){
        this.powerCar = powerCar;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("familyCar: "+powerCar);
        System.out.println("========================================");
    }
}
