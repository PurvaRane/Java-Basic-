class Rectangle{
    private int length ,breadth ;
    public
    void area(){
        int a = length*breadth;
        System.out.println("Area = "+a);
    }
    void permiter(){
        int p = 2 * (length+breadth);
        System.out.println("Perimeter = "+p);
    }
    void setDimension(int x,int y ){
        length = x;
        breadth = y;
    }

}
public class SetterFunc {
    public static void main(String[] args) {
        Rectangle a,b;
        a = new Rectangle();
        b = new Rectangle();
        a.setDimension(5,6);
        b.setDimension(7,8);
        a.area();
        a.permiter();
        b.area();
        b.permiter();
    }
}
