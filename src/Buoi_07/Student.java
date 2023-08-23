package Buoi_07;

public class Student {
    String name;
    public static float score = 5;

    public Student(){
        name = "Student";
        score = 5;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public static void changeScore(float score){
        Student.score = score;
        System.out.println("Score: " + score);
    }
}
