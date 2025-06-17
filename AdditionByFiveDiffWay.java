import java.util.Scanner;
public class AdditionByFiveDiffWay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print ("Enter operator for addition : ");
        char ch = sc.next().charAt(0);
     AdditionNum addNum = new AdditionNum(a, b, ch);
     addNum.addByIf(a, b);
     addNum.addByIfElse(a, b);
     addNum.addBySwitch(a, b, ch);
     addNum.addByTernaryOp(a, b);

       
    }
    
}
class AdditionNum{
    int a,b;
    char ch;
    AdditionNum(int a,int b,char ch){
        this.a = a;
        this.b = b;
        this.ch = ch;

    }
    public void addByIf(int a,int b){
        if(a>0&&b>0){
            System.out.println("Sum : "+(a+b));
        }

    }
    public void addByIfElse(int a,int b){
        if(a>0){
            if(b>0){
            System.out.println("Sum : "+(a+b));
            }
        }
        else{
            System.out.println("The number is negative ");
        }
    }
    public void addBySwitch(int a,int b,char ch){
        switch (ch){
       case '+': System.out.println("Sum : " + (a+b));
               break;

        default : System.out.println("Invalid character ");
    
        }

    }
    public void addByTernaryOp(int a,int b){
        int result = (a>0&&b>0)?a+b:0;
        System.out.println("Sum : " + result);
    }
}