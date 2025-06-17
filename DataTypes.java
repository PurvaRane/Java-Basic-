import java.util.Scanner;



public class DataTypes {
    public static void main(String[] args) { //main
        Scanner scanDataTypes = new Scanner(System.in);
        System.out.print("Enter byte: ");
        byte a = scanDataTypes.nextByte();
        System.out.print("Enter short : ");    //method
        short b = scanDataTypes.nextShort();
        System.out.print("Enter integer : ");
        int c = scanDataTypes.nextInt();
        System.out.print("Enter long : ");
        long d = scanDataTypes.nextLong();
        System.out.print("Enter float : ");
        float e = scanDataTypes.nextFloat();
        System.out.print("Enter double : ");
        double f = scanDataTypes.nextDouble();

        AllTypeData atd = new AllTypeData(a, b, c, d, e, f);
        atd.printData();
    }
}
 class AllTypeData{   //class
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    AllTypeData(byte a,short b , int c, long d , float e,double f){
        System.out.println("All Data types: "); //constructor
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;

    }

    public void printData(){
        System.out.println("Byte : " +  a );
        System.out.println("Short : " + b);
        System.out.println("Integer : " + c);
        System.out.println("Long : " + d);
        System.out.println("Float : " + e);
        System.out.println("Double : " + f);

    }
   
    
}
