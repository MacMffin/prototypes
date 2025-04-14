package nl.test.model.vehicles;

public abstract class Vehicle {
    private String brand;
    private int length;
    private int maxSpeedInKM;

    public Vehicle() {}

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.length = vehicle.length;
        this.maxSpeedInKM = vehicle.maxSpeedInKM;
    }

    public String getBrand() {
        return brand;
    }

    public int getLength() {
        return length;
    }

    public int getMaxSpeedInKM() {
        return maxSpeedInKM;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setMaxSpeedInKM(int maxSpeedInKM) {
        this.maxSpeedInKM = maxSpeedInKM;
    }

    public abstract String getModeOfTransport();
    public abstract Vehicle clone();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", length=" + length +
                ", maxSpeedInKM=" + maxSpeedInKM +
                '}';
    }
}
