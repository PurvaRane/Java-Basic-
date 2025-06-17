import java.util.Scanner;


public class NumberManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int number1 = sc.nextInt();
        System.out.print("Enter b: ");
        int number2 = sc.nextInt();
        SwapTwoNo stn = new SwapTwoNo(number1, number2);
        System.out.println("BEFORE : ");
        stn.showNumbers();
        stn.swaptwonumbers();
        System.out.println("AFTER : ");
        stn.showNumbers();
        // ByDirect bd = new ByDirect(number1, number2);
        // bd.showNo();
        // bd.byDirectMethod();
        // bd.showNo();
    }
}
class SwapTwoNo {
    int number1;
    int number2;
    SwapTwoNo(int number1 , int number2){
        this.number1 = number1;
        this.number2 = number2;

    }
    public  void swaptwonumbers(){
        int temp = number1;
        number1 = number2;
        number2 = temp;


    }
    
    

    public  void showNumbers(){

        System.out.println("Value of number 1 : "+ number1 + " \nValue of number 2 : " + number2 );
        

    }
}

class ByDirect {
     int number1;
     int number2;
     ByDirect(int number1,int number2){
        this.number1 = number1;
        this.number2 = number2;

     }
     public void byDirectMethod(){
        number1 = number1+number2;
        number2 = number1-number2;
        number1 = number1-number2;

    }
    public void showNo(){
        System.out.println("Value of number 1 : " + number1 + "\nValue of number 2 : " + number2);
}
}
