public class Palindrome {
    public static void main(String args[]){
        int n = 121;

        int m =n ;
        int sum = 0;
        while(n!=0)
        {
            int d = n%10; //1 // 2 //1
            sum = sum*10+d; //1 //12 // 121
            n = n/10; //12 // 1 //0.1
         }
        if(sum==m) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
