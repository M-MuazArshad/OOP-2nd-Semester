public class Demo {
    public static void main(String[] args) {
        SmartDevice s1 = new SmartCamera("Canon", 80.0, "1080p");
        SmartDevice s2 = new SmartSpeaker("Sonos", 70.0, 60);
        SmartDevice s3 = new SmartWatch("Apple", 60.0, 5000, 72.0);

        SmartDevice [] smartList={s1,s2,s3};

        System.out.println("Before Modification");
        for (SmartDevice temp : smartList) {
            temp.showBrand();       //final is used
            System.out.println(temp); 
            System.out.println("------------------------------");
        }
         for(SmartDevice temp: smartList) {
            System.out.println();
            if(temp instanceof SmartCamera)
               ((SmartCamera)temp).setResolution("2K");
        }

         for(SmartDevice temp: smartList) {
            System.out.println();
            if(temp instanceof SmartSpeaker)
                if(((SmartSpeaker)temp).getVolumeLevel() == 60) 
                    ((SmartSpeaker)temp).setVolumeLevel(80);
        }
 
        System.out.println("AFTER MODIFICATION");
            for (SmartDevice temp : smartList) {
                temp.showBrand();       
                System.out.println(temp); 
                System.out.println("------------------------------");
            }
    }
    
}
