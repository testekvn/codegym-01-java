package Buoi_08.btvn.flightticket;

import java.util.*;

public class FlightManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        List<Flight> fightList = new ArrayList<>();

        System.out.println("Flight Management, developed by DuyBG\nPlease input:");
        System.out.print("1. The number of flight: ");
        int numOfFlight = sc.nextInt();         // DuyBG: You need to validate  input data
        sc.nextLine();

        System.out.println("Input the flight detail");
        while (fightList.size() < numOfFlight) {
            System.out.println("\tFlight number " + (fightList.size() + 1));
            Flight flight = new Flight();

            System.out.print("\t\tFlight Name:");
            flight.setName(sc.nextLine().trim());

            System.out.print("\t\tFlight Code:");
            flight.setCode(sc.nextLine().trim().toUpperCase());

            System.out.print("\t\tDeparture Date:");
            flight.setDepartureDate(sc.nextLine().trim());

            System.out.print("\t\tTicket Prices:");
            flight.setPrice(sc.nextFloat());
            sc.nextLine();

            System.out.print("\t\tTicket Total:");
            flight.setNumberOfTicket(sc.nextInt());
            sc.nextLine();

            fightList.add(flight);
        }

        // Import the Customer
        System.out.print("\n2. The number of Customer: ");
        int numOfCustomer = sc.nextInt();         // DuyBG: You need to validate  input data
        sc.nextLine();
        while (customers.size() < numOfCustomer) {
            System.out.println("\tCustomer number " + (customers.size() + 1));
            Customer customer = new Customer();

            System.out.print("\t\tCustomer Name:");
            customer.setFullName(sc.nextLine().trim());

            System.out.print("\t\tCustomer Gender:");
            customer.setGender(sc.nextLine().trim());

            System.out.print("\t\tCustomer Age:");
            customer.setAge(sc.nextInt());
            sc.nextLine();

            customers.add(customer);
        }

        // Fake data
        customers.addAll(fakeCustomerDataForTesting());
        fightList.addAll(fakeFilghtDataForTesting());

        // Booking flight
        System.out.println("\n3. Booking flight");
        System.out.println("\nFlight List:\n" + fightList);
        for (Customer c : customers) {
            System.out.println("Customer info: \n" + c);
            System.out.print("Do you want to book flight ? (Y-for Yes, otherwise for No): ");
            String isBooking = sc.nextLine();
            if (!isBooking.equalsIgnoreCase("Y")) continue;

            for (Flight f : fightList) {
                Booking booking = null;
                System.out.println("Thong tin chuyen bay day ne, xem di\n" + f);
                System.out.print("\nMay co dat ve chuyen bay nay khong ? (Y - Co, khac la Khong)");
                String isBooked = sc.nextLine();
                if (isBooked.equalsIgnoreCase("Y")) {
                    System.out.print("\nSo luong ve may muon mua cua tao la bao nhieu: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    booking = new Booking(c, f, quantity);
                    f.addNewBooking(booking);
                    c.bookingFlight(booking);
                }
            }
            // region  Advance - Using lambda
//            System.out.print("Please choose the flight which you want (Example VIN365-2;VIN363-1 ~ Flight code: VIN365 and book 2 tickets) : ");
//            String selectFlight = sc.nextLine();
//            String[] flightArr = selectFlight.split(";");
            // Flight : VJ001-12; VJ002-15;VN004-23;VJ003-12
            // Duy lan luot tung booking cua khach hang va phat trien logic
//
//            Arrays.stream(flightArr).forEach(f -> {
//                Booking booking = null;
//                try {
//                    String[] temp = f.trim().split("-");
//                    // Kiem tra xem flight KH nhap co trong danh sach fligh khong - Su dung For
//                    Optional<Flight> flight = fightList.stream().filter(v -> temp[0].equalsIgnoreCase(v.getCode())).findFirst();
//                    int ticketTotal = 0;
//                    // Neu flight KH da chon, co ton tai trong danh sach thi se validate so luong ve mua
//                    if (flight.isPresent()) {
//                        ticketTotal = Integer.parseInt(temp[1]);
//                        booking = new Booking(c, flight.get(), Math.max(ticketTotal, 0));
//                        // Add booking cho chuyen bay
//                        flight.get().addNewBooking(booking);
//                    }
//
//                    // Neu thong tin khach hang nhap hop le thi tao booking va add vao  danh sach
//                    if (booking != null) c.bookingFlight(booking);
//
//                } catch (Exception e) {
//                    System.out.println("VDebug - The error occurred, please check \n" + e);
//                }
//            });

            // endregion
        }

        // Tinh so tien phai tra cho moi khach hang
        for (Customer c : customers) {
            List<Booking> cusBooking = c.getCustomerFlights();
            if (cusBooking.isEmpty()) continue;

            System.out.println("Customer: " + c.getFullName() + ": Ticket Total: " + c.getTicketTotal() + " - Amount Total: " + String.format("%.2f", c.getPaymentAmount(null, null, null)));
            System.out.println("Tong tien (da tru khuyen mai sau khi mua ve voi chinh sach Nếu khách hàng đã mua tổng 10tr tiền vé, sẽ được khuyến mại 20% cho 03 lần tiếp theo): " + String.format("%.2f", c.getPaymentAmount(10000000f, 0.2f, 3)));
        }
    }

    private static List<Customer> fakeCustomerDataForTesting() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nguyen Van Anh", "Nu", 23));
        customers.add(new Customer("Nguyen Truc Anh", "Nu", 23));
        customers.add(new Customer("Nguyen Lam Anh", "Nam", 23));
        customers.add(new Customer("Nguyen Tue Anh", "Nu", 23));
        customers.add(new Customer("Nguyen Duc Anh", "Nam", 23));
        return customers;
    }

    private static List<Flight> fakeFilghtDataForTesting() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("VietJet:HN-HP", "VJ001", "24/08/2023", 6000000f, 100));
        flights.add(new Flight("VNAirlines:HN-HP", "VN001", "24/08/2023", 6000000f, 100));
//        flights.add(new Flight("VNAirlines:HN-DN", "VN002", "24/08/2023", 6000000f, 100));
//        flights.add(new Flight("VietJet:HN-DN", "VJ002", "24/08/2023", 6000000f, 100));
//        flights.add(new Flight("VNAirlines:HCM-Incheon", "VN003", "24/08/2023", 6000000f, 100));
//        flights.add(new Flight("VNAirlines:HN-Tokyo", "VN004", "24/08/2023", 6000000f, 100));
//        flights.add(new Flight("VietJet:HN-HCM", "VJ003", "24/08/2023", 6000000f, 100));
        return flights;
    }
}
