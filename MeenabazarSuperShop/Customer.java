package meenabazarsupershop;
public class Customer extends Person{
    private String customerType;
    private double discount;
    public Customer(){
        super();
    }
    public void setCustomerType(){
        System.out.println("Enter customer Type for Regular Customer(RC) and Member Customer(MC):");
        customerType=input.nextLine();
    }
    public String getCustomerType(){
        return customerType;
    }
    public double calculateDiscount(String CType){
        if(customerType.equalsIgnoreCase("MC")){
            discount=0.05;
            return discount;
        }
        else{
            return 0.0;
        }
    }
    
}
