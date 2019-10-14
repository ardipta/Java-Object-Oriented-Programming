package hospitalbillcalculation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of Doctor:");
        int noOfDoc=input.nextInt();
        Doctor doc[]=new Doctor[noOfDoc];
        System.out.println("******Enter doctor Information******");
            for (int i = 0; i < noOfDoc; i++) {
                doc[i]=new Doctor();
                doc[i].setAll();
                doc[i].inputAllDoctorInfo();
            }
        System.out.println("Enter number of diagnostic Center:");
        int noOfdiag=input.nextInt();
        Diagnostic dc[]=new Diagnostic[noOfdiag];
        System.out.println("****Enter Diagnostics center information****");
            for (int i = 0; i < noOfdiag; i++) {
                dc[i]=new Diagnostic();
                dc[i].inputAllDiagnosticInfo();
            }
        System.out.println("Enter number of patient:");
        int pat=input.nextInt();
        Patient pa[]=new Patient[pat];
        System.out.println("******Enter patient information******");
            for (int i = 0; i < pat; i++) {
                pa[i]=new Patient();
                pa[i].setAll();
                pa[i].inputAllPatientInfo();
            }
        
        System.out.println("$$$$$$$$$$$$$$$ Print all Information $$$$$$$$$$$$$$$$");
        for (int i = 0; i < pat; i++) {
            for (int j = 0; j < noOfDoc; j++) {
                for (int k = 0; k < noOfdiag; k++) {
                      doc[j].printAllDoctorInfo();
                      dc[k].printAllDiagnosticInfo();
                      pa[i].printAllPatientInfo();                     
                      pa[i].calculateTotalBillWithDiscount(doc[j].getDoctorFee(), 
                                                     doc[j].getCabinCost(), 
                                                     dc[k].calculateBillForDiagnostic());
                }
              
            }
        }
        
    }
    
}
