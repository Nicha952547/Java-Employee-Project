public class PartTimeEmployee extends Employee {
    int hoursWorked;
    int hourlyRate;

    PartTimeEmployee(String name, int baseSalary, int hoursWorked, int hourlyRate){
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
