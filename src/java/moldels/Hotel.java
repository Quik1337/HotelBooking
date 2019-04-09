package moldels;

import java.util.ArrayList;
import java.util.List;

public class Hotel
{
    private List<Room> rooms;
    
    private String name, address, phoneNumber;
    
    public Hotel(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        
        rooms = new ArrayList();
        rooms.add(new Room("1", "100$", true , Room.RoomTypes.SingleRoom));
        rooms.add(new Room("2", "80$", false , Room.RoomTypes.SingleRoom));
        rooms.add(new Room("3", "150$", true , Room.RoomTypes.DoubleRoom));
        rooms.add(new Room("4", "130$", false, Room.RoomTypes.DoubleRoom));
        rooms.add(new Room("5", "200$", true, Room.RoomTypes.Suite));
        rooms.add(new Room("6", "200$", true, Room.RoomTypes.Suite));
    }   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }   
}
