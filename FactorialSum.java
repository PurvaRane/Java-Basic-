import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in) ;
System.out.print("Enter n : ");
int n = sc.nextInt();
Fact f = new Fact(n);
f.factOfNum();
Sum s = new Sum(n);
s.sumOfNum();
    }
}
class Sum{
    int i ;
    int sum = 0,n;
    Sum(int n ){
        this.n = n;
    }
 public void sumOfNum(){
 for(i=0;i<=n;i++){
    sum+=i;
 }
 System.out.println("Sum : "+sum);
 }
}
class Fact{
    int i , fact = 1 , n ;
    Fact(int n ){
        this.n = n;

    }
    public void factOfNum(){
        for(i=1;i<=n;i++){
            fact*=i;

        }
        System.out.println("Factorial : "+fact);
    }
}
