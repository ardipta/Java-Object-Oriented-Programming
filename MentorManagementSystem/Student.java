package mentormanagementsystem;
import java.util.Scanner;
public class Student extends Person implements StudentInterface{

    private String advisorName;
    private int absentDays, OOP, java, database;
    private double cgpa, payble, paid;
    public Scanner input;
    public Student(){
        super();
        input=new Scanner(System.in);
    }
    @Override
    public void inputAllStudentInfo() {
        System.out.println("Enter Advisor Name:");
        advisorName=input.nextLine();
        System.out.println("Enter absent days:");
        absentDays=input.nextInt();
        System.out.println("Enter OOP mark:");
        OOP=input.nextInt();
        System.out.println("Enter java mark:");
        java=input.nextInt();
        System.out.println("Enter database mark:");
        database=input.nextInt();
        System.out.println("Enter payable amount:");
        payble=input.nextDouble();
        System.out.println("Enter paid amount:");
        paid=input.nextDouble();
        
    }
    public String getAdvisorName(){
        return advisorName;
    }
    public double cgpaCalculation(){
        cgpa=(OOP+java+database)/3;
        return cgpa;
    }
    public double getPayableAmount(){
        return payble;
    }
    public double getPaidAmount(){
        return paid;
    }
    public int getAbsentDays(){
        return absentDays;
    }
    
}
