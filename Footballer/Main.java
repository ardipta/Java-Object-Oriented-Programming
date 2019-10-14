package footballer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input= new Scanner (System.in);
         
         System.out.println("Input Player Name:");
         Information no1 = new Information();
         String name=input.nextLine();
         System.out.println("Input Age:");
         String age=input.nextLine();
         System.out.println("Input Country:");
         String country=input.nextLine();
         no1.initialValue(name, age, country, 300, 12, 50);
         no1.numberOfGoals(20);
         no1.numberOfMatches(50);
         no1.numberOfOffsides(11);
         no1.display();
         
    }
    
}
