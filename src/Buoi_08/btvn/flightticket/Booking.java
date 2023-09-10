package Buoi_08.btvn.flightticket;

/**
 * Class for booking
 */
public class Booking {
    private Customer customer;
    private Flight fight;
    private int ticketTotalForCustomer;

    public Booking(Customer customer, Flight fight, int ticketTotalForCustomer) {
        this.customer = customer;
        this.fight = fight;
        this.ticketTotalForCustomer = ticketTotalForCustomer;
    }

    public Booking() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFight() {
        return fight;
    }

    public void setFight(Flight fight) {
        this.fight = fight;
    }

    public int getTicketTotalForCustomer() {
        return ticketTotalForCustomer;
    }

    public void setTicketTotalForCustomer(int ticketTotalForCustomer) {
        this.ticketTotalForCustomer = ticketTotalForCustomer;
    }
}
