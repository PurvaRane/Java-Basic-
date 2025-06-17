class Student {
private 
int rollNo ;
String name;
public void showData(){
    System.out.println("Roll No : "+rollNo);
    System.out.println("Name : "+name);
}
public Student(int rn,String nm){
    rollNo = rn;
    name = nm;
}
public Student(String nm,int rn){
    name = nm;
    rollNo = rn;
}


}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student a , b ;
        a = new Student(4117, "Swara");
        b = new Student("Purva", 3123);
        a.showData();
        b.showData();
    }
}
