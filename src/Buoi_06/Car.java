package Buoi_06;

public class Car {
    String Name;        // Vincent: Tuân thủ coding convention - name
    String Color;       // Tương tự : color
    String Type;        // Tương tự: color
    public Car(){
        System.out.println("This is car");
    }
    public Car(String Name){
        System.out.println("This is car"+Name);
    }


    public Car(String Name , String Color){
        System.out.println(" Name " +Name+ " Color " +Color);

    }

    // FIXME: 22/08/2023 Tuân thủ coding convention   public Car(String name , String color, String type){
    public Car(String Name , String Color, String Type){
        System.out.println(" this ís car " +Name+ " màu " +Color+ " SportLine ");

    }
    public static void main(String[] args) {
        Car car = new Car("BMW","RED");
        Car car1 =  new Car("LEXUS", "BLACK");
        Car car2 =  new Car("LEXUS", "BLACK", "Sedan");

    }

}
