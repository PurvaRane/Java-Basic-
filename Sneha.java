import java.util.Scanner;

class Menu{

    public void display(){
      
        System.out.println("============================================================");
        System.out.println("Welcome to My Menu Drivn Program");
        System.out.println("============================================================");
        System.out.println("Press '1' for Simple Inheritance");
        System.out.println("Press '2' for Method Overloading(Non-constructor Method)    ");
        System.out.println("Press '3' for Method Overriding");
        System.out.println("Press '4' for Multiple Inheritance");
        System.out.println("Press '5' to exit th program");
        System.out.println("============================================================");
        System.out.println();
        System.out.println("Enter your choice :");
    }
}

// Simple Inheritance 
class Animal{
    public void displayInfo1(){
        System.out.println("Animals are of two types Herbivorous and Carnivorous");
    }
}
class Tiger extends Animal{
    public void displayInfo2(){
        displayInfo1();
        System.out.println("Tiger is a carnivorous animal");
    }
}

// Method Overloading
class Operation{
    public void sum(int a,int b){
        int sum = a+b;
        System.out.println("Sum of two numbers is" + sum);
    }
    public void sum(int a,int b,int c){
        int sum= a+b+c;
        System.out.println("Sum of three numbrs is " + sum);
    }
}

// Method Overriding 
class  Vehicle{  
    public void run(){
      System.out.println("Vehicle is running");
  }  
}  
 
class Bike extends Vehicle{
    public void run(){
       System.out.println("Bike is running safely");
   }  
}  
//Multiple Inheritance 
interface Java{
    public void printMessage1();
}
class Python{
    public void printMessage2(){
        System.out.println("Python code looks like simple English words.");
    }
}
class Language extends Python implements Java{
    public void printMessage1(){
        System.out.println("Java is platform independent.");
    }
}

// Execution of Main Menu-Driven Program 

class MyClass{
 private static int choice;
   public static  void main(String[]args){
       Menu m= new Menu();
       do{
           m.display();
           Scanner input = new Scanner(System.in);
           choice = input.nextInt();
           System.out.println("You pressed " + choice +" ");
           switch (choice){
               case 1:
                   Tiger t = new Tiger();
                   t.displayInfo2();
                   break;
               case 2:
                   Operation obj = new Operation();
                   obj.sum(12,20);
                   obj.sum(15,22,30);
                   break;
               case 3:
                   Vehicle v =new Vehicle();
                   v.run();
                   Bike b = new Bike();
                   b.run();
                   break;
               case 4:
                   Python p = new Python();
                   p.printMessage2();
                   Language l = new Language();
                   l.printMessage1();
                   break;
               default:
                   System.out.println("Thankyou! Exiting the Program");
                   break;
           } 
        }while(choice != 5);
   }
}