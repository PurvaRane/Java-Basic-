import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = info.nextLine();
        System.out.print("Enter Branch : ");
        String branch = info.nextLine();
        System.out.print("Enter Roll No. : ");
        int rollNo = info.nextInt();
        System.out.print("Enter Age : ");
        int age = info.nextInt();
        Student studentinfo = new Student(name,branch,rollNo,age);

    

    }
}
class Student {
    String name ;
    int rollNo;
    String branch;
    int age;

 Student (String name,String branch,int rollNo,int age ){
     

    this.name = name ;
    this.branch = branch;
    this.rollNo = rollNo;
    this.age = age;

    System.out.println("Name : " + name);
    System.out.println("Branch : " + branch);
    System.out.println("Roll No : " + rollNo);
    System.out.println("Age : " + age);
}
}


//  class Student {
//     String name ;
//     int rollNo;
//     String branch;
//     int age;
 

 
// }