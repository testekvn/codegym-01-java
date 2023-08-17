package Buoi_06;

public class Cat {
    private String name;
    private String color;

    public Cat() {
        color = "Red";
        name = "Tom";
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Cat meo = new Cat();
        System.out.println("Cat Info: " + meo.getName() + " - " + meo.getColor());


        meo.setColor("Yellow");
        System.out.println("Cat Info: " + meo.getName() + " - " + meo.getColor());

        Cat newMeo = new Cat("John", "Red");
        System.out.println("Name: " + newMeo.getName());
    }

    public void eat() {
    }

    // Lay mau sac cua con meo
    public String getName() {
        return this.name;
    }

    // Lay mau sac cua con meo
    public String getColor() {
        return this.color;
    }

    // Cap nhat gia tri mau long cho con meo
    public void setColor(String newColor) {
        color = newColor;
    }
}
