public class Spy {
    public static void main(String[] args) {
        
        int m , n = 212;
        m = n ;
        int sum = 0,product = 1;
        while(n!=0)
        {
            int d = n%10;//2 1 2
            sum = sum +d; //2 3 5
            product =product*d;  //2 2 4
            n= n/10; //21 2

        }
        if(sum==product)
        {
            System.out.println("Yes Its a Spy Num");
        }
        else{
            System.out.println("No It's not a Spy num ");
        }

    }
}
