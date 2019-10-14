package classtest2;

public class Salesperson {

    String name;
    String ID;
    double salary;
    double bonus=0.0;
    double daysalary;

public void Initialvalue(String n, String i, double s, double d){

    name=n;
    ID=i;
    salary=s;
    daysalary=d;
}

public void monthlySalary(double dailysalary){
    salary=dailysalary*30;
   
}

public void bonus(int productSell){
    int monthlysalary = productSell*30;
    if(monthlysalary>100){
        bonus = 500;
    }
    
}
public void display(){
    System.out.println("Salesperson Name:"+name);
    System.out.println("Salesperson ID:"+ID);
    System.out.println("Salesperson Monthly Salary:"+salary);
    System.out.println("Salesperson Bonus:"+bonus);
    
    
}
}
