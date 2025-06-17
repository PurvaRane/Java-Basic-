public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
// 0
// 2 2
// 4 4 4
// 6 6 6 6
// 8 8 8 8 8
int p = 0;
        for(int i = 1;i<=n;i++,p+=2){
          
            for(int j =1 ;j<=i;j++){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
