class SmartSensor extends Sensor{
    private int batteryLevel;

    SmartSensor(int deviceId, String deviceName, Location location, String sensorType, int batteryLevel){
        super(deviceId, deviceName, location, sensorType);
        System.out.println("SmartSensor constructor called");
        this.batteryLevel=batteryLevel;
    }

    public void sendAlert(String alert){
        System.out.println("Custom Alert: " + alert);
    }

    public void sendAlert(){
        System.out.println("Alert sent: Motion/activity detected.");
    }

    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel=batteryLevel;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void operate(){
        System.out.println("SmartSensor is operating intelligently\nwith battery level " + batteryLevel + "%");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
