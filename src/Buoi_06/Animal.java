package Buoi_06;

import java.sql.SQLOutput;

public class Animal {
    String type;
    String weight;
    String height;

    //Hành động ăn
    public void eat(){

    }
    //Hành động chơi
    public void play(){

    }
    //Hành động kêu
    public void makeSound(String type){
        if(type.equalsIgnoreCase("cat")){
            System.out.println("Đây là cat và nó kêu: meo meo !");
        }
        if (type.equalsIgnoreCase("dog")) {
            System.out.println("Đây là dog và nó kêu: gâu gâu !");
        }
        if (type.equalsIgnoreCase("duck")) {
            System.out.println("Đây là duck và nó kêu: cạc cạc !");
        }
    }

    //Lấy loại Animal
    public String getType() {
        return this.type;
    }
    //Lấy chiều cao Animal
    public String getHeight() {
        return this.height;
    }
    //Lấy cân nặng Animal
    public String getWeight() {
        return this.weight;
    }
    //Cập nhật giá trị loại Animal
    public void setType(String type) {
        this.type = type;
    }
    //Cập nhật giá trị chiều cao Animal
    public void setHeight(String height) {
        this.height = height;
    }
    //Câập nhật cân nặng Animal
    public void setWeight(String weight) {
        this.weight = weight;
    }

    //Constructor No params
    public Animal(){
        type = "Dragon";
        weight = "1000kg";
        height = "10m";
    }
    //Constructor with param "type"
    public Animal(String type){
        this.type = type;
    }
    //Constructor with all params
    public Animal(String type, String weight, String height){
        this.type = type;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        //Khởi tạo Cat: Without param trong constructor
        Animal Cat = new Animal();
        System.out.println("Cat Info: "+ Cat.getType()+ "-"+ Cat.getWeight()+"-"+ Cat.getHeight());

        //Khởi tạo Dog: With param "type" trong constructor
        Animal Dog = new Animal("Red dog");
        System.out.println("Dog Info: "+ Dog.getType()+ "-"+ Dog.getWeight()+"-"+ Dog.getHeight());

        //Khởi tạo Duck: With all params
        Animal Duck = new Animal("G Ducky", "5kg", "50 cm");
        System.out.println("Duck Info: "+ Duck.getType()+ "-"+ Duck.getWeight()+"-"+ Duck.getHeight());

        System.out.println();

        //Cập nhật type cho Cat là CAT
        Cat.setType("CAT");
        System.out.println("NewCat Info with new type: "+ Cat.getType()+ "-"+ Cat.getWeight()+"-"+ Cat.getHeight());

        //Cập nhật Weight and Height cho Dog
        Dog.setWeight("100kg");
        Dog.setHeight("80cm");
        System.out.println("NewDog Info with newWeight and newHeight: "+ Dog.getType()+ "-"+ Dog.getWeight()+"-"+ Dog.getHeight());

        System.out.println();

        //Cập nhật phương thức makeSound
        Cat.setType("cat");
        Cat.makeSound(Cat.getType());

        Dog.setType("dog");
        Dog.makeSound(Dog.getType());

        Duck.setType("duck");
        Duck.makeSound(Duck.getType());
    }
}
