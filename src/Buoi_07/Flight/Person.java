package Buoi_07.Flight;

/**
 * + Xây dựng lớp Nguoi gồm:
 *   + Thuộc tính: hoten, gioitinh, tuoi
 *   + Phương thức: PrintInfo(In ra thông tin người), và các phương thức getter/setter
 */
public class Person {
    String fullName, sex;
    int age;

    public void PrintInfo(){
        System.out.println("Ho ten: " + fullName);
        System.out.println("Gioi tinh: "+ sex);
        System.out.println("Tuoi: " + age);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String fullName, String sex, int age) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
