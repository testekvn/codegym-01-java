package Buoi_07.Flight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * + Xây dựng lớp Chuyenbay gồm:
 *   + Thuộc tính: tenchuyen, ngaybay, giave, kyhieuchuyen, soluongve, danh sách người trên chuyến bay đó
 *   + Phương thức: PrintInfo (~ In ra thông tin), và các phương thức getter/setter
 */
public class Flight {
    String nameFlight; // ten chuyen bay
    String departureDate; // ngay bay
    float priceOfTicket; // gua ve
    String flightCallSign; // ky hieu chuyen bay
    int quantityTicket; // so luong ve

    List<Person> listPersonOfFlight = new ArrayList<>();

    public Flight(String nameFlight, String departureDate, float priceOfTicket, String flightCallSign, int quantityTicket) {
    }

    public void PrintInfo(){
        System.out.println("Ten chuyen bay" + nameFlight);
        System.out.println("Ngay bay" + departureDate);
        System.out.println("Gia ve" + priceOfTicket);
        System.out.println("Ky hieu chuyen bay" + flightCallSign);
        System.out.println("So luong ve" + quantityTicket);
        System.out.println("Danh sach khach hang tren chuyen bay: ");
        int i = 1;
        for (Person person: listPersonOfFlight
             ) {
            System.out.println("Thong tin nguoi thu: " + i);
            person.PrintInfo();
            i++;
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
                "nameFlight='" + nameFlight + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", priceOfTicket=" + priceOfTicket +
                ", flightCallSign='" + flightCallSign + '\'' +
                ", quantityTicket=" + quantityTicket +
                ", listPersonOfFlight=" + listPersonOfFlight +
                '}';
    }

    public Flight(String nameFlight, String departureDate, float priceOfTicket, String flightCallSign, int quantityTicket, int quantityCustomer, List<Person> listPersonOfFlight) {
        this.nameFlight = nameFlight;
        this.departureDate = departureDate;
        this.priceOfTicket = priceOfTicket;
        this.flightCallSign = flightCallSign;
        this.quantityTicket = quantityTicket;
        this.listPersonOfFlight = listPersonOfFlight;
    }

    public String getNameFlight() {
        return nameFlight;
    }

    public void setNameFlight(String nameFlight) {
        this.nameFlight = nameFlight;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public float getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(float priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public String getFlightCallSign() {
        return flightCallSign;
    }

    public void setFlightCallSign(String flightCallSign) {
        this.flightCallSign = flightCallSign;
    }

    public int getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(int quantityTicket) {
        this.quantityTicket = quantityTicket;
    }


    public List<Person> getListPersonOfFlight() {
        return listPersonOfFlight;
    }

    public void setListPersonOfFlight(List<Person> listPersonOfFlight) {
        this.listPersonOfFlight = listPersonOfFlight;
    }
}
