public abstract class SmartDevice {
    protected String brand;
    protected double battery;

    public SmartDevice(String brand, double battery) {
        this.brand = brand;
        this.battery = battery;
    }

    public void chargeBattery() {
        System.out.println("Charging the device... Current battery: " + battery);
    }

    public final void showBrand() {
        System.out.println("Device brand is: " + this.brand);
    }
    
    public abstract void operate();

    public abstract double powerConsumption();

    @Override
    public String toString() {
        return String.format("Brand: %s, Battery: %s", brand, battery);
    }
}