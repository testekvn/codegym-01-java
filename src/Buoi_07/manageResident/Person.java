package Buoi_07.manageResident;

public class Person {
    //region Fields
    String name;
    int age;
    String job;
    String idCard;

    //endregion


    public Person(String name, int age, String job, String idCard) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
