public class MainCall {
public static void main(String[] args) {
    Cube a,b;
    a =new Cube();
    b = new Cube();
    a.setDimension(6, 7, 8);
    b.setDimension(8, 5, 2);
    a.volume();
    b.volume();
}    
}
class Cube {
    private int l,b,h;
    public 
    void volume(){
        int c = l*b*h;
        System.out.println("Volume = "+c);
    }
    void setDimension(int x,int y,int z){
        l=x;
        b=y;
        h=z;
    }

}
