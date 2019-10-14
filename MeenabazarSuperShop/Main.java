package meenabazarsupershop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);  
        double totalPurchase, tax;
        Customer C=new Customer();
        Product P=new Product();
        Salespeople S=new Salespeople();
        System.out.println("Store Customer information:");
        C.setAll();
        C.setCustomerType();
        System.out.println("Store Sales Person information:");
        S.setAll();
        System.out.println("Store Product Information:");
        P.setProductInfo();
        System.out.println("****Purchase Product*****");
        System.out.println("Enter productID:");
        String pID=input.nextLine();
        System.out.println("Enter Quantity:");
        int q=input.nextInt();
        if(pID.equalsIgnoreCase(P.getProductID())){
            P.isProductAvailable(q);
            totalPurchase=(P.getPrice()*q)-(P.getPrice()*C.calculateDiscount(C.getCustomerType()));
            tax=(P.getPrice()*q)-(P.getPrice()*S.calculateTax(q));
            System.out.println("****PRINT ALL INFORMATION****");
            C.printAll();
            P.printAllProduct();
            System.out.println("Total purchase with discount:"+totalPurchase);
            System.out.println("Price with Tax:"+tax);
        }
        
    }   
}
