public class AddByCopy {
    public static void main(String[] args){
     copyMethod();
     copyMethod();
    }

public static void copyMethod() {
     char ch1 = 'a';
        char ch2 = 'b';
        System.out.println( "Result :" + ch1 + ch2);
        
}
}