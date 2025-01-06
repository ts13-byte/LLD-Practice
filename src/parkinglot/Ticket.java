package parkinglot;

import java.time.LocalDateTime;
import java.util.SplittableRandom;

public class Ticket {
    private final String ticketId;
    private final String parkingSpotId;
    private final String vehicleLicensePlate;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, String parkingSpotId, String vehicleLicensePlate, LocalDateTime entryTime) {
        this.ticketId = ticketId;
        this.parkingSpotId = parkingSpotId;
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.entryTime = entryTime;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
