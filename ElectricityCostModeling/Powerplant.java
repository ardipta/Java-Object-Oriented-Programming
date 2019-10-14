package electricitycostmodeling;
import java.util.Scanner;
public class Powerplant implements PowerplantInterface{

    private String plantName, plantLocation;
    private double powerCapacity, productionCost, priceOfOneKw, profit;
    private int numberOfConsumer;
    public Scanner input;
    public Powerplant(){
        input=new Scanner(System.in);
    }
    
    @Override
    public void inputAllPowerPlantInfo() {
        System.out.println("Enter power plant name:");
        plantName=input.nextLine();
        System.out.println("Enter power plant location:");
        plantLocation=input.nextLine();
        System.out.println("Enter total power capacity in MW:");
        powerCapacity=input.nextDouble();
        System.out.println("Enter Production cost per MW:");
        productionCost=input.nextDouble();
        System.out.println("Enter price of one KW:");
        priceOfOneKw=input.nextDouble();
        System.out.println("Enter number of consumer:");
        numberOfConsumer=input.nextInt();
    }

    @Override
    public double getPriceOfOneKW() {
        return priceOfOneKw;
    }

    @Override
    public void printAllPowerPlantInfo() {
        System.out.println("Power plant name:"+plantName);
        System.out.println("Power plant location:"+plantLocation);
        System.out.println("Power capacity in MW:"+powerCapacity);
        System.out.println("Production cost per MW:"+productionCost);
        System.out.println("Price of one KW:"+priceOfOneKw);
        System.out.println("Number of consumer:"+numberOfConsumer);
    }
    public String getPlantlocation(){
        return plantLocation;
    }
    public String getPlantName(){
        return plantName;
    }
    public void calculateProfit(double ebill){
        profit=(powerCapacity*productionCost)-ebill*0.001;
        System.out.println("Profit:"+profit);
    }
    
    
}
