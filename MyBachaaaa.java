import java.util.Scanner;
public class MyBachaaaa
 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Is your name Mineee? (Y / N ) : ");
        char bachaa = sc.next().charAt(0);
       HelloBabyyy babe = new HelloBabyyy(bachaa);
       hp.Checkk();
      
    }
}
class HelloBabyyy{
    int i ;
    char bachaa;
    HelloBabyyy(char bachaa){
        this.bachaa = bachaa;
    }
    public void Checkk(){
    if(bachaa=='Y'){
    System.out.println("I loveeeee you Babyyyyyyyyy!"   );
    HeartPrint hp = new HeartPrint();
      hp.heart();
    }
    else{
   System.out.println("Lafaaa marennnnnnn????");
    }
}

}
class HeartPrint{
   final int size = 4  ;  
  HeartPrint(){

  }
          public void heart(){
                  
            for (int m = 0; m < size; m++) {  
                    for (int n = 0; n <= 4 * size; n++) {  
                            double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                            double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                            if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                                    System.out.print('*');  
                            } else {  
                                    System.out.print(' ');  
                            }  
                        }  
                        System.out.print(System.lineSeparator());  
                }  
                for (int m = 1; m <= 2 * size; m++)  
                {  
                    for (int n = 0; n < m; n++) {  
                        System.out.print(' ');  
                }  
                for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                        System.out.print("*");  
                    }  
                System.out.print(System.lineSeparator());  
            }  
    }  
  }

