import java.util.*;

public class SumOfOdd {
    public static int sum(int n){
        int sumOfNum=0;
       for(int i = 1;i<=n;i++){
        if(i%2!=0){
            sumOfNum+=i;       
         }
       }
        return sumOfNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Sum of Odd numbers till n : "+sum(n));

    }
}
