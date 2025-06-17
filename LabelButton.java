import java.awt.*;
import java.awt.event.*;

class LabelButton extends Frame implements ActionListener {
TextField t;
    LabelButton(){

        Label l = new Label("Lect1");
        add(l);
        l.setBounds(50, 100, 90, 30);
    t = new TextField();
    t.setBounds(160,100,90,50);
   
 
        Button b = new Button("Click");
        b.setBounds(160, 160,50, 30);
        b.addActionListener(this);
        add(t);
    add(b);
       

    setSize(90,30);
    setLayout(null);
    setVisible(true);
    setTitle("Second Program");
    }
    
    public void addActionListener(ActionEvent a){
        t.setText("Hello Swara Sadia !");

    }
    public static void main(String[] args) {
        LabelButton l = new LabelButton();
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
