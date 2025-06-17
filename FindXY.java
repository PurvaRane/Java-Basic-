import java.util.*;

public class FindXY {
    public static void main(String args[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x coordinate : ");
        x = sc.nextInt();
        System.out.print("Enter y coordinate : ");
        y = sc.nextInt();
        if(x>0&&y>0){
            System.out.println("1st Quadrant");
        }
        else if(x<0&&y>0){
            System.out.println("2nd Quadrant");
        }
        else if(x<0&y<0){
            System.out.println("3rd Quadrant");
        }
        else if(x>0&&y<0){
            System.out.println("4th Qaudrant");
        }
        else if(x==0&&y>0){
            System.out.println("Positive Y axis");
        }
        else if(x>0&&y==0){
            System.out.println("Positive X axis");
        }
        else if(x<0&&y==0){
            System.out.println("Negative X axis");
        }
        else if(x==0&&y<0){
            System.out.println("Negative Y axis");
        }
        else if(x==0&&y==0){
            System.out.println("Origin");
        }
}
}
