class A{
    void show()
{
System.out.println("A's show()");
}

}
class B extends A{
    void show()
{
System.out.println("B's show()");
}

}
class C extends A{
    void show()
{
System.out.println("B's show()");
}

}
class D extends B{

}
public class Main1{
    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}