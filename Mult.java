import java.util.Scanner;

class Mult
{
    public static void main(String[] args) {
    Scanner myNum =new Scanner(System.in);
    System.out.print("Enter number:");
    int n = myNum.nextInt();

        for(int i = 1;i<=10;i++){
            int product = i*n;
            System.out.println( n + " * " +  i + " = " + product );
    }
}
}
