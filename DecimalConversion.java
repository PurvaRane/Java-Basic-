import java.util.Scanner;
public class DecimalConversion {
    public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.print("Enter n : ");
int number = sc.nextInt();
BinaryConversion binaryConv = new BinaryConversion(number);
binaryConv.convert();
OctaneConversion octaneconv = new OctaneConversion(number);
octaneconv.convt();
HexadeciConv hexaDeci = new HexadeciConv(number);
hexaDeci.con();
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
class OctaneConversion{
    int number ;
    int remain;
    OctaneConversion(int number){
        this.number = number;

    }
    public void convt(){
        StringBuilder sb = new StringBuilder();
        while(number!=0){
            remain = number%8;
            number = number/8;
            sb.insert( 0, remain);
        }
        System.out.println("Octane number : " + sb.toString());
    }

}
class HexadeciConv{
    int number;
    int rem;
    HexadeciConv(int number){
        this.number = number;

    }
    public void con(){
        StringBuilder sb = new StringBuilder();
        while(number!=0){
            rem = number%6;
            number/=6;
            sb.insert(0 , rem);

        }
        System.out.println("Hexadecimal number : " + sb.toString());
    }
}
//for octane by 8
//for hexadecimal by 6
//hw
