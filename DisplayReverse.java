import java.util.Scanner;

public class DisplayReverse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int no = sc.nextInt();
    DigitSeparation digitSeparation = new DigitSeparation(no);
    digitSeparation.printNum();
    }
}
class DigitSeparation{
    int no;
    DigitSeparation(int no){
        this.no = no;

    }
    public void printNum(){
        int remainder;
        int sum = 0;
        int reverseNum = 0;
        double armstr=0;

   int i = 0;
   int temp = no;
   while(temp!=0){
   temp/=10;
   i++;
   }

        while(no!=0){
    
            remainder = no%10;
             armstr = armstr +  Math.pow(remainder, i);
             no /= 10;
            sum+=remainder;
           reverseNum = (reverseNum*10)+remainder;
        }

       System.out.println("\nSum is " +sum);
       System.out.println("Reverse number : "+ reverseNum);
       System.out.println("Number of digits :  "+i);
    
       System.out.println("Armstrong calculation value  : "+armstr);
    
       if(no == reverseNum){
        System.out.println("It's a Palindrome Number ");
       }
       else{
        System.out.println("It's not a palindrome Number ");
       }

    }
}
