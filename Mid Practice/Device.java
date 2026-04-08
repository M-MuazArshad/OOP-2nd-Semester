public abstract class Device {
    private int deviceId;
    private String deviceName;
    private Location location;

    Device(int deviceId, String deviceName, Location location){
        System.out.println("Device constructor called");
        this.deviceId=deviceId;
        this.deviceName=deviceName;
        this.location=location;

    }

    public void setDeviceId(int deviceId){
        this.deviceId=deviceId;
    }
    
    public int getDeviceId(){
        return deviceId;
    }

    public void setDeviceName(String deviceName){
        this.deviceName=deviceName;
    }

    public String getDeviceName(){
        return deviceName;
    }

    public void setLocation(Location location){
        this.location=location;
    }

    public Location geLocation(){
        return location;
    }

    public abstract void operate();
 
    public static void showSystemType(){
        System.out.println("Smart Home Device Management System");
    }

    public void displayInfo(){
        System.out.println("Device ID: " + deviceId);
        System.out.println("Device Name: " + deviceName);
        System.out.println("Location: " + location);
    }
}

