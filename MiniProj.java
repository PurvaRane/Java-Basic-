import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;

    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [Name  = " + name + " , ID = " + id + " , Salary = " + calculateSalary() + "]";
    }
}

class FulltimeEmployee extends Employee {
    private double monthlySalary;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hourWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hourWorked, int hourlyRate) {
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hourWorked;

    }
}

class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee empToRemove = null;
        for(Employee employee:employeeList) {
            if(employee.getId() == id) {
                empToRemove = employee;
                break;
            }
        }
            if (empToRemove != null) {
                employeeList.remove(empToRemove);
        }
        
    }

    public void displayEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class MiniProj {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        FulltimeEmployee emp1 = new FulltimeEmployee("Swara", 1, 10000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Purva", 2, 14, 5000);
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details : ");
        payRollSystem.displayEmployee();
        payRollSystem.removeEmployee(1);
        System.out.println("Remaining Employee Details");
        payRollSystem.displayEmployee();

    }
}
