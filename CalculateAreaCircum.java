import java.util.Scanner;

public class CalculateAreaCircum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        int radius1 = sc.nextInt();
        Circle cr = new Circle(radius1);
        double cir = cr.circum();
        double ar = cr.area();
    
        System.out.println("Circumference : " + cir);
        System.out.println("Area : " + ar);
    }


}

class Circle{
    int radius;
    final double PI = 3.14;
    
    Circle(int radius){
this.radius = radius;   //constructor 

}
public double area(){
double area = PI * radius * radius ;      //method 1
return area;

}
public double circum(){
    double circumference  = 2 * PI * radius ;    //method 2
return circumference;
}
}

