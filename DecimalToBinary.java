import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter n : ");
int number = sc.nextInt();
BinaryConversion binaryConv = new BinaryConversion(number);
binaryConv.convert();
    }
}
class BinaryConversion{
    int number;
    int remainder;
    BinaryConversion(int number){
    this.number = number;

    }
    public void convert(){
        StringBuilder sb = new StringBuilder();     //study 

        while(number!=0){
           remainder=  number%2;
           number= number/2;
           sb.insert(0, remainder);


        }
        System.out.println("Binary number : " + sb.toString());
    }
}
//for octane by 8
//for hexadecimal by 6
//hw
