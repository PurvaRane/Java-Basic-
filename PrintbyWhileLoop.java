public class PrintbyWhileLoop{
    public static void main(String[] args) {
        int i=100 ;
        while(i>=1){
        if(i%2==0||i%5==0){
            System.out.print(i+" ");
        }
        i--;
        }
    }
}