import java.util.*;

public class LargestWithoutIf{
    public static void main(String[] args) {
        int a , b , c ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
        System.out.print("Enter c : ");
        c = sc.nextInt();
        int largest = ((a>b&&a>c)?a:(b>c&&b>a?b:c));
        System.out.print("Largest Num : "+largest);
    }
}