
import java.util.Scanner;
public class Series {
    public static void main(String[] args){
  

        fibonacciSeries();
        series2();
        palindromeNum();

    }


public static void seriesEvenSqOddCube(){
    

for(int i = 0 ; i<=11;i++){
    if(i%2==0){    //0 1 4 27 16 125 ....
        System.out.print(" "+ i*i );
    }
    else{
        System.out.print(" "+i*i*i);
    }

}
}
public static void series2(){
    int a,b,c,d ;
     Scanner sc1 = new Scanner(System.in);
     System.out.println("\n ");
     System.out.print("Enter n : ");
   int n = sc1.nextInt();
    a = (n%10);   //2
    b = (n%100)/10;  //3
    c = (n%1000)/100; //5
    d = n/1000;  //1

    double armstrongNum =(Math.pow(d,4))+(Math.pow(c,4))+(Math.pow(b,4))+(Math.pow(a,4));
    System.out.println("Value : " + armstrongNum );
    if(armstrongNum == n){
        System.out.println("It's an armstrong number");
    }
    else{
        System.out.println("It's not an armstrong number");
    }

}
public static void fibonacciSeries(){

    int num1 = 0;
    int num2 = 1;
    int limit = 10;
    int sum = 0;
System.out.println("Fibonacci Series : ");
    System.out.print("0");
    for(int i = 0;i<=limit ; i++){
        sum = num1 + num2;
        System.out.print(" "+ sum);  
        num1 = num2;
        num2 = sum;

    }

}
public static void palindromeNum(){
     int a,b,c,d ;
     Scanner sc1 = new Scanner(System.in);
     System.out.println("\n ");
     System.out.print("Enter m of 4 digits: ");
   int m = sc1.nextInt();
    a = (m%10);   //2
    b = (m%100)/10;  //3
    c = (m%1000)/100; //5
    d = m/1000;  //1
 int reverseNum = 1000*a + 100*b +10*c + d;
 if(m ==reverseNum){
    System.out.println("It's a Palindrome number ");

 }
 else{
    System.out.println("It's not a Palindrome number ");
 }
}
}


