package Buoi_07.James;

public class Circle {
    double radius;
    String color;
    double area;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayCircle(){
        System.out.println("Radius: "+ radius);
        System.out.println("Color: "+color);
        System.out.println("Area: "+ (area = radius*radius*3.14));
    }
}
