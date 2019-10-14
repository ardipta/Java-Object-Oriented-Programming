package meenabazarsupershop;
import java.util.Scanner;
public class Product {
    private String productID, name;
    private double price;
    public int numberOfProduct;
    public Scanner input;
        public Product(){
            input=new Scanner(System.in);
    }
    public void setProductInfo(){
        System.out.println("Enter Product ID:");
        productID=input.nextLine();
        System.out.println("Enter Product Name:");
        name=input.nextLine();
        System.out.println("Enter Product Price:");
        price=input.nextDouble();
        System.out.println("Enter Number of product:");
        numberOfProduct=input.nextInt();
    }
    public String getProductID(){
        return productID;
    }
    public int getProductNo(){
        return numberOfProduct;
    }
    public double getPrice(){
        return price;
    }
    public boolean isProductAvailable(int p){
        if(numberOfProduct>=p){
            return true;
        }
        else{
            System.out.println("Product not available...");
            return false;
        }
    }
    public void printAllProduct(){
        System.out.println("Product ID:"+productID);
        System.out.println("Product Name:"+name);
        System.out.println("Product Price:"+price);
        
    }
    
}
