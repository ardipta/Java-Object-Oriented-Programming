package electricitycostmodeling;
import java.util.Scanner;
public abstract class Person implements PersonInterface{

    private String id, name, address;
    public Scanner input;
    public Person(){
        input=new Scanner(System.in);
    }
    @Override
    public void inputAll(){
         System.out.println("Enter ID:");
         id=input.nextLine();
         System.out.println("Enter Name:");
         name=input.nextLine();
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public void printAll() {
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
    }
    
}
