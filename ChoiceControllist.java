import java.awt.*;
public class ChoiceControllist extends Frame 
{
    String msg="";
    List l;
    ChoiceControllist()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,250);
        setTitle("Choice control list");
        l=new List();
        l.add("Jan");
        l.add("Feb");
        l.add("Mar");
        l.add("Apr");
        l.add("May");
        l.setBounds(100,150,70,70);
        add(l);
        
    }
    public static void main(String[] args) {
        ChoiceControllist ccl=new ChoiceControllist();
    }
}
