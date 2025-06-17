import java.util.Scanner;
class CheckPalin{
    void calculate(){
        int num,n,digit,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        num = sc.nextInt();
         n = num;
    do{
        digit = num%10; //1 //2
        rev = (rev*10)+digit;//1 //12
        num /=10;//12
    
    }while(num!=0);
    if(rev==n){
       System.out.println("The number enterred is Palindrome ! ");
    }
    else{
        System.out.println("The number enterred is not Palindrome ! ");
    
    }
    }
   
}
public class Palimdrome {
    public static void main(String[] args) {
       CheckPalin a = new CheckPalin();
       a.calculate();
    }
}
