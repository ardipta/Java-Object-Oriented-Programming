package meenabazarsupershop;
public class Salespeople extends Person{
        private final double tax=0.02;
        double Purchase;
    public Salespeople(){
        super();
    }
    public double calculateTax(int quantity){
        Purchase=tax*quantity;
        return Purchase;
    }
}
