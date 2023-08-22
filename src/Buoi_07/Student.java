package Buoi_07;

public class Student {
    String name;
    public static float score=5;
    public Student(){

    }

    public Student(String name) {
    }

    public String getName() {
        return name;
    }

    public static float getScore() {
        return score;
    }

    public static void setScore(float score) {
        Student.score = score;
    }
    private void changeScore() {
        System.out.println("Score of student: "+score);
    }
    public static void main(String[] args) {
        Student studentFir =  new Student();
        Student studentSec = new Student("phungDH");
        Student.setScore(7);
        studentFir.changeScore();
        studentSec.changeScore();
    }


}
