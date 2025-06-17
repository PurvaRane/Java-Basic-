import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
         double squareRt;
        
    double a = 16;
    squareRt = a/2;
    while((squareRt*squareRt)- a !=0){
     squareRt = squareRt + ((a/squareRt)/2);
    System.out.println("Square Root : "+ squareRt);
    }
    
    
   //doubt
   //infinite loop

  
    
    }
}

