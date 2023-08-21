package Buoi_06;

public class Fan {
    private int slow = 1;   //Tốc độ Fan thấp
    private int medium = 2; //Tốc độ Fan trung bình
    private int fast = 3;   //Tốc độ Fan cao
    private int speed;
    private boolean on;    //Trạng thái Fan
    private double radius; //Bán kính Fan
    private String color;  //Màu sắc Fan

    //Chế độ mặc định
    public Fan(){
        speed = slow;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Trạng thái hoạt động
    public void fanStatus(boolean on){
        if (!on){
            System.out.println("fan is off");
        }
        else System.out.println("fan is on");
    }

    public static void main(String[] args) {
        //Đối tượng mặc định
        Fan fan = new Fan();
        System.out.println("Fan info: "+ fan.getSpeed()+" - "+fan.getRadius()+" - "+fan.getColor());
        fan.fanStatus(fan.isOn());
        //Cập nhật lại trạng thái hoạt động của Fan
        fan.setOn(true);
        fan.fanStatus(fan.isOn());

        //Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
        Fan fan1 = new Fan(fan.fast, true,10,"yellow");
        System.out.println("Fan1 status: "+"Speed: "+ fan1.getSpeed()+" - "+"Radius: "+ fan1.getRadius()+ " - "+ "Color: "+ fan1.getColor());
        fan1.fanStatus(fan1.isOn());

        //Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
        Fan fan2 = new Fan(fan.medium, false, 5,"blue");
        System.out.println("Fan2 status: "+"Speed: "+ fan2.getSpeed()+" - "+"Radius: "+ fan2.getRadius()+ " - "+ "Color: "+ fan2.getColor());
        fan2.fanStatus(fan2.isOn());

    }
}

