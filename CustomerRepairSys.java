import java.util.Scanner;
import java.time.LocalDate;

abstract class Customer {
    protected String name;
    protected String customerId;
    protected String problemDescription;
    protected String peripheralType;
    protected LocalDate dateIn;
    protected LocalDate dateOut;

    public Customer(String name, String customerId, String problemDescription, String peripheralType, LocalDate dateIn, LocalDate dateOut) {
        this.name = name;
        this.customerId = customerId;
        this.problemDescription = problemDescription;
        this.peripheralType = peripheralType;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public abstract String getCustomerType(); // Abstract method to get customer type

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public String getPeripheralType() {
        return peripheralType;
    }

    public LocalDate getDateIn() {
        return dateIn;
    }

    public LocalDate getDateOut() {
        return dateOut;
    }
    
    public abstract double calculateRepairCost(); // Abstract method to calculate repair cost
}

class IndividualCustomer extends Customer {
    private static final double FIXED_COST = 500.00; // Fixed cost for individual customers

    public IndividualCustomer(String name, String customerId, String problemDescription, String peripheralType, LocalDate dateIn, LocalDate dateOut) {
        super(name, customerId, problemDescription, peripheralType, dateIn, dateOut);
    }

    @Override
    public String getCustomerType() {
        return "Individual";
    }

    @Override
    public double calculateRepairCost() {
        return FIXED_COST; // Fixed cost for repair
    }
}




public class CustomerRepairSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Customer[] customers = new Customer[n];
        //Enter info
       
            System.out.print("Enter Name : ");
            String s = sc.nextLine();
            System.out.print("Enter CustomerID : ");
            String cusID = sc.nextLine();
            System.out.print("Problem : ");
            String prb = sc.nextLine();
            System.out.print("Peripheral : ");
            String peri = sc.nextLine();
            System.out.print("Enter date in (yyyy-mm-dd):");
            LocalDate dateIn = LocalDate.parse(sc.nextLine().trim());
            System.out.print("Enter date out (yyyy-mm-dd):");
            LocalDate dateOut = LocalDate.parse(sc.nextLine().trim());
            customers[0] = new IndividualCustomer(s,cusID,prb,peri,dateIn,dateOut);
        
System.out.println("Display Data of Costumer : ");
        for (Customer cust : customers) {
            System.out.println("Customer Name: " + cust.getName());
            System.out.println("Customer ID: " + cust.getCustomerId());
            System.out.println("Customer Type: " + cust.getCustomerType());
            System.out.println("Problem Description: " + cust.getProblemDescription());
            System.out.println("Peripheral Type: " + cust.getPeripheralType());
            System.out.println("Date In: " + cust.getDateIn());
            System.out.println("Date Out: " + cust.getDateOut());
            System.out.println("Repair Cost: " + cust.calculateRepairCost());
            System.out.println();
        }
    }
}
