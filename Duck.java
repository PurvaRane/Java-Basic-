public class Duck {
    public static void main(String[] args) {
        int m , n =9840 ;
        m = n;
        int count = 0;
        while(n!=0)
        {
            int d = n % 10 ; //4 8  9
            if ( d==0 )
            count++; //0 0 0
            n/=10;//98 9  0
        } 
        if(count>0)
        System.out.println("Number is a duck number");
        else
        System.out.println("Number is not a duck number");
    }
}
