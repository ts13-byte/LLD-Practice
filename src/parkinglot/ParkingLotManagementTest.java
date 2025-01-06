package parkinglot;

public class ParkingLotManagementTest {
    public static void main(String[] args) {
        FeeCalculator feeCalculator = new HourlyFeeCalculator();
        ParkingLotManagementSystem system = new ParkingLotManagementSystem(feeCalculator);

        system.addParkingSpot(new ParkingSpot("S1", VehicleType.CAR));
        system.addParkingSpot(new ParkingSpot("S2", VehicleType.BIKE));
        system.addParkingSpot(new ParkingSpot("S3", VehicleType.TRUCK));

        Vehicle car = new Car("CAR123");
        Ticket ticket = system.parkVehicle(car);
        System.out.println("Ticket ID: " + ticket.getTicketId() + " ; parking spot assigned : "
                + ticket.getParkingSpotId() + " ; vehicle License Plate : " + ticket.getVehicleLicensePlate());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double fee = system.unParkVehicle(ticket.getTicketId());
        System.out.println("Parking Fee: " + fee);
    }
}
