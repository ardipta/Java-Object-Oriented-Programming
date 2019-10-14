package hospitalbillcalculation;
import java.util.Scanner;
public abstract class Person {
    protected String name, age;
    protected Scanner input;
        protected Person(){
            input=new Scanner(System.in);
        }
    protected void setAll(){
        System.out.println("Enter name:");
        name=input.nextLine();
        System.out.println("Enter age:");
        age=input.nextLine();
    }
    protected String getName(){
        return name;
    }
    protected String getAge(){
        return age;
    }
    
    protected void printAll(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
