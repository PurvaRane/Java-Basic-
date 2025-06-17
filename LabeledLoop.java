public class LabeledLoop  
{  
    //to print 1 to 9..5 times
public static void main(String args[])  
{  
int i, j;  
//outer loop  
outer:     //label  for the outer for loop 
for(i=1;i<=5;i++)  
{  
System.out.println();  
//inner loop  
inner:      //label for the inner for loop
for(j=1;j<=10;j++)  
{  
System.out.print(j + " ");  
if(j==9)     
break inner;      
}  
}  
}  
}  