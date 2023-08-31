package Buoi_07.btvn;

public class Person {
    String name,job,identityCard;
    int age;

    public Person(String name, String job, String identityCard, int age) {
        this.name = name;
        this.job = job;
        this.identityCard = identityCard;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                '}';
    }
}
