package Buoi_07.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerFlight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập số lượng chuyến bay
        System.out.println("Nhập số lượng chuyến bay: ");
        int soLuong = sc.nextInt(); // Đọc số nguyên từ bàn phím
        // Tạo một danh sách chuyến bay
        List<Flight> listFlight = new ArrayList<>();

        // Nhập thông tin cho soLuong chuyến bay
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho chuyến bay thứ " + (i + 1) + ":");
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.println("Tên chuyến bay: ");
            String nameFlight = sc.nextLine(); // Đọc chuỗi từ bàn phím
            System.out.println("Ngày bay: ");
            String departureDate = sc.nextLine(); // Đọc chuỗi từ bàn phím
            System.out.println("Giá vé: ");
            float priceOfTicket = sc.nextFloat(); // Đọc số thực từ bàn phím
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.println("Ký hiệu chuyến bay: ");
            String flightCallSign = sc.nextLine(); // Đọc chuỗi từ bàn phím
            System.out.println("Số lượng vé: ");
            int quantityTicket = sc.nextInt(); // Đọc số nguyên từ bàn phím

            // Tạo một đối tượng chuyến bay với các thông tin vừa nhập
            Flight flight = new Flight(nameFlight, departureDate, priceOfTicket, flightCallSign, quantityTicket);

            // Thêm đối tượng chuyến bay vào danh sách chuyến bay
            listFlight.add(flight);
        }

        // Nhập số lượng hành khách
        System.out.println("Nhập số lượng hành khách: ");
        int sizeCustomer = sc.nextInt(); // Đọc số nguyên từ bàn phím

        ArrayList<Customer> listCustomer = new ArrayList<Customer>();

        // Nhập thông tin cho sizeCustomer hành khách
        for (int i = 0; i < sizeCustomer; i++) {
            System.out.println("Nhập thông tin cho hành khách thứ " + (i + 1) + ":");
            sc.nextLine(); // Đọc bỏ dòng trống
            System.out.println("Họ tên: ");
            String fullName = sc.nextLine(); // Đọc chuỗi từ bàn phím
            System.out.println("Giới tính: ");
            String sex = sc.nextLine(); // Đọc chuỗi từ bàn phím
            System.out.println("Tuổi: ");
            int age = sc.nextInt(); // Đọc số nguyên từ bàn phím

            // Tạo một đối tượng hành khách với các thông tin vừa nhập
            Customer customer = new Customer(fullName, sex, age);

            // Thêm đối tượng hành khách vào danh sách hành khách
            listCustomer.add(customer);
        }


        // Thực hiện đặt vé cho các hành khách và tính danh sách số tiền phải trả cho mỗi hành khách
        for (Customer customer : listCustomer) { // Duyệt qua danh sách hành khách
            System.out.println("Hành khách " + customer.getFullName() + " muốn đặt vé cho những chuyến bay nào?");
            System.out.println("Nhập số lượng chuyến bay muốn đặt vé: ");
            int K = sc.nextInt(); // Đọc số nguyên từ bàn phím
            for (int i = 0; i < K; i++) { // Lặp K lần để đặt vé cho K chuyến bay
                System.out.println("Nhập ký hiệu chuyến bay muốn đặt vé: ");
                String flightCallSign = sc.next(); // Đọc chuỗi từ bàn phím
                for (Flight cb : listFlight) { // Duyệt qua danh sách chuyến bay
                    if (cb.getFlightCallSign().equals(flightCallSign)) { // Nếu tìm thấy chuyến bay có ký hiệu trùng với ký hiệu nhập vào
                        customer.DatVe(cb); // Gọi phương thức đặt vé cho hành khách với chuyến bay tìm được
                        break; // Thoát khỏi vòng lặp
                    }
                }
            }
            System.out.println("Số tiền phải trả của hành khách " + customer.getFullName() + " là: " + customer.TinhTien());
        }

        // In ra thông tin danh sách hành khách với số tiền mua vé tăng dần
        System.out.println("Danh sách hành khách với số tiền mua vé tăng dần:");
        // Sắp xếp danh sách hành khách theo số tiền mua vé tăng dần bằng cách sử dụng thuat toan noi bot

        List<Customer> sortCustomer = new ArrayList<>();

        for (int i = 0; i < listCustomer.size() - 1; i++) {
            Customer minCus = listCustomer.get(i); // lay ra phan tu customer thu i gan bang min
            for (int j = i + 1; j < listCustomer.size(); j++) {
                if(minCus.TinhTien() > listCustomer.get(j).TinhTien()){ // neu min lon hon phan tu customer thu j thi gan nguoc lai min cho pt thu j
                    minCus = listCustomer.get(j);
                }
            }
            sortCustomer.add(minCus); // add min vao mang moi
        }

        for (Customer customer: sortCustomer
             ) {
            customer.PrintInfo();
        }
    }
}
