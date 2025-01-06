package parkinglot;

import java.time.LocalDateTime;
import java.util.*;

//core functionality
public class ParkingLotManagementSystem {
    private List<ParkingSpot> parkingSpots;
    private Map<String,Ticket> activeTickets;
    private FeeCalculator feeCalculator;

    public ParkingLotManagementSystem(FeeCalculator feeCalculator) {
        parkingSpots = new ArrayList<>();
        activeTickets = new HashMap<>();
        this.feeCalculator = feeCalculator;
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getSize() == vehicle.getVehicleType()) {
                spot.parkVehicle(vehicle); // Assign the vehicle to the spot
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId,spot.getSpotId(), vehicle.getLicensePlate(), LocalDateTime.now());
                activeTickets.put(ticketId, ticket);
                return ticket;
            }
        }
        throw new RuntimeException("No available parking spot for vehicle type: " + vehicle.getVehicleType());
    }

    public double unParkVehicle(String ticketId) {
        Ticket ticket = activeTickets.get(ticketId);
        if (ticket == null) {
            throw new RuntimeException("Invalid ticket ID");
        }

        ParkingSpot spot = parkingSpots.stream()
                .filter(s -> s.getSpotId().equals(ticket.getParkingSpotId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Parking spot not found"));

        Vehicle vehicle = spot.getCurrentVehicle();
        if (vehicle == null) {
            throw new RuntimeException("No vehicle found in the specified spot!");
        }

        ticket.setExitTime(LocalDateTime.now());
        spot.vacateSpot();
        activeTickets.remove(ticketId);

        return feeCalculator.calculateFee(ticket, vehicle);
    }


}
