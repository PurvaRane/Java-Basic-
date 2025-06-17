import java.util.Scanner;
public class MaxMinArray {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        System.out.println("Length of array : "+args.length);
        for(int i = 0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
    }
}
