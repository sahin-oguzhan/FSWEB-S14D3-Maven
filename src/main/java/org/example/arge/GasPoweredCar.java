package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    double avgKmPerLitre;
    int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
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
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }
}
