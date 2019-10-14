package hospitalbillcalculation;

import java.util.Scanner;

public class Diagnostic implements DiagnosticsInterface{

    protected String testTitle;
    protected double costOfEachTest,
                     numberOfTest,
                     diagnosticBill;
                     
    protected Scanner input;
        protected Diagnostic(){
            input=new Scanner(System.in);
        }
    @Override
    public void inputAllDiagnosticInfo() {
        System.out.println("Enter test title:");
        testTitle=input.nextLine();
        System.out.println("Enter number of test tested by patient:");
        numberOfTest=input.nextDouble();       
        System.out.println("Enter cost of each test:");
        costOfEachTest=input.nextDouble();
        
    }
    
    public double calculateBillForDiagnostic(){
        diagnosticBill=numberOfTest*costOfEachTest;
        System.out.println("Total bill in diagnostics center:"+diagnosticBill);
        return diagnosticBill;
    }

    @Override
    public void printAllDiagnosticInfo() {
        System.out.println("Test Title:"+testTitle);
        System.out.println("Number of test tested by patient:"+numberOfTest);
        System.out.println("Cost of each test:"+costOfEachTest);
        
    }
    
}
