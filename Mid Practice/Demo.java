class Demo{
    public static void main(String[] args) {
        
        Device.showSystemType();
        Location loc1= new Location("Living Room", 1);
        Location loc2= new Location("Garage", 0);
        Location loc3 = new Location("Main Gate", 0);
        Sensor sensor1 = new Sensor(101, "Temperature Sensor", loc1, "Temperature");
        SmartSensor smart1 = new SmartSensor(202, "Security Sensor", loc2, "Motion", 85);

        Device[] devices = new Device[5];
        devices[0] = sensor1;
        devices[1] = smart1;

        System.out.println("------ Device Details -------");
        for(int i=0;i < devices.length;i++){
            if(devices[i]==null){
                continue;
            }
            devices[i].displayInfo();
            devices[i].operate();
        }

        Device ref = new SmartSensor(303, "Door Sensor", loc3, "Door Activity", 92);

        ref.displayInfo();
        ref.operate();

        SmartSensor specialref = (SmartSensor) ref;

        specialref.sendAlert();
        specialref.sendAlert("Battery low or unusual movement detected");
    }
}