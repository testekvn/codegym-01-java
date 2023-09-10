package Buoi_08.btvn.flightticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer extends Person {
    private List<Booking> flightList;
    private int ticketTotal;

    public Customer(String fullName, String gender, int age) {
        super(fullName, gender, age);
        flightList = new ArrayList<>();
    }

    public Customer() {
        super();
    }

    public List<Booking> getCustomerFlights() {
        return flightList;
    }

    /**
     * Customer books the flight
     *
     * @param booking : booking info
     */
    public void bookingFlight(Booking booking) {
        this.flightList.add(booking);
    }

    public int getTicketTotal() {
        return ticketTotal = getTicketTotalOfCustomer();
    }

    /**
     * Tinh tong so ve khach hang da mua
     */
    private int getTicketTotalOfCustomer() {
        int result = 0;
        if (flightList != null & !flightList.isEmpty()) {
            for (Booking b : flightList) {
                // Tong so ve cua cac chuyen bay ma khach hang da book
                result += b.getTicketTotalForCustomer();
            }
        }
        return result;
    }

    /**
     * Tinh tong so tien da thanh toan
     *
     * @param amountForDiscount : So tien toi han ma khach hang duoc khuyen mai
     * @param discountRate:     Ti le khuyen mai  (20%)
     * @param discountNum       : So  lan khuyen mai tiep theo (3 lan tiep theo)
     */
    public float getPaymentAmount(Float amountForDiscount, Float discountRate, Integer discountNum) {
        float result = 0f;
        int count = 1;
        for (Booking b : flightList) {
            // Tong tien ve cua chuyen bay hien tai = So ve * Tien ve cua chuyen bay
            float currentAmount = b.getTicketTotalForCustomer() * b.getFight().getPrice();

            // Neu ap dung ti le chiet khau va so lan khuyen mai. Can validate cac thong tin
            if (Objects.nonNull(amountForDiscount) && result >= amountForDiscount && count <= discountNum) {
                currentAmount *= (1-discountRate);
                count++;
            }
            result += currentAmount;
        }
        return result;
    }

    public void printInfo() {
        System.out.println("Customer Info:");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Customer{ " +
                super.toString() +
                ", flightList=" + flightList +
                ", ticketTotal=" + getTicketTotal() +
                '}';
    }
}
