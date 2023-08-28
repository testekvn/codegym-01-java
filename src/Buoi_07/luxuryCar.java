package Buoi_07;

public class luxuryCar extends car{
     String typeCar;
    public luxuryCar(String typeCar){
        this.typeCar = typeCar;

    }

    @Override
    public void run() {
        super.run();
        System.out.println("luxury Car: "+typeCar);
        System.out.println("===============================");
    }
}
