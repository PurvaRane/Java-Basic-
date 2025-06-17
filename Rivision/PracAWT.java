import java.awt.*;
import java.awt.event.*;


public class PracAWT extends Frame implements ActionListner {
    Label l1 = new Label("Name: ");
    Label l2 = new Label("Roll No: ");
    Label l3 = new Label("Gender: ");
    Label l4 = new Label("Category: ");
    Label l5 = new Label("Subject: ");

    TextField t1 = new TextField("Your Name");
    TextField t2 = new TextField();
    CheckboxGroup genderGrp = new CheckboxGroup();
    Checkbox male,female,other;
    Button submit = new Button("Submit");

    PracAWT(){
        setSize(450, 450);
        setTitle("AWT Registration Form");
        setLayout(null);
        setVisible(true);
        l1.setBounds(50,100, 50, 30);
        l2.setBounds(50,150, 50, 30);
        l3.setBounds(50,200, 50, 30);
        l4.setBounds(50,250, 50, 30);
        l5.setBounds(50,300, 50, 30);

        t1.setBounds(150,100,150,30);
        t2.setBounds(150,150,150,30);
        add(l1);add(l2);add(l3);add(l4);add(l5);
        add(t1);add(t2);

        male = new Checkbox("Male",genderGrp,false);
        male.setBounds(150,200,50,30);
        female = new Checkbox("Female",genderGrp,false);
        female.setBounds(200,200,50,30);
        other  = new Checkbox("Other",genderGrp,false);
        female.setBounds(250,200,50,30);
        Choice c = new Choice();
        c.add("Technical");c.add("NonTechnical");
        c.setBounds(150,250,50,30);
        add(c);
        List l = new List(3,true);
        l.add("AJP");
        l.add("OS");
        l.add("CNS");
        l.setBounds(150, 300, 50, 30);
        add(l);
        submit.setBounds(150, 350, 80, 30);
        
        add(male);add(female);add(other);add(submit);
    }
   
    
    public static void main(String[] args) {
        PracAWT p = new PracAWT();

    }
}
