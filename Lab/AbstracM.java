abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rect extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
public class AbstracM {
    public static void main(String[] args) {
        
    Shape s1 = new Circle();
    Shape s2 = new Rect();
    s1.draw();
    s2.draw();
    }
    
}
