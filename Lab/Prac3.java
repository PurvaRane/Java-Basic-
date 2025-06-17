import java.awt.*;
public class Prac3 extends Frame{
    Label l1=new Label("Name : ");
    Label l2=new Label("Branch : ");
    Label l3=new Label("PRN : ");
    Label l4=new Label("Gender : ");
    Label l5=new Label("Category : ");
    Label l6=new Label("Subject : ");
    Label l7=new Label("About : ");
    Prac3(){
        
       
        l1.setBounds(20,100,70,20);
        l2.setBounds(20,150,70,20);
        l3.setBounds(20,200,70,20);
        l4.setBounds(20,250,70,20);
        l5.setBounds(20,300,70,20);
        l6.setBounds(20,350,70,20);
        l7.setBounds(20,450,70,20);
        TextField t = new TextField();
        t.setBounds(100,100,80,30);
        t.setText("Purva Rane");
        add(t);
        
        

        TextField t1 = new TextField();
        t1.setBounds(100,150,80,30);
        t1.setText("Computer");
        add(t1);

       
        TextField t2 = new TextField();
        t2.setBounds(100,200,100,30);

        t2.setText("2230403245007");
        add(t2);

       
         
        CheckboxGroup cb = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cb,false);
        Checkbox c2 = new Checkbox("Female",cb,true);
        c1.setBounds(100,250,50,30);
        c2.setBounds(150,250,50,30);
        add(c1); add(c2);

       
        Checkbox c3 = new Checkbox("Tech", cb,false);
        Checkbox c4 = new Checkbox("Non-Tech",cb,true);
        Checkbox c5 = new Checkbox("None",cb,false);
        c3.setBounds(100,300,50,30);
        c4.setBounds(150,300,80,30);
        c5.setBounds(250,300,100,30);
        add(c3); add(c4); add(c5);

        
        List l1 =  new List(3,false);
        l1.add("AJP"); l1.add("CNS"); l1.add("JSP");
        l1.setBounds(100,350,50,50);
        add(l1);

        
        TextArea ta = new TextArea();
        ta.setBounds(100,450, 150,80);
        add(ta);
    
        add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
    setSize(90,30);
    setLayout(null);
    setVisible(true);
    setTitle("Form");
    }
    public static void main(String[] args) {
    Prac3 f = new Prac3();
}
}
