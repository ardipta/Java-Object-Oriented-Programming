package companyabc;
public class Employee extends Person{
    private int workingHour;
    public Employee(){
        super();
    }
    public void setWorkingHour(){
        System.out.println("Enter working hour:");
        workingHour=input.nextInt();
    }
    public void displayWorkingHour(){
        System.out.println("Working Hour:"+workingHour);
    }
}
