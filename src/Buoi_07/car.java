package Buoi_07;

public class car {
    public String color = "Blu";
    public String mau;
    private int trongluong;
    public car (){

    }
    public car (String color){
        this.color = color;
    }
    public void setMau(String mau){
        this.mau = mau;
        System.out.println("mau: "+mau);
    }
    public void show(){
        System.out.println("Oto mau: "+color);
    }
}
