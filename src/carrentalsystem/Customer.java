package carrentalsystem;

import java.util.List;

public class Customer extends User{
    private List<RentalBooking> bookingHistory;

    public Customer(String userId, String name, String email, String phone) {
        super(userId, name, email, phone);
    }

    public void addBooking(RentalBooking booking) {
        bookingHistory.add(booking);
    }

    public List<RentalBooking> getBookingHistory() {
        // show all the booking history.
        return null;
    }
}
