package parkinglot;
import java.time.Duration;
import java.util.Map;

public class HourlyFeeCalculator implements FeeCalculator {
    @Override
    public double calculateFee(Ticket ticket, Vehicle vehicle) {
        long hoursParked = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours();
        VehicleType vehicleType = vehicle.getVehicleType();
        double fee = (hoursParked * vehicleType.getHourlyRate());
        return Math.ceil(fee);
    }
}
