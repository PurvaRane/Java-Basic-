import java.util.*;

public class Printnos {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter 1 to print Sum\nEnter 2 to print Multiplication Table : ");
        int option = sc.nextInt();
        switch(option){
        case 1 : 
            int sum=0;
            for(int i = 1;i<=n;i++){
            sum+=i;
            }
            System.out.print("Sum : "+sum);
        break;
        case 2 : 
        int j = 1;
            do{
                System.out.println(n + " * " + j + " = " + n*j);
                j++;
            }while(j<=10);
        break;
        default : 
            System.out.println("Invalid ");
        }
        
    }
}
