package Buoi_07;

public class StudentJames {
    private String name = "john";
    String classes = "C02";
    public StudentJames(){}
    public StudentJames(String name, String classes ){
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        StudentJames studentJames = new StudentJames();

    }
}
