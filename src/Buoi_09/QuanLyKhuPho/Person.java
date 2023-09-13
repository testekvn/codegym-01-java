package Buoi_09.QuanLyKhuPho;

/**
 * Để quản lý các hộ dân cư trong một khu phố, tổ trưởng cần các thông tin sau:
 * Số thành viên trong gia đình,
 * Số nhà
 * thông tin mỗi cá nhân trong gia đình.
 */
public class Person {
    String name;
    String age;
    String job;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Person(String name, String age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
