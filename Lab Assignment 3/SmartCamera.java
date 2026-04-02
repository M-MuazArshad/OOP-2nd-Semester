public class SmartCamera extends SmartDevice {
    private String resolution;

    public SmartCamera(String brand, double battery, String resolution) {
        super(brand, battery);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void operate() {
        System.out.println("Operating the smart camera...");
    }

    @Override
    public double powerConsumption() {
        System.out.println("The smart camera consumes high power.");
        return 2.0; // Example power consumption value
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Resolution: %s", resolution);
    }
    
}
