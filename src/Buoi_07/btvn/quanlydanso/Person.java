package Buoi_07.btvn.quanlydanso;

public class Person {
    // region Fields
    String name;
    int age;
    String job;
    String identityCard;
    // endregion


    public Person(String name, int age, String job, String identityCard) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.identityCard = identityCard;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", identityCard='" + identityCard + '\'' +
                '}';
    }
}
