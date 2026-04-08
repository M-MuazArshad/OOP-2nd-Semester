public class Location {
    private String roomName;
    private int floorNumber;

    Location(String roomName, int floorNumber){
        this.roomName=roomName;
        setFloorNummber(floorNumber);
    }

    public void setFloorNummber(int floorNumber){
        this.floorNumber=floorNumber;
    }

    public int getFloorNumber(){
        return floorNumber;
    }

    public void setRoomName(String roomName){
        this.roomName=roomName;
    }

    public String getRoomName(){
        return roomName;
    }

    @Override
    public String toString(){
        return String.format("%s, Floor: %d", roomName, floorNumber);
    }
}
