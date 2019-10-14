package electricitycostmodeling;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("*** Enter the number of Power Plant ***");
        int pl = input.nextInt();
        Powerplant P[] = new Powerplant[pl];
        for (int i = 0; i < pl; i++) {
            System.out.println("$$$ Input Power plant Information $$$");
            P[i] = new Powerplant();
            P[i].inputAllPowerPlantInfo();
        }
        System.out.println("*** Enter the number of Consumer you want to store ***");
        int Co = input.nextInt();
        Consumer C[] = new Consumer[Co];
        for (int i = 0; i < Co; i++) {
            for(int j=0; j<pl; j++){
                System.out.println("$$$ Input Consumer Information $$$");
                C[i] = new Consumer();
                C[i].inputAll();
                C[i].inputAllConsumerInfo();
                C[i].assumeplantName(P[j].getPlantlocation(), P[j].getPlantName());
                
            }
        }
        System.out.println("*** Enter the number of Employee ***");
        int Em = input.nextInt();
        Employee E[] = new Employee[Em];
        for (int i = 0; i < Em; i++) {
            System.out.println("$$$ Input Employee Information $$$");
            E[i] = new Employee();
            E[i].inputAll();
            E[i].inputAllEmployeeInfo();
           
        }
        System.out.println("======== Print All info =========");
        for(int i=0; i<Co; i++){
            for(int j=0; j<pl; j++){
                for(int k=0; k<Em; k++){
                C[i].printAllConsumerInfo();
                C[i].calculateServiceCharge();
                C[i].claculateDiscount();
                C[i].calculateTotalBillWithTax(P[j].getPriceOfOneKW());
                P[i].printAllPowerPlantInfo();
                P[j].calculateProfit(E[k].calculateTotalElectricityBill(P[j].getPriceOfOneKW()));
                E[k].printAllEmployeeInfo();
                E[k].calculateTotalElectricityBill(C[i].calculateTotalBillWithTax(P[j].getPriceOfOneKW()));
                
                
                }
                
            }
        }
    }
    
}
