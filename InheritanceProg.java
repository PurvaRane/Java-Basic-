class A{
    void alpha(){
        System.out.println("A");
    }
}
class B extends A{ //single inheritance
    void beta(){
        System.out.println("B");
    }
}
// 
// class C extends B{ //multilevel inheritance 
//     void cos(){
//         System.out.println("C");
//     }
// }
class C extends A{ //hierarchical inheritance 
    void cos(){
        System.out.println("C");
    }
}


public class InheritanceProg {
    public static void main(String[] args) {
        C obj1 = new C();
        B obj2 = new B();

        obj1.alpha();
        obj2.beta();
        
        obj1.cos();

    }
}
