package org.example.arge;

public class HybridCar extends CarSkeleton {
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String name, String description, int batterySize, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.batterySize = batterySize;
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
