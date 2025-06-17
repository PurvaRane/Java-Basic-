public class StaticBlock {
    public static void eat(){
        System.out.println("Eating!");

    }
    static{

            System.out.println("Swara is eating !!!!");
        
    }
    StaticBlock (){
        System.out.println("This is constructor!");
    }
    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        
        StaticBlock.eat();
    }
}
