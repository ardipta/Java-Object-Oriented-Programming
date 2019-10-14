package hospitalbillcalculation;
public class Patient extends Person implements PatientInterface{

    protected String contractNo;
    protected double totalBill,
                     discount=0.0;
        protected Patient(){
            super();
        }
    @Override
    public void inputAllPatientInfo() {
        System.out.println("Enter Contract No:");
        contractNo=input.nextLine();
        
    }    
    void calculateTotalBillWithDiscount(double dcFee, double cbCost, double tbDignostic) {
        if(tbDignostic>2000){
            discount=0.10;
            totalBill=(dcFee+cbCost+tbDignostic)-(totalBill*discount);
            System.out.println("Total bill for Patient with discount:"+totalBill);
        }
    }   
    @Override
    public void printAllPatientInfo() {
        System.out.println("Contract No of patient:"+contractNo);
        
    }
    
}
