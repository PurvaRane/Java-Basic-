
interface Dog {
    public void sound();

    public void sleep();
}

abstract class Animal implements Dog {
    public void sound() {
        System.out.println("The DOG Say : BAW BAW");
    }

    public void sleep() {
        System.out.println("Zzzzz....");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.sleep();
    }
}
