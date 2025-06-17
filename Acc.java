class CalculateIntrest {
    private int accNo , balance;
    public void intrest(double r , int n ){
        double si = (balance * r *n) /100;
        System.out.println("Intrest : "+si);
    }
    public CalculateIntrest(int ac , int b){ //acc nameof
        accNo = ac;
        balance = b;
    }
}

public class Acc {
    //Q40. Program to create a account type of object whose account no is 4117 
    //balance is 25000 , Calculate intrest for 5 years using rate 10.25 also 
    //calculate intrest for 2 years using rate 9.75
    public static void main(String[] args) {
        CalculateIntrest a,b ;
        a = new CalculateIntrest(4117, 25000);
        b = new CalculateIntrest(4117, 25000);
        a.intrest(10.25, 5);
        b.intrest(9.75, 2);
    }
}
