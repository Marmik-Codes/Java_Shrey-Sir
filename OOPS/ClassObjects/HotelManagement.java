class Room{
    int roomId;
    String roomType;
    double pricePerNight;
    boolean isBooked ;
    int capacity;
    String Amenities ;
    String floor;


    Room(int roomId,String roomType,double pricePerNight,boolean isBooked,int capacity,String Amenities ,String floor){
        this.roomId = roomId;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
        this.capacity = capacity;
        this.Amenities = Amenities;
        this.floor = floor;
    }

    void bookroom(){
        if (!isBooked) {
            isBooked = true;
            System.out.println("Room " + roomId + " has been booked");
        }else{
            System.out.println("Room " + roomId + " has already booked");
        }

    }

    void cancelBooking(){
        if (isBooked) {
            isBooked = false;
            System.out.println("Room " + roomId + " has been canceled. ");
        }else{
            System.out.println("Room " + roomId + " is not currently booked. ");
        }
    }
    void displayInfo(){
        System.out.println("Room Id: " + roomId);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Price per night: " + pricePerNight);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
        System.out.println("Room Capacity: " + capacity);
        System.out.println("Room Amenities: " + Amenities);
        System.out.println("Room Floor: " + floor);
    }


}

public class HotelManagement {
    public static void main(String[] args) {
        Room r1 = new Room(231, "Deluxe", 25000, false, 2, "WiFi , TV , AC", "19");

        r1.bookroom();
        r1.displayInfo();
    }
}
