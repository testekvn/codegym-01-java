package Buoi_06;

// TODO: 22/08/2023 Adding the comment for each method 
public class Animal {
    String type;
    String weight;
    String height;
    public void eat(){

    }
    public  void play(){

    }
    public  void  makeSound(String type){
        if (type.equals("cat")){
            System.out.println("Meo meo");
        }
        if(type.equals("dog")){
            System.out.println("Gâu gâu");
        }
        if(type.equals("duck")){
            System.out.println("Cạc Cạc");
        }
        // TODO: 22/08/2023 Should user switch-case 
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }

    public String getHeight() {

        return height;
    }

    public String getWeight() {

        return weight;
    }

    public void setWeight(String weight) {

        this.weight = weight;
    }

    public void setHeight(String height) {

        this.height = height;
    }

    public Animal(){
//        System.out.println("");

    }
    public  Animal(String type){
        System.out.println("dogType: "+type);

    }
    public  Animal(String type, String weight, String height){
        System.out.println("duckType: "+type+" duckWeight: "+weight+" duckHeight: "+height);

    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal( "redBull");
        Animal duck = new Animal("duckSky","1kg","20cm");
        cat.setType("cat");
        System.out.println("newCatType: "+ cat.getType());
        dog.setWeight("20kg");
        dog.setHeight("90cm");
        System.out.println("newDogWeight: "+dog.getWeight()+" newDogHeight: "+dog.getHeight());
        dog.setType("dog");
        duck.setType("duck");
        cat.makeSound(cat.type);
        dog.makeSound(dog.type);
        duck.makeSound(duck.type);

    }

}
