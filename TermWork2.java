import java.util.Scanner;

class Bank 
{
    double balance;
    public double getBalance()
    {
        return 0;
    }
}
class SBI extends Bank
{
    SBI (double amount)
    {
        balance = amount;
    }
    public double  getBalance()
    {
        return balance;
    }
}
class PNB extends Bank
{
    PNB(double amount)
    {
        balance = amount;
    }
    public double getBalance()
    {
        return balance;
    }
}
class HDFC extends Bank
{
    HDFC (double amount)
    {
        balance = amount;
    }
    public double getBalance()
    {
        return balance;
    }
}
public class TermWork2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program demonstrate method overriding, a form of run-time Polymorphismin java");
        System.out.println("Enter the amount you want to deposite in SBI : ");
        double sbi1 = sc.nextDouble();
        System.out.println("Enter the amount you want to deposite in PNB : ");
        double pnb1 = sc.nextDouble();
        System.out.println("Enter the amount you want to deposite in HDFC : ");
        double hdfc1 = sc.nextDouble();
        SBI s1=new SBI(sbi1);
        PNB p1=new PNB(pnb1);
        HDFC h1=new HDFC(hdfc1); 
        System.out.println(" The ammount deposite in SBI is : " + s1.getBalance());
        System.out.println(" The amount deposited in PND is :" + p1.getBalance());
        System.out.println(" The amount deposited in HDFC is :" +h1.getBalance());
    }
}
