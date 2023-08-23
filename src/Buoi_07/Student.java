package Buoi_07;

public class Student {
    String name;
    public static float score = 5;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
//        System.out.println(" Name Student : " + name + " Score " + score);
    }

    public static float getScore() {
        return score;
    }

    public static void setScore(float score) {
        Student.score = score;
    }

    public static void changeScore(float score) {
        Student.score = score;
        System.out.println("Score Student " + score);
    }



}


