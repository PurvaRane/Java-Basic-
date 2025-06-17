//in this code we created two classes that are PrintHello and HelloWorld
//we called the created class in the main class as an object that is we contructed ph there..and then called it in the program



class PrintHello{
    void print(){
        System.out.println("Hellooo");

    }
}

class HelloWorld {
public static void main(String[] args){
show(); //function call
PrintHello ph = new PrintHello(); //memory address in heap area of this object
ph.print();
ph.print();
}

 public static void show(){  //function
System.out.println("Hello World!");
System.out.println("Hello World!");


}
}

