import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height  : ");
        int height = sc.nextInt();
        int m = 1; // m is used for increment 
        int i,j,k; //h is the height , j and i are used for iteration 
        
        int space = height -1; //space is given the value height - 1 as we want to print a pyramid 
        //which will have last last with all columns occupied 
        for(i=0;i<height ;i++){ //outer loop1
        // in the outer loop i starts form 0 till the height 
            for(j=space;j>i;j--){ //inner loop2
            //in the first inner loop j is given the value of space to print the spaces 
                System.out.print(" "); 
            }
            for(k=0;k<m;k++){ //inner loop3
                //in the final loop k starts from 0 till m and prints the alphabets in ascending order 
                //as the height will increase the alphabets will be printed in the pyramid format 
    
                System.out.print((char)(i+65));//char data type used for printing characters 
                //i + 65 is the ascii value which gets increased as the loop gets executed
            }
            m+=2; //m = m + 2 : m gets added to 2 and the increased value again enters the loop 
            System.out.print("\n");
        }

    }
}
