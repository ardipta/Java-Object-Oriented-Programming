package electricitycostmodeling;
public class Consumer extends Person implements ConsumerInterface{
    private String plantName, location, consumerType;
    private double usedPowerUnit, totalBill, serviceCharge, discount;
    private static final double tax=0.04;
    public Consumer(){
        super();
    }

    @Override
    public void inputAllConsumerInfo() {
        System.out.println("Enter Consumer Type (for monthly consumer=mc for yearly consumer=yc):");
        consumerType=input.nextLine();
        System.out.println("Enter Location:");
        location=input.nextLine();
        System.out.println("Enter monthly used power unit(KW)");
        usedPowerUnit=input.nextDouble();
    }

    @Override
    public String getConsumerType() {
        return consumerType;
    }

   
    public void calculateServiceCharge(){
        if(consumerType.equalsIgnoreCase("mc")){
            serviceCharge=0.03;
            System.out.println("Service Charge for Monthly Consumer:"+serviceCharge);
        }
        else if(consumerType.equalsIgnoreCase("yc")){
            serviceCharge=0.02;
            System.out.println("Service Charge for yearly Consumer:"+serviceCharge);
        }
    }
    
    public double claculateDiscount(){
        
       if(usedPowerUnit>100){
           discount=0.02;
           return discount;
       }
       else
           return 0.0;
    }
    public double calculateTotalBillWithTax(double price){
        totalBill=((price*usedPowerUnit)+(price*usedPowerUnit)*tax)+claculateDiscount();
        System.out.println("Total bill:"+totalBill);
        return totalBill;
    }
    public void assumeplantName(String loc, String pName){
        
        if(location.equals(loc)){
            plantName=pName;
            System.out.println("Successfully assumed powerplant name by powerplant location:");
        }
        else
            System.out.println("Didn't matched powerplant location.");
    }
    @Override
    public void printAllConsumerInfo() {
        System.out.println("Power Plant Name:"+plantName);
        System.out.println("Consumer Type"+consumerType);
        System.out.println("Enter Location:"+location);
        System.out.println("Monthly used power unit(KW):"+usedPowerUnit);
    }
    
}
