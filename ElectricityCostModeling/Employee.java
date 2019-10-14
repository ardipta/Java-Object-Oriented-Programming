package electricitycostmodeling;
public class Employee extends Person implements EmployeeInterface{

    String plantName;
    double totalCollectedBill;
    public Employee(){
        super();
    }
    @Override
    public void inputAllEmployeeInfo() {
        System.out.println("Enter Plant name where he/she work:");
        plantName=input.nextLine();      
    }

    
    public double calculateTotalElectricityBill(double tb){
        if(tb>0){
            totalCollectedBill=tb;
            System.out.println("Total collected bill:"+totalCollectedBill);
            return totalCollectedBill;
        }
        else
            return 0.0;
        
    }
    @Override
    public void printAllEmployeeInfo() {
        System.out.println("Plant name where he/she work:"+plantName);
        
    
}
}
