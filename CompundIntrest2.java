import java.util.Scanner;
public class CompundIntrest2 {
    public static void main(String[] args) {
        Scanner ci = new Scanner(System.in);
        System.out.print("Enter Principal:");
        double principal = ci.nextDouble();
        System.out.print("Enter Rate:");
        double ratein = ci.nextDouble();
        double rate = ratein/100;
        System.out.print("Enter no of years:");
        double n = ci.nextDouble();

        System.out.print("Enter t:");        
        double t = ci.nextDouble();
        
        Intrest intrest = new Intrest(principal, rate, n, t);
        double compundIntrest =  intrest.getCompoundIntrest();
        double intrest1 = compundIntrest - principal;
        System.out.println("Compund Intrest : " + compundIntrest);
        System.out.println(" Intrest : "+ intrest1);
    }
}
class Intrest{
    double principal;
    double rate,ratein,n,t;
    Intrest(double principal,double rate,double n,double t){
  this.principal = principal;
  this.rate = rate;                   // constructor
  this.n = n;
  this.t = t;
    }

  public double getCompoundIntrest(){
    double base = 1 + ((rate/100)/n);              //method
        double expn = n*t ;
        double compund_Intrest = principal * (Math.pow(base,expn));
       
        return compund_Intrest;
    }
  }
// double intrest = compund_Intrest - principal ;


