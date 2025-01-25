package movieticketbookingsystem;

public class Seat {
    private int seatNumber;
    private boolean isBooked;
    private int row;
    private SeatType seatType;
    private double price;

    public Seat(int seatNumber, boolean isBooked, int row, SeatType seatType,double price) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
        this.row = row;
        this.seatType = seatType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
