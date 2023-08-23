package Buoi_07;

public class LuxuryCar extends Car{
    String market;

    public LuxuryCar(String market){
        this.market = market;
    }

    @Override
    public void run() {
//        super.run();
        System.out.println("Luxury car is running in " + market);
    }
}
