import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
    int n = sc.nextInt();
        int result = recursiveMethod(n);
; System.out.println("Factorial of " +n + " : " + result);
    }
    public static int recursiveMethod(int n) {
        if(n==0){
            return 1;
        }
            return n*recursiveMethod(n-1);
        
    }
}
//program for factorials