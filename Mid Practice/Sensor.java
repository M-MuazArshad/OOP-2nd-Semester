public class Sensor extends Device{
    private String sensorType;

    Sensor(int deviceId, String deviceName, Location location, String sensorType){
        super(deviceId, deviceName, location);
        System.out.println("Sensor constructor called");
        setSensorType(sensorType);
    }
    
    public void setSensorType(String sensorType){
        this.sensorType=sensorType;
    } 

    public String getSensorType(){
        return sensorType;
    }

    public void operate(){
        System.out.println("Sensor is monitoring Temperature data.");
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Sensor Type: " + sensorType);
    }
}

