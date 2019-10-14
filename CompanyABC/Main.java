package companyabc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee e=new Employee();
        ProjectManager pm=new ProjectManager();
        while(true){
        System.out.println("Enter Employee information:");
        e.setAll();
        e.setWorkingHour();
        pm.setSalary();   
        System.out.println("want more?Y or N");
        if(input.nextLine().equalsIgnoreCase("N")){
            break;
        }  
        input.nextLine();
        }
        System.out.println("Show information:");
        System.out.println("Enter Employee designation:");
        String des=input.nextLine();
        if(des.equalsIgnoreCase(e.getDesignation())){
            e.desplayAll();
            e.displayWorkingHour();
            pm.displaySalary();
        }
        
        }
    }
    
