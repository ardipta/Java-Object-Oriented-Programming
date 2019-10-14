package hospitalbillcalculation;
public class Doctor extends Person implements DoctorInterface{

    protected String department,
                     degree;
    protected double doctorsFee,
                     cabinCost;
           protected Doctor(){
               super();
           }

    @Override
    public void inputAllDoctorInfo() {
        System.out.println("Enter department name:");
        department=input.nextLine();
        System.out.println("Enter degree name:");
        degree=input.nextLine();
        System.out.println("Enter doctor fee:");
        doctorsFee=input.nextDouble();
        System.out.println("Enter cabin cost:");
        cabinCost=input.nextDouble();
        
    }
    public double getDoctorFee(){
        return doctorsFee;
    }
    
    public double getCabinCost(){
        return cabinCost;
    }

    @Override
    public void printAllDoctorInfo() {
        System.out.println("Dept. name of doctor:"+department);
        System.out.println("Degree of doctor:"+degree);
        System.out.println("Fee of doctor:"+doctorsFee);
//        System.out.println("Cabin cost of hospital:"+cabinCost);
    }
    
    
}
