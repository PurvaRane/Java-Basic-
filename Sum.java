import java.util.Scanner;
public class Sum{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in); //creating a object of the scanner
        System.out.print("Enter A : ");
        int a = num.nextInt();
        System.out.print("Enter B : ");
        int b = num.nextInt();
        int sum = a+b;
        System.out.println("Sum : "+sum);

    }
}