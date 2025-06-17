import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int i , size;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of Array");
        size = r.nextInt();
        int a[]=new int[size];
        System.out.println("Enter Elements in Array");
        for(i = 0;i<size;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Printed array elements : ");
        for(i = 0;i<size;i++){
            System.out.println(a[i]);
        }
    }
}