package Buoi_07;

public class LuxuryCar extends Car{
    String trademarkCar; //Thương hiệu thị trường
    public LuxuryCar(String trademarkCar){
        this.trademarkCar = trademarkCar;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("LuxuryCar is a "+ trademarkCar +" car brand !");
        System.out.println("==============================================");
    }
}
