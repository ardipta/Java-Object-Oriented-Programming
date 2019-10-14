package mentormanagementsystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Advisor ad=new Advisor();
        Student st=new Student();
        System.out.println("Enter Advisor Information:");
        ad.inputAllAdvisorInfo();
        ad.inputAll();
        
        System.out.println("Enter Students Information:");
        st.inputAll();
        st.inputAllStudentInfo();
        System.out.println("Add Student:");
        ad.AddStudent(st.getAdvisorName());
        System.out.println("Show Due of the Students:");
        ad.ShowDue(st.getPayableAmount(), st.getPaidAmount());
        System.out.println("Show Low cgpa:");
        ad.ShowLowCgpaIds(st.cgpaCalculation(), st.getID());
        System.out.println("Show absent Days:");
        ad.ShowAbsentNames(st.getAbsentDays(), st.getName());
    }    
}
