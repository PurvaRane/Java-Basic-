import java.util.Scanner;
public class Calculator {
    public static void main(String[] args ) {
Scanner ca = new Scanner(System.in);
System.out.print("Enter a: ");
int operand1 = ca.nextInt();
System.out.print("Enter Operator + - * / : ");
char operator = ca.next().charAt(0);
System.out.print("Enter b : ");
int operand2 = ca.nextInt();
Calu c = new Calu(operand1, operator, operand2);

  switch(operator){
    case '+' : System.out.println("Addition : " + c.add());
               break;
    case '-' : System.out.println("Substraction : " + c.sub());
               break;
    case '*' : System.out.println("Multiplication : " + c.mult());
               break;
    case '/' : System.out.println("Division : " + c.div());
               break;
    case '%' : System.out.println("Modulo : " + c.mod());
               break;
               
    default  : System.out.println("Wrong operator!");
            break;

  }

}
}

class Calu{
    int operand1;
     int operand2;
    char operator;
    Calu(int operand1,char operator , int operand2){
        this.operand1 = operand1;
        this.operator = operator;
        this.operand2 = operand2;
       
    }
    public int add(){
        int addition = operand1 + operand2;
        return addition;
    }
    public int sub() {
        int substraction = operand1 - operand2;
        return substraction;
    }
    public double mult(){
        double multiply = operand1*operand2;
        return multiply;
    }
    public double div(){
        double division = operand1/operand2;
        return division;
    }
    public int mod(){
        int modulo = operand1 % operand2;
        return modulo;
    }

}
