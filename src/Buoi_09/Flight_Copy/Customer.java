package Buoi_09.Flight_Copy;

/**
 * + Xây dựng lớp Hanhkhach (mỗi hành khách được mua nhiều vé) kế thừa lớp Nguoi bổ sung thêm:
 *   + Thuộc tính: Danh sách Chuyenbay; int soluong (Tổng số lượng vé);
 *   + Phương thức: PrintInfo(In ra thông tin hành khách), và các phương thức getter/setter; Phương thức tính số tiền
 *   hành khách đã mua vé máy bay, phương thức đặt vé máy bay (Người dùng đặt vé và cập nhật các chuyến bay vào danh
 *   sách của người dùng); Phương thức tính tổng số tiền người dùng phải trả cho tất cả các chuyến bay
 */
public class Customer extends Person{
    int listFlight;
    int sumQuantityTicket;
    //    public void PricedTicket(){
//        double pricedTicket;
//        sum =
//    }
    public Customer(String fullName, String sex, int age, int listFlight, int sumQuantityTicket) {
        super(fullName, sex, age);
        this.listFlight = listFlight;
        this.sumQuantityTicket = sumQuantityTicket;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Danh sach chuyen bay: " + listFlight);
        System.out.println("Tong so luong ve: "+ sumQuantityTicket);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "listFlight=" + listFlight +
                ", sumQuantityTicket=" + sumQuantityTicket +
                ", fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public int getListFlight() {
        return listFlight;
    }

    public void setListFlight(int listFlight) {
        this.listFlight = listFlight;
    }

    public int getSumQuantityTicket() {
        return sumQuantityTicket;
    }

    public void setSumQuantityTicket(int sumQuantityTicket) {
        this.sumQuantityTicket = sumQuantityTicket;
    }
}