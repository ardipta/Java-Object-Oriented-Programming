package meenabazarsupershop;
import java.util.Scanner;
public class Person{
    private String name, id, address;
    Scanner input;
    public Person(){
        input=new Scanner(System.in);
    }
    public void setAll(){
        System.out.println("Enter Name:");
        name=input.nextLine();
        System.out.println("Enter ID:");
        id=input.nextLine();
        System.out.println("Enter Address:");
        address=input.nextLine();
    }
    public void printAll(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Address:"+address);
    }
    
}
