package companyabc;
public class ProjectManager extends Person{
    private double salary;
    public ProjectManager(){
        super();
    }
    public void setSalary(){
        System.out.println("Enter Salary:");
        salary=input.nextDouble();
    }
    public double getSalary(){
        return salary;
    }
    public void displaySalary(){
        System.out.println("Salary:"+salary);
    }
}
