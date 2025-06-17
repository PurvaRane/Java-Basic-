import java.util.Scanner;
public class DecimalToBinary2
{
    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        BinaryConversion binaryConv = new BinaryConversion(number);
        binaryConv.convert();
}
}
class BinaryConversion
{
    int number;
    int remainder;
    BinaryConversion(int number){
    this.number=number;
}
public void convert()
{
    StringBuilder sb = new StringBuilder();   
    
    while(number !=0)
    {
       remainder = number%2;
         number = number/2;
        sb.insert(0,remainder);
    }
    System.out.println("Decimal to binary conversion" +sb.toString());
}
}
