package mentormanagementsystem;
import java.util.Scanner;
public abstract class Person{

    private String id, name, contractNo;
    private Scanner input;
   
    public Person(){
        input=new Scanner(System.in);
    }

    protected void inputAll() {
        System.out.println("Enter ID:");
        id=input.nextLine();
        System.out.println("Enter Name:");
        name=input.nextLine();
        System.out.println("Enter Contract No:");
        contractNo=input.nextLine();
    }


    protected String getID() {
        return id;
    }
    protected String getName(){
        return name;
    }


    protected void printAll() {
        System.out.println("ID:"+id);
        System.out.println("Name"+name);
        System.out.println("Contract No:"+contractNo);
    }
    
}
