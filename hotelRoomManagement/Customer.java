package hotelroommanagement;
import java.util.Scanner;
public class Customer implements CustomerInterface{
    protected String id,
                     name,
                     email,
                     address;
    protected Scanner input;
        protected Customer(){
            input=new Scanner(System.in);
        }

    @Override
    public void inputAllCustomerInfo() {
        System.out.println("Enter ID:");
        id=input.nextLine();
        System.out.println("Enter Name:");
        name=input.nextLine();
        System.out.println("Enter Email:");
        email=input.nextLine();
        System.out.println("Enter Address:");
        address=input.nextLine();
        
    }

    @Override
    public String getID() {
        return id;
    }
    public String getName(){
        return name;
    }
     public String getEmail(){
        return email;
    }
      public String getAdress(){
        return address;
    }

    @Override
    public void printAllCustomerInfo() {
        System.out.println("Customer ID:"+id);
        System.out.println("Customer Name:"+name);
        System.out.println("Customer Email:"+email);
        System.out.println("Customer Address:"+address);
    }
    
}
