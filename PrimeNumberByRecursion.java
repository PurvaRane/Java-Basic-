import java.util.Scanner;
public class PrimeNumberByRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        CheckPrime checkPrime = new CheckPrime(n);
        boolean value = checkPrime.primeNum(n, 2);
        if(value==true){
            System.out.println("It's a prime number");
        }
        else{
            System.out.println("It's not a prime number ");
        }

    }

}
class CheckPrime {
int n;
CheckPrime(int n){
    this.n = n;

}

    public boolean primeNum(int n,int i){
        if(n<=2){
            return (n==2)?true:false;

        }
        if(n%i==0){
            return false;

        }
        if(i*i>n){
            return true;

        }
        return primeNum(n, ++i);

    }
}

   
