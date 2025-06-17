interface A{
    void show();
}
interface B extends A{

}
interface C extends A{

}
class D implements B,C{
    public void show(){
        System.out.println("D's show()");
    }
}
public class Main2 {
    public static void main(String[] args) {
        D d = new D();
        d.show();

    }
}
