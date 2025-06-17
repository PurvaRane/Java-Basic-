//method overriding 

class Sum{
    public void sum(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
}
class Sum2 extends Sum{
    public void sum(int a,int b){
        System.out.println("Sum2 : "+(a+b));
    }
}
class C2MethodOverriding{
    public static void main(String[] args) {
        Sum2 s = new Sum2();
        s.sum(5,6); 
    }
   
}
