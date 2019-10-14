
package classtest2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Salesperson obj = new Salesperson();
         System.out.println("Input Name:");
         String name=input.nextLine();
         System.out.println("Input ID:");
         String ID = input.nextLine();
         obj.Initialvalue(name, ID, 0, 0);
         obj.monthlySalary(300);
         obj.bonus(200);
         obj.display();

    }
}
