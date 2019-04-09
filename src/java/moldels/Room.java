package moldels;

public class Room
{
    public enum RoomTypes {
        Suite, SingleRoom, DoubleRoom
    }
    
    private String roomNumber, price;
    private Boolean balcony;
    private RoomTypes roomType;

    public Room(String roomNumber, String price, Boolean balcony, RoomTypes roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.balcony = balcony;
        this.roomType = roomType;
    }
}
