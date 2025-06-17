import java.util.*;
public class Average {
    public static float avg(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a , b , c : ");
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        System.out.println("Average : "+avg(a,b,c));
    }
}