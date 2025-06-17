import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in); //input from user 
        System.out.print("Enter exponent:"); //to print output
        int expn = en.nextInt(); //addressing 
        System.out.print("Enter base:");
        int base = en.nextInt();
    
    System.out.println(Math.pow(base,expn));
    }
}    
//this is by math class
