import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = num.nextInt(); // input of the number of rows

        for(int i = n;i>=1;i--) //outer loop
        //this outer loop begins form n that is the number of rows and ends at 1 by decrementing 
        {
            for(int j = 1;j<=n;j++) //inner loop
            //this inner loop starts form 1 till n for printing * and integers in the sqaure format 
            {
                if(j>i){
                    //here if j will be grater than i then * will be printed 
                    System.out.print("*"); //stars will be printed in right angled format in increasing order 
                }
                else{
                    //here the numbers will be printed as the vacant places has been given the else condition 
                    System.out.print(j); //spaces will be covered by the numbers in decreasing order 
                }
            }
            System.out.println();
        }
    }
}
