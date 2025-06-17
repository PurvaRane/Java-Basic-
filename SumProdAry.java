import java.util.Scanner;
//to find sum and product of all elements in an array 

class SumProdAry{
    public static void main(String args[]){
        int n ,sum = 0,product = 1;
        System.out.print("Enter Size of Array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i = 0;i<n;i++)
        a[i] = sc.nextInt();
        for(int i = 0 ; i<n;i++){
            sum = sum+a[i];
            product = product*a[i];

        }
        System.out.println("Sum : "+sum);
        System.out.println("Product : "+product);
    }
}