 class Rectangle {
    int length ;
    int breadth ;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
        System.out.println("Area : "+(length*breadth));
    }
    void perimeter(){
        System.out.println("Perimeter : "+(2*(length+breadth)));
    }
}

public class ConstOverload2 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(8, 9);
        Rectangle b = new Rectangle(10, 20);
        a.perimeter();
        a.area();
        b.perimeter();
        b.area();
    }
}
