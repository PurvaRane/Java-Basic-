public class InstanceBlock {
    static{
        System.out.println("Static Block ");
    }
    InstanceBlock(){
        System.out.println("Costructor !");
    }

    {
        System.out.println("Instance Block ");
    }
       public static void main(String[] args) {
        InstanceBlock obj1 = new InstanceBlock();
    }
}
