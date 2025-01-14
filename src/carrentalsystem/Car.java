package carrentalsystem;

public class Car {
    private String vehicleNumber;
    private String id;
    private CarType carType;
    private BookingStatus bookingStatus;

    public Car(String vehicleNumber, String id, CarType carType, BookingStatus bookingStatus) {
        this.vehicleNumber = vehicleNumber;
        this.id = id;
        this.carType = carType;
        this.bookingStatus = bookingStatus;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public BookingStatus getStatus() {
        return bookingStatus;
    }

    public void setStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
}
