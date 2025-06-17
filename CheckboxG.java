import java.awt.*;
public class CheckboxG extends Frame
{
   Checkbox cb1,cb2; 
   CheckboxGroup cbg;
    String msg="";
    CheckboxG()
    {
        setLayout(null);
        setVisible(true);
        setSize(300,300);
        setTitle("CheckBox Group");
        cbg=new CheckboxGroup();
        cb1=new Checkbox("java",false,cbg);
        cb1.setBounds(100,50,150,50);
        add(cb1);
        cb2=new Checkbox("HTML",false,cbg);
        cb2.setBounds(100,200,50,50);
        add(cb2);

    }
    public static void main(String[] args) {
        CheckboxG cbG= new CheckboxG();
    }

}
