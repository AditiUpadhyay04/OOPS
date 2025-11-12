abstract class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }
    double calculateSalary() {
        return baseSalary + 5000; // fixed bonus
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    PartTimeEmployee(String name, double baseSalary, int hoursWorked) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
    }
    double calculateSalary() {
        return baseSalary + hoursWorked * 200;
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ravi", 20000);
        Employee e2 = new PartTimeEmployee("Neha", 10000, 10);
        System.out.println(e1.name + " Salary: ₹" + e1.calculateSalary());
        System.out.println(e2.name + " Salary: ₹" + e2.calculateSalary());
    }
}

