//method overloading 
public class C1MethodOverloading {
public int sum(int a, int b){
return a+b;
}
public int sum(int a,int b, int c){
    return a+b+c;
}
    public static void main(String[] args) {
        C1MethodOverloading cobj = new C1MethodOverloading();
        System.out.println("Sum of 2 numbers : "+cobj.sum(2,3));
        System.out.println("Sum of 3 numbers : "+cobj.sum(2,3,4));

    }
}
