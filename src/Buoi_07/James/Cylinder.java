package Buoi_07.James;

public class Cylinder extends Circle{
    double heightCylinder;
    public Cylinder(double radius, String color, double heightCylinder) {
        super(radius, color);
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    @Override
    public void displayCircle() {
        super.displayCircle();
        System.out.println("Height: "+ heightCylinder);
        System.out.println("Volume: "+ area*heightCylinder);
        System.out.println("==============================================");
    }
}
