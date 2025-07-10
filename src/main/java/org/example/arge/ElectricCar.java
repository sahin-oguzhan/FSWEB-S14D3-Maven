package org.example.arge;

public class ElectricCar extends CarSkeleton {
    double avgKmPerCharge;
    int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return getName() + " is started";
    }

    @Override
    public String drive() {
        return runEngine() + " and driving";
    }

    @Override
    public String runEngine() {
        return getName() + " engine is running";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }
}
