public abstract class Employee {
    String name;
    int baseSalary;

    Employee(String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
    void Details(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+baseSalary);
    }
}
