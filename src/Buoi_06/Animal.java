package Buoi_06;

import java.sql.SQLOutput;

// TODO: 22/08/2023 Adding comment for each methods 
public class Animal {
    String type;
    double height, weight;

    public void eat(){}
    public void play(){}

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
        Animal animalDog = new Animal("Dog");
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


        //region makeSound
        animalCat.setType("Cat"); // set tyoe co doi tuong
        animalCat.makeSound(animalCat.getType()); // goi ham de in ra tieng keu

        animalDog.setType("Dog");
        animalDog.makeSound(animalDog.getType());

        animalDuck.setType("duck");
        animalDuck.makeSound(animalDuck.getType());
        //endregion



    }
    public void makeSound(String type){
        if (type.equalsIgnoreCase("cat")) {
            System.out.println("Con " + type + " keu meow meow");
        } else if (type.equalsIgnoreCase("dog")) {
            System.out.println("Con " + type + " keu gau gau");
        } else if (type.equalsIgnoreCase("duck")) {
            System.out.println("Con "+ type + " keu vit vit");
        } else System.out.println("nothing");

        // TODO: 22/08/2023 Should use switch-case 
    }
}
