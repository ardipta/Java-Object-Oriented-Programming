package hotelroommanagement;
public class Main {
    public static void main(String[] args) {
        RoomCatagory rc=new RoomCatagory();
        Customer cs=new Customer();
        System.out.println("Enter Room information");
        rc.setAll();
        rc.inputRoomType();
        rc.setRoomCatagory();
        System.out.println("Enter customer information");
        cs.inputAllCustomerInfo();
        System.out.println("Room booking:");
        rc.roomBooking(cs.getID());
        System.out.println("Print All info.");
        rc.printAll();
        cs.printAllCustomerInfo();
        rc.printAllRoomInfo();
    }
    
}
