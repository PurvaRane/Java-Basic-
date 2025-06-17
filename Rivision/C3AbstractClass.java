//abstract class :
abstract class Animal{ //define a abstract class 
    abstract void makeSound();//abstract method 
    public void eat(){
        System.out.println("This animal eats food !!");
    }
}
class Dog extends Animal{
 void makeSound(){   //defination of abstract method 
    System.out.println("Dog barks !");
 }
}
class Cat extends Animal{
    
    void makeSound(){
        System.out.println("Cat Meow !");
    }
}
public class C3AbstractClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        d.makeSound();
        c.eat();
        c.makeSound();
    }
}
