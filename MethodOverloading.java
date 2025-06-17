public class MethodOverloading {
    public void sum(int a,int b){
        System.out.println("Sum : "+(a+b));
    }
    public void sum(double a,double b){
        System.out.println("Sum : "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading obj1 =new MethodOverloading();
        obj1.sum(2,3);
        obj1.sum(2.33,5.44);

    }
}
