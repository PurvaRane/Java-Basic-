 import java.util.*;
 class Customer{
    private String name;
    private int srNo;
    public Customer(int srNo,String name){
        this.name = name;
        this.srNo = srNo;
    }
    public String getName() {
        return name;
    }

    public int getSrNo() {
        return srNo;

    }
    public void printName(){
        System.out.println("Sr no : "+srNo);
        System.out.println("Name : "+name);
    }
}
class SolutionFor{
   
    String addPeripheral;
    public void addPeripheralto(String add){
    this.addPeripheral=add;
   }
   String addProblem;
    public void addProblemto(String add1){
    this.addProblem=add1;
   }
   public void printProPeri(){
    System.out.println("Peripheral : "+addPeripheral);
    System.out.println("Problem : "+addProblem);
   }
}
class DateInOut extends SolutionFor{
   private String inDate ,outDate;
    public void inDateto(String in){
        this.inDate = in;
    }
    public void outDateto(String out){
        this.outDate = out;
    }
    public void printInDate(){
        System.out.println("In Date : "+inDate);
    }
    public void printOutDate(){
        System.out.println("Out Date : "+outDate);
    }
}
class Cost extends SolutionFor{
    private ArrayList<Customer> customerList;

    public Cost() {
        customerList = new ArrayList<>();
    }

    public void addEmployee(Customer customer) {
        customerList.add(customer);
    }

    public void removeCustomer(int srNo) {
        Customer cusToRemove = null;
        for(Customer customer:customerList) {
            if(customer.getSrNo() == srNo) {
                cusToRemove = customer;
                break;
            }
        }
            if (cusToRemove != null) {
                customerList.remove(cusToRemove);
        }
        
    }

}
public class MyProj {
    //add customer - sr no , name , peripheral , problem , in date , problem solved , outdate , cost , paid/unpaid
    //remove customer - sr no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cost cus1 = new Cost();
        DateInOut d1 = new DateInOut();
        System.out.print("Enter Name : ");
        String n = sc.nextLine();
        System.out.print("Enter Sr No: ");
        int sr = sc.nextInt();
        Customer c1 = new Customer(sr,n);
        System.out.print("Enter Peripheral : ");
        String p = sc.nextLine();
        cus1.addPeripheralto(p);
       
        System.out.print("Enter the in date : ");
        String d = sc.nextLine();
        d1.inDateto(d);
        System.out.print("Enter Problem : ");
        String pr = sc.nextLine();
        cus1.addProblemto(pr);
        c1.printName();
        cus1.printProPeri();
        d1.printInDate();




    }

}
