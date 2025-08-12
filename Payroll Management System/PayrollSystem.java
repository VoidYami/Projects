import java.util.List;
import java.util.ArrayList;

abstract class Employee{
    private String name;

    private int id;

    public Employee(String name , int id){
        this.name = name;
        this.id =id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
  
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

    class FullTimeEmployee extends Employee{
        private double monthlySalary;

        public FullTimeEmployee(String name, int id, double monthlySalary) {
            super(name, id);
            this.monthlySalary = monthlySalary;
        }

        @Override
        public double calculateSalary() {
            return monthlySalary;
        }

        @Override
        public String toString() {
            return "FullTimeEmployee{" +
                    "name='" + getname() + '\'' +
                    ", id=" + getid() +
                    ", monthlySalary=" + monthlySalary +
                    '}';
        }
        
    }

    class PartTimeEmployee extends Employee {
        private double hourlyWage;
        private int hoursWorked;

        public PartTimeEmployee(String name, int id, double hourlyWage, int hoursWorked) {
            super(name, id);
            this.hourlyWage = hourlyWage;
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hourlyWage * hoursWorked;
        }

        @Override
        public String toString() {
            return "PartTimeEmployee{" +
                    "name='" + getname() + '\'' +
                    ", id=" + getid() +
                    ", hourlyWage=" + hourlyWage +
                    ", hoursWorked=" + hoursWorked +
                    '}';
        }
    }

class PayrollManager {
    List<Employee> employees;

    public PayrollManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(int id) {
        employees.removeIf(employee -> employee.getid() == id);
    }
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

public class PayrollSystem {
    public static void main(String[] args) throws Exception {
        PayrollManager payrollSystem = new PayrollManager();

        FullTimeEmployee emp1 = new FullTimeEmployee("dark", 1, 50000);
        PartTimeEmployee emp2 = new PartTimeEmployee("priyanshi", 2, 20, 25);
        

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        

        System.out.println("All Employees:");
        payrollSystem.displayEmployees();

        // Display salaries
        System.out.println("\nEmployee Salaries:");
        for (Employee emp : payrollSystem.employees) {
            System.out.println(emp.getname() + " (ID: " + emp.getid() + ") Salary: " + emp.calculateSalary());
        }

        // Remove an employee
        System.out.println("\nRemoving employee with ID 1...");
        payrollSystem.removeEmployee(1);
        payrollSystem.displayEmployees();

        // Search for employee by ID
        int searchId = 2;
        System.out.println("\nSearching for employee with ID " + searchId + ":");
        for (Employee emp : payrollSystem.employees) {
            if (emp.getid() == searchId) {
                System.out.println(emp);
            }
        }
    }
}


