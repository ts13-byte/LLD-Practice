package carrentalsystem;

import java.util.Date;

public class RentalBooking {
    private int id; // Unique booking ID
    private Customer customer; // Customer who made the booking
    private Car car; // Car being rented
    private Date startDate; // Start of rental period
    private Date endDate; // End of rental period
    private BookingStatus bookingStatus; // Status of the booking
    private PaymentDetails paymentDetails;// Payment status

    // Constructor
    public RentalBooking(int id, Customer customer, Car car, Date startDate, Date endDate, PaymentDetails paymentDetails) {
        this.id = id;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentDetails = paymentDetails;
        this.bookingStatus = BookingStatus.BOOKED; // Default status// Default payment status
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}