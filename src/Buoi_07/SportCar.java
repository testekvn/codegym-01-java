package Buoi_07;

public class SportCar extends Car{
    int speed;

    public SportCar(int speed){
        this.speed = speed;
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Sport car run " + speed);
    }
}
