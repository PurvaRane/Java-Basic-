public class SwapWithoutV {
    public static void main(String[] args) {
        int a = 6,b=5;
        a = a+b; //11
        b = a-b; //6
        a = a-b; //5
        System.out.println("a = "+a+"\nb = "+b);
    }
}
