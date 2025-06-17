import java.util.Scanner;
class QuadraticRoots{

    public static void main(String[] args){
        Scanner d = new Scanner(System.in);
        System.out.print("enter a : ");

        int a = d.nextInt();
        System.out.print("enter b : ");
        int b = d.nextInt();
        System.out.print("enter c : ");
        int c = d.nextInt();
 QuadRoot quadRoot = new QuadRoot(a,b,c);
 quadRoot.quadRootFinal();
    }
}
class QuadRoot{
    int a,b,c;
    double discriminant;
    QuadRoot(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public double descri(){
        discriminant = b*b-4*a*c;
        return discriminant;

    }
    public void  quadRootFinal(){
        if(discriminant>0){
        double r1 = (-b+ Math.sqrt(discriminant))/2*a;
        double r2 = (-b- Math.sqrt(discriminant))/2*a;
        System.out.println("Root 1 : "+r1+"Root 2 : "+r2);
            }
            else if(discriminant==0){
                double root = -b/2*a;
                System.out.println("Root : "+root);
            }
            else if (discriminant<0){
                double rt1 = -b/2*a;
                double rt2 = Math.sqrt(-discriminant)/2*a;
                System.out.println("Root 1 : " + rt1 + "Root 2 : " + rt2);
                
            }

    }
}