public class FullTimeEmployee extends Employee {
    int bonus;

    FullTimeEmployee(String name, int baseSalary, int bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return super.baseSalary += bonus;
    }
}
