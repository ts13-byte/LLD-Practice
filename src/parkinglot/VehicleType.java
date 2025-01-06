package parkinglot;

public enum VehicleType {
    BIKE(10.0, 0.2),
    CAR(20.0, 0.5),
    TRUCK(50.0, 1.0);

    private final double hourlyRate;
    private final double perMinuteRate;

    VehicleType(double hourlyRate, double perMinuteRate) {
        this.hourlyRate = hourlyRate;
        this.perMinuteRate = perMinuteRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getPerMinuteRate() {
        return perMinuteRate;
    }
}
