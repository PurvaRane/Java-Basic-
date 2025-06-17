import java.awt.*;

public class UiElements extends Frame {
    UiElements(){
        Label l = new Label("AJP");
        add(l);
        l.setBounds(50, 100, 90, 30);
    TextField t = new TextField();
    t.setBounds(160,100,90,50);
    t.setText("Hello");
    add(t);
    Checkbox cb = new Checkbox("AJP",null,true);
    Checkbox cb1 = new Checkbox("JSP",null,false);
    Checkbox cb2 = new Checkbox("OS",null,false);
    cb.setBounds(50, 160,50 , 50);
    add(cb);
    cb1.setBounds(150, 160,50 , 50);
    add(cb1);
    cb2.setBounds(250, 160,50 , 50);
    add(cb2);
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox c4 = new Checkbox("Male",cbg,false);
    Checkbox c5 = new Checkbox("Female",cbg,true);
        c4.setBounds(50,200,50,50);
        c5.setBounds(150,200,50,50);
        add(c4);
        add(c5);
        List l1 = new List(3,false);
        l1.add("CS");l1.add("IT");l1.add("INSTRU");
        l1.setBounds(50, 260, 50, 50);
        add(l1);
        Choice c = new Choice();
        c.add("AJP");c.add("CNS");c.add("JSP");
        c.setBounds(150, 260, 50, 50);
        add(c);
        TextArea t1 = new TextArea();
        t1.setBounds(50,360,70,70);
        add(t1);
        MenuBar m1 = new MenuBar();
        setMenuBar(m1);
        Menu file = new Menu("File");
        MenuItem i1,i2,i3;
        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.add(new MenuItem("Close"));
        m1.add(file);
        
    setSize(90,30);
    setLayout(null);
    setVisible(true);
    setTitle("First Program");

    }
    public static void main(String[] args) {
        UiElements u = new UiElements();
    }
}