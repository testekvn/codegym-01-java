package Buoi_08.btvn.flightticket;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Fight
 */
public class Flight {
    private String name;                    // Ten chuyen bay
    private String departureDate;           // Ngay khoi hanh
    private float price;                    // Gia ve
    private String code;                    // Ma code chuyen bay
    private int numberOfTicket;             // So luong ghe/ve
    private List<Booking> bookingList;      // Danh sach hanh khach

    public Flight() {
        bookingList = new ArrayList<>();
    }

    public Flight(String name, String code, String departureDate, float price, int numberOfTicket) {
        this.name = name;
        this.departureDate = departureDate;
        this.price = price;
        this.code = code;
        this.numberOfTicket = numberOfTicket;
        this.bookingList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    /**
     * Bo sung them KH mua ve may bay
     *
     * @param booking
     */
    public void addNewBooking(Booking booking) {
        // Neu so luong nguoi duoc add lon hon so luong ve, bao loi
        if ((getBookedTicket() + booking.getTicketTotalForCustomer()) > numberOfTicket) {
            throw new RuntimeException("The flight is  over, please book other.");
        }
        this.bookingList.add(booking);
    }

    public int getBookedTicket() {
//        int bookedTotal = 0;
//        for (Booking b : bookingList) {
//            bookedTotal += b.getTicketTotalForCustomer();
//        }
        return bookingList.stream().mapToInt(Booking::getTicketTotalForCustomer).sum();
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Flight{" +
                " name='" + name + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", price=" + price +
                ", code='" + code + '\'' +
                ", numberOfTicket=" + numberOfTicket +
                ", bookedTicket=" +getBookedTicket() +
                "}\n";
    }
}
