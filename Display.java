public class Display {
    static void displayNum(int a , int b){
        for(int i= a;i<=b;i++){
            System.out.print(i + "  ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Numbers from 1st arguement to 2nd arguement : " );
        displayNum(6, 15);
    }
}
