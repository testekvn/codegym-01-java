package Buoi_07;

public class FamilyCar extends Car{
    int powerCar;  //Mã lực xe
    public FamilyCar(int powerCar){
        this.powerCar = powerCar;
    }

    @Override
    public void run() {
        //super.run();
        System.out.println("FamilyCar has "+ color+ " and " + powerCar+ " horsepower !");
        System.out.println("==============================================");
    }
}
