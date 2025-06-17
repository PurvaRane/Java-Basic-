import java.util.Scanner;

public class RectangleAreaPerimeter{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Lenght : ");
    int length = sc.nextInt();
    System.out.print("Enter Bredth : ");
    int bredth = sc.nextInt();
    AreaRect lb1 = new AreaRect(length, bredth);
    int arr = lb1.arearect1();
    System.out.println("Area : " + arr);
    int prr = lb1.peri1();
    System.out.println("Perimeter : " + prr);

}
}

class AreaRect{
    int length;
    int bredth ;
    AreaRect(int length,int bredth){
        this.length = length;
        this.bredth = bredth;
       
    }
    public int  arearect1(){
        
        int area = length* bredth ;  
        return area;
    }
    public int peri1(){
    int perimeter = 2*(length + bredth);
    return perimeter;
    }
}

//
//System.out.println("Perimetr : " + perimeter);