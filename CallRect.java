class Rectangle{
    int length , breadth ;
    void area(){
        System.out.println("Area of Rectangle : "+(length*breadth));
    }
    void permiter(){
        System.out.println("Perimeter of Rectangle : "+(2*(length+breadth)));
    }
}
public class CallRect {
    public static void main(String[] args) {
        
        Rectangle a ,b;
        a = new Rectangle();
        b = new Rectangle();
        a.length = 4;
        a.breadth = 5;
        b.length = 9;
        b.breadth = 10;
        a.area();
        a.permiter();
        b.area();
        b.permiter();

    }
}
