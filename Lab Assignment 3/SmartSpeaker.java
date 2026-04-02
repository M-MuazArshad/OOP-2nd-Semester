public class SmartSpeaker extends SmartDevice {
    private int volumeLevel;

    public SmartSpeaker(String brand, double battery, int volumeLevel) {
        super(brand, battery);
        this.volumeLevel = volumeLevel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void operate() {
        System.out.println("Operating the smart speaker...");
    }

    @Override
    public double powerConsumption() {
        System.out.println("The smart speaker consumes moderate power.");
        return 1.0; // Example power consumption value
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Volume Level: %d", volumeLevel);
    }
}