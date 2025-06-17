public class Student
{
public static void main(String[] args)
{
int a=45,b=50,c=75,d=80,e=87,total;
double per;
total=a+b+c+d+e;
System.out.println("Total Marks: "+total);
if(a>=40 && b>=40 &&c>=40 && d>=40 && e>=40)
{
per=(total*100)/500;
System.out.println("Student is pass");
System.out.println("Percentage : "+per);

}
else{
System.out.println("Student is Fail");
}
}
}