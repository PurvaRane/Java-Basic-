import java.util.Scanner;
public class ArrayList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int a[]=new int[n];
   
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                sum = sum+a[i];

            }
        }
        System.out.println("Sum : "+sum );


    }
}
