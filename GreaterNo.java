import java.util.*;

public class GreaterNo {
    public static void greatest(int a,int b){
        int greater;
        if(a>b)
        System.out.println("A is greater");
        else
        System.out.println("B is greater");
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a , b;
    System.out.print("Enter a  : ");
     a = sc.nextInt();
    System.out.print("Enter b : ");
    b = sc.nextInt();
    greatest(a, b);

    }
}
