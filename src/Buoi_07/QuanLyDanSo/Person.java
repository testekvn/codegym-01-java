package Buoi_07.QuanLyDanSo;

public class Person  {
    String name;
    int age;
    String job;
    String identity_card;

    public Person( String name, int age, String job, String identity_card) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.identity_card = identity_card;
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

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", identity_card='" + identity_card + '\'' +
                '}';
    }
}
