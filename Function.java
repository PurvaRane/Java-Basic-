import java.util.Scanner;

public class Function {
    static void star(int n ){
        for(int i = 1;i<=n;i++)
        System.out.println("*");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        star(n);

    }
}

