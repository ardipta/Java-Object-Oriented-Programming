package hotelroommanagement;
import java.util.Scanner;
public class RoomCatagory extends Room implements RoomCatagoryInterface{

    protected String roomType;
    protected String customerInfo=null;
    protected int noOfRoom;
    protected RoomCatagory(){
        super();
        input=new Scanner(System.in);
        
    }
    @Override
    public void inputRoomType() {
        System.out.println("Enter room type(Standard/Family/Deluxe):");
        roomType=input.nextLine();
        
    }

    @Override
    public String setRoomCatagory() {
        if(roomType.equalsIgnoreCase("Standard")){
            System.out.println("Room catagory:"+roomType);
            return roomType;
        }
        else if(roomType.equalsIgnoreCase("Family")){
            System.out.println("Room catagory:"+roomType);
            return roomType;
        }
         else if(roomType.equalsIgnoreCase("Deluxe")){
            System.out.println("Room catagory:"+roomType);
            return roomType;
        }
        else
             return null;
    }


    public void roomBooking(String customerID) {
        System.out.println("Enter number of room for booking:");
        noOfRoom=input.nextInt();
        customerInfo=customerID;
    
        
    }
    public void printAllRoomInfo(){
        System.out.println("Room type:"+roomType);
        System.out.println("Number of room booked:"+noOfRoom);
        System.out.println("Room number "+getRoomNo()+" has been booked by customer ID: "+customerInfo);
        
    }
}
