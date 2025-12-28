import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner employee = new Scanner(System.in);
        System.out.print("Enter type employee (FullTime or PartTime): ");
        String em1 = employee.nextLine();
        String full = "Full";
        System.out.print("Enter your name : ");
        String name = employee.nextLine();
        System.out.print("Enter your salary : ");
        int salary = employee.nextInt();
        System.out.print("Enter your bonus : ");
        int bonus = employee.nextInt();
        System.out.print("Enter your hoursWorked : ");
        int hoursWorked = employee.nextInt();
        System.out.print("Enter your hourlyRate : ");
        int hourlyRate = employee.nextInt();

        if(em1.contains(full)){
            Employee em = new FullTimeEmployee(name, salary, bonus);
            em.calculateSalary();
            em.Details();
        }
        else{
            Employee em = new PartTimeEmployee(name, salary, hoursWorked, hourlyRate);
            System.out.print(em.calculateSalary());
            em.Details();
        }
    }
}
