class Overloading
{
    public void print(int n, char c)
    {
        System.out.println("Integer First :"+ n +" "+c);
    }
    public void print(char c, int n)
    {
        System.out.println("Character First :" + c +" "+n);
    }
}
public class TermWork1
    {
        public static void main(String[] args) 
        {
            Overloading obj = new Overloading();
            System.out.println("The polymorphism here is achived through method Overloading");
            obj.print(1,'a');
            obj.print('b',10); 
        }
    }

