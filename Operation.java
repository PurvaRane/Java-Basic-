import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Operation{
    public static void main(String[] args) {
        Scanner ca = new Scanner(System.in);
System.out.print("Enter a: ");
int operand1 = ca.nextInt();
System.out.print("Enter b : ");
int operand2 = ca.nextInt();
ArithmaticOperation o = new ArithmaticOperation(operand1,operand2);
int a = o.addi();
int b = o.subs();
double c = o.multi();
double d = o.divi();
int e = o.modu();
System.out.println("ARITHMATIC OPERATORS :   ");
System.out.println("Addition : " + a);
System.out.println("Substraction : " + b );
System.out.println("Multiplication : " + c);
System.out.println("Division : "+ d );
System.out.println("Modulo : " + e);



RelationalOperation relationalop = new RelationalOperation(operand1, operand2);
System.out.println("RELATIONAL OPERATORS :  ");
System.out.println("By == : ");
if(relationalop.comparisonOperation()==true){
    System.out.println("Both numbers are equal ");

}
else{
    System.out.println("Numbers are unequal ");
}
System.out.println("By != : ");
if(relationalop.comparisonnoteqOperation() == true) {
    System.out.println("Numbers are not equal ");

}
else{
    System.out.println("Number are equal ");
}
System.out.println("By > : ");
if(relationalop.compGreaterthanOp()==true){
    System.out.println("Operand 1 is greater than Operand 2 ");
}
else{
    System.out.println("Operand 1 is not greater than Operand 2 ");
}
System.out.println("By < : ");
if(relationalop.compLessthanOp()==true){
    System.out.println("Operand 1 is less than Operand 2 ");
}
else{
    System.out.println("Operand 1 is not less than Operand 2");
}

System.out.println("By >= : ");
if(relationalop.compGreaterthanEqtoOp()==true ){
    System.out.println("Operand 1 is greater than or equal to Operand 2");
}
else{
    System.out.println("Operand 1 is not greater than or equal to Operand 2");
}
System.out.println("By <= : ");
if(relationalop.compLessthanEqtoOp()==true){
    System.out.println("Operand 1 is less than or equal to Operand 2 ");
}
else{
    System.out.println("Operand 1 is not less than or equal to Operand 2");
}
System.out.println("LOGICAL OPERATORS :    ");
System.out.print("Enter Number 1 : ");
int number1 = ca.nextInt();
System.out.print("Enter Number 2 : ");
int number2 = ca.nextInt();
LogicalOperators logicalOp = new LogicalOperators(number1, number2);
System.out.println("By && :   ");
if(logicalOp.andOperator()==true){
    System.out.println("True");
}
else{
    System.out.println("False");
}
System.out.println("By || :  ");
if(logicalOp.orOperator()==true){
    System.out.println("True ");
}
else{
    System.out.println("False ");
}
System.out.println("UNARY OPERATORS :   ");
System.out.print("Enter x : ");
int x = ca.nextInt();
UnaryOperator unop = new UnaryOperator(number1);
int poIn = unop.postInOp();
int prIn = unop.preInOp();
int poD = unop.postDOp();
int prD = unop.preDOp();

System.out.println("By ++x : ");
System.out.println("Result : " + prIn);
System.out.println("By x++ : ");
System.out.println("Result : " + poIn);
System.out.println("By --x : ");
System.out.println("Result : " + prD);
System.out.println("By x-- : ");
System.out.println("Result : "+poD);
System.out.println("By Bitwise : ");
unop.bitwiseOp();

System.out.println("Ternary Operator : ");
System.out.print("Enter number 1: ");
int num1 = ca.nextInt();
System.out.print("Enter number 2 : ");
int no2 = ca.nextInt();
System.out.print("Enter number 3 : ");
int no3 = ca.nextInt();
TernaryOperator tp1 = new TernaryOperator(num1, no2, no3);
tp1.ternaryOperation();

    }



}

//end of main class



class ArithmaticOperation{ //class 1
    int operand1;
    int operand2;
    ArithmaticOperation(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;

    }
    public int addi(){
        int addition = operand1 + operand2;
        return addition;
    }
    public int subs() {
        int substraction = operand1 - operand2;
        return substraction;
    }
    public double multi(){
        double multiply = operand1*operand2;
        return multiply;
    }
    public double divi(){
        double division = operand1/operand2;
        return division;
    }
    public int modu(){
        int modulo = operand1 % operand2;
        return modulo;
    }

    
}
class RelationalOperation{ //class 2
    int operand1;
    int operand2;
    RelationalOperation(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;

    }
    public boolean comparisonOperation(){
        if(operand1==operand2){
            return true;

        }
        else{
            return false;

        }

    }
    public boolean comparisonnoteqOperation(){
        if(operand1  != operand2){
            return true;

        }
  else{
         return false;

  }   
 }

 public boolean compGreaterthanOp(){ //class 3
    if(operand1>operand2){
        return true;

    }
    else{
       return false;

    }
 }

 public boolean compLessthanOp(){
    if(operand1<operand2){
        return true;

    }
    else{
        return false;

    }
 }
 public boolean compGreaterthanEqtoOp(){
    if(operand1>=operand2){
        return true;
    }
    else{
        return false;
    }
 }
 public boolean compLessthanEqtoOp(){
    if(operand1<=operand2){
        return true;
    }
    else{
        return false;
    }
 }
}
class LogicalOperators{ //class 4
int number1;
int number2;
 LogicalOperators(int number1,int number2){
    this.number1 = number1;
    this.number2 = number2;

 }
 public boolean andOperator(){
    if(number1< 10 && number2 > 10){
        return true;
    }
    else{
        return false;
    }
 }
 public boolean orOperator(){
    if(number1>10 || number2 < 10){
        return true;
    }
    else{
        return false;
    }
 }
}
class UnaryOperator{ //class 5
   int x;
   UnaryOperator(int x){
    this.x=x;
   }
   public int preInOp(){
    
    return  ++x;
   }
   public int postInOp(){

    return x++;
   }
   public int preDOp(){
    return --x;

   }
   public int postDOp(){

    return x--;
   }
 public void  bitwiseOp(){
    int z = ~x;
    int z1 = ~x+1;
    System.out.println("1's complement : " + z);
    System.out.println("2's complement : " + z1);
 }

}
class TernaryOperator{  //class 6
        int  num1, no2 , no3 ;
       TernaryOperator(int num1,int no2 , int no3){
        this.num1 = num1;
        this.no2 = no2;
        this.no3 = no3;
    }
    
    public void ternaryOperation(){

        int result = (num1>no2)?((num1>no3)?num1:no2):((no2>no3)?no2:no3);
        System.out.println("Greatest number : "+ result);

    }

}
