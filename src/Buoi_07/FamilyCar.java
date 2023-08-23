package Buoi_07;

public class FamilyCar extends Car{
    String objectDriver;

    public FamilyCar(String objectDriver){
        this.objectDriver = objectDriver;
    }

    @Override
    public void run() {
        System.out.println("Family car run with " + objectDriver);
    }
}
