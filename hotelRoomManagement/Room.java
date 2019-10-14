package hotelroommanagement;
import java.util.Scanner;
public abstract class Room {
    protected String roomNumber,
                     numberOfBed,
                     facility, 
                     sizeOfRoom;
    protected Scanner input;
        protected Room(){
            input=new Scanner(System.in);
        }
    protected void setAll(){
        System.out.println("Enter Room no:");
        roomNumber=input.nextLine();
        System.out.println("Enter room size(ft.inch):");
        sizeOfRoom=input.nextLine();
        System.out.println("Enter number of bed(single/double/multi)");
        numberOfBed=input.nextLine();
        System.out.println("Enter room facility:");
        facility=input.nextLine();
    }
    protected String getRoomNo(){
        return roomNumber;
    }
    protected void printAll(){
        System.out.println("Room No:"+roomNumber);
        System.out.println("Room size:"+sizeOfRoom);
        System.out.println("Number of beds:"+numberOfBed);
        System.out.println("Room facilities:"+facility);
    }
}
