package Buoi_06;

// TODO: 22/08/2023 Should have the comment for each method 
public class Animal {
    String type;
    String weight;
    String height;

    public void eat() {

    }

    public void play() {

    }

    public void makeSound() {
        if (type.equals("cat")) {
            System.out.println("Meo meo mewwwwwwwwwwwwwwwwww");
        }
        if (type.equals("dog")) {
            System.out.println("gâu gâu");
        }
        if (type.equals("duck")) {
            System.out.println("cạc cạc");
        }
        // TODO: 22/08/2023 Should use switch-case instead of if condition  
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Animal() {

    }

    public Animal(String type) {
        System.out.println("Dog" + type);
    }

    public Animal(String type, String weight, String height) {
        System.out.println("Duck" + type + "-" + weight + "-" + height);
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal("four-legged animal that is loyal to its owner");
        Animal duck = new Animal("avian animals that can swim", "5kg", "50cm");
        cat.setType("cat");
        System.out.println("New cat: " + cat.getType());
        dog.setWeight("10kg");
        dog.setHeight("100cm");
        System.out.println("New dog: " + dog.getWeight() + " New dog: " + dog.getHeight());
        dog.setType("dog");
        duck.setType("duck");
        cat.makeSound();
        dog.makeSound();
        duck.makeSound();
    }


}


