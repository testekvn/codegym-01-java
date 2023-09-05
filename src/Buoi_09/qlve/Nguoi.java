package Buoi_09.qlve;

public class Nguoi {
    //region Fields of Nguoi
    String hoten;
    String gioitinh;
    int age;
    //endregion


    public Nguoi(String hoten, String gioitinh, int age) {
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.age = age;
    }
    //In ra thông tin người
    public void PrintInfoPerson(){
        System.out.println("Họ tên: "+hoten);
        System.out.println("Giới tính: "+gioitinh);
        System.out.println("Tuổi: "+age);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
