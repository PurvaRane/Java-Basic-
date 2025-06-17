public class MethodOverriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.sum(6,8);
    }
}
class A{
    public void sum(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
}
class B extends A{
    @Override
    public void sum(int a,int b){
        System.out.println("Sum is "+(a+b));
    }
}
    


