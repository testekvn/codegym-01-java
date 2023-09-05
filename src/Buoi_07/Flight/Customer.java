package Buoi_07.Flight;

import java.util.ArrayList;
import java.util.List;

/**
 * + Xây dựng lớp Hanhkhach (mỗi hành khách được mua nhiều vé) kế thừa lớp Nguoi bổ sung thêm:
 *   + Thuộc tính: Danh sách Chuyenbay; int soluong (Tổng số lượng vé);
 *   + Phương thức: PrintInfo(In ra thông tin hành khách), và các phương thức getter/setter; Phương thức tính số tiền
 *   hành khách đã mua vé máy bay, phương thức đặt vé máy bay (Người dùng đặt vé và cập nhật các chuyến bay vào danh
 *   sách của người dùng); Phương thức tính tổng số tiền người dùng phải trả cho tất cả các chuyến bay
 */
public class Customer extends Person{
    int sumQuantityTicket;
    List<Flight> listFlight = new ArrayList<>();

    public Customer(String fullName, String sex, int age, int sumQuantityTicket, List<Flight> listFlight) {
        super(fullName, sex, age);
        this.sumQuantityTicket = sumQuantityTicket;
        this.listFlight = listFlight;
    }

    public Customer(String fullName, String sex, int age) {
        super();
    }

    // Phương thức in ra thông tin hành khách
    @Override
    public void PrintInfo() {
        super.PrintInfo(); // Gọi phương thức in ra thông tin người của lớp cha
        System.out.println("Số lượng vé: " + sumQuantityTicket);
        System.out.println("Danh sách chuyến bay đã mua vé:");
        for (Flight flight : listFlight) { // Duyệt qua danh sách chuyến bay và in ra thông tin của mỗi chuyến bay
            flight.PrintInfo();
            System.out.println();
        }
    }


    // Phương thức tính số tiền hành khách đã mua vé máy bay
    public double TinhTien() {
        double tongtien = 0; // Khởi tạo biến tổng tiền bằng 0
        for (Flight flight : listFlight) { // Duyệt qua danh sách chuyến bay và cộng dồn giá vé của mỗi chuyến bay vào tổng tiền
            tongtien += flight.getPriceOfTicket();
        }
        return tongtien; // Trả về tổng tiền
    }

    // Phương thức đặt vé máy bay
    public void DatVe(Flight flight) {
        if (flight.quantityTicket > 0) { // Kiểm tra xem chuyến bay còn vé hay không
            listFlight.add(flight); // Thêm chuyến bay vào danh sách chuyến bay của hành khách
            sumQuantityTicket++; // Tăng số lượng vé của hành khách lên 1
            flight.getListPersonOfFlight().add(this); // Thêm hành khách vào danh sách người trên chuyến bay
            flight.setQuantityTicket(flight.getQuantityTicket() - 1); // Giảm số lượng vé của chuyến bay đi 1
            System.out.println("Đặt vé thành công!");
        } else { // Nếu không còn vé thì thông báo cho hành khách biết
            System.out.println("Xin lỗi, chuyến bay này đã hết vé!");
        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                ", sumQuantityTicket=" + sumQuantityTicket +
                ", fullName='" + fullName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public int getSumQuantityTicket() {
        return sumQuantityTicket;
    }

    public void setSumQuantityTicket(int sumQuantityTicket) {
        this.sumQuantityTicket = sumQuantityTicket;
    }

    public List<Flight> getListFlight() {
        return listFlight;
    }

    public void setListFlight(List<Flight> listFlight) {
        this.listFlight = listFlight;
    }
}
