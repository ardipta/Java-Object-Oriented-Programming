package companyabc;
import java.util.Scanner;
public class Person {
    private String name, id, designation;
    public Scanner input;
    public Person(){
        input=new Scanner(System.in);
    }
    public void setAll(){
        System.out.println("Enter Name:");
        name=input.nextLine();
        System.out.println("Enter ID:");
        id=input.nextLine();
        System.out.println("Enter designation:");
        designation=input.nextLine();
    }
    public String getDesignation(){
        return designation;
    }
    public void desplayAll(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Designation:"+designation);
        
    }
}
