public class MainClass {
    public static void main(String[] args){
        Rectangle a , b;
        a = new Rectangle();
        b = new Rectangle();
        a.length = 4;
        b.length = 5;
        a.breadth= 7;
        b.breadth = 8;
        a.area();
        a.permiter();
        b.area();
        b.permiter();

    }
}
class Rectangle{
    int length ,breadth ;
    void area(){
        int a = length*breadth;
        System.out.println("Area = "+a);
    }
    void permiter(){
        int p = 2 * (length+breadth);
        System.out.println("Perimeter = "+p);
    }

}
