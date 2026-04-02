public class SmartWatch extends SmartDevice {
    private int stepCount;
    private double heartRate;

    public SmartWatch(String brand, double battery, int stepCount, double heartRate) {
        super(brand, battery);
        this.stepCount = stepCount;
        this.heartRate = heartRate;
    }

    @Override
    public void operate() {
        System.out.println("Operating the smart watch...");
    }

    @Override
    public double powerConsumption() {
        System.out.println("The smart watch consumes low power.");
        return 0.5; // Example power consumption value
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Step Count: %d, Heart Rate: %.2f", stepCount, heartRate);
    }
    
}
