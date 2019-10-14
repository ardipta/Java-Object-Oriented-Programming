package mentormanagementsystem;
import java.util.Scanner;
public class Advisor extends Person implements AdvisorInterface{

    private String nameOfAdvisor;
    private final int  noOfStudent=40;
    private int advisedStudent=0;
    private double due;
    private Scanner input;
    public Advisor(){
        super();
        input=new Scanner(System.in);    }
    
    @Override
    public void inputAllAdvisorInfo() {
        System.out.println("Enter Advisor Name:");
        nameOfAdvisor=input.nextLine();
    }
    public void AddStudent(String adName){
       for(int i=0; i<noOfStudent; i++){
           if(nameOfAdvisor.equalsIgnoreCase(adName)){
               advisedStudent++;
               break;
           }
       }
        System.out.println("Total Advised student:"+advisedStudent);
    }
    public void ShowDue(double payable, double paid){
        due=payable-paid;
        System.out.println("Total Due:"+due);
        
    }
    public void ShowLowCgpaIds(double cgpa, String id){
        if(cgpa<3.0){
            System.out.println("Student ID"+id);
        }
    }
    public void ShowAbsentNames(int absentDays, String name){
        if(absentDays>10){
            System.out.println("Absent Student Name:"+name);
        }
    }
    
}
