package Buoi_06;

import java.sql.SQLOutput;

public class Animal {
    String type;
    double height, weight;
    private String setType;

    public void eat(){}
    public void play(){}
    public void makeSound(){}
    public Animal(){
        type = "Cat";
    }
    public Animal(String type){
        this.type = type;
    }
    public Animal(String type, double weight, double height){
        this.type = type;
        this.weight = weight;
        this.height = height;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Animal animalCat = new Animal();
        Animal animalDog = new Animal("Cat");
        Animal animalDuck = new Animal("Duck", 1.2, 50);

        //region Print infor
        System.out.println("Animal meowww: "+ animalCat.getType());
        System.out.println("Animal " + animalDuck.getType() + " weight " + animalDuck.getWeight() + " kg, " + " height " + animalDuck.getHeight());


        //endregion

        // region Set Dog: wight & height
        animalDog.setHeight(9);
        animalDog.setWeight(1.3);
        System.out.println("Dog: weight " + animalDog.getWeight() + " kg" + " & height: " + animalDog.getHeight());

        // endregion


        // region Set Cat => CAT
        animalCat.setType("CAT");
        System.out.println("New cat: "+ animalCat.getType());

        // endregion

    }

}
