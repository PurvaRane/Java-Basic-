import java.awt.*;
import java.awt.event.*;


public class StudentForm extends Frame implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b;

    public StudentForm(){
        setVisible(true);
        // setDefaultCloseOperation(Frame.ABORT);
        setBounds(100, 100, 600, 500);
        setTitle("Student Form");
        setSize(300,200);
        setLayout(null);
        Label l1 = new Label();
        l1.setBounds(100, 100, 50, 40);
        l1.setText("Name : ");
        Label l2 = new Label();
        l2.setBounds(100, 200, 50, 40);
        l2.setText("Age : ");
        Label l3 = new Label();
        l3.setText("Course : ");
        l3.setBounds(100, 300, 50,40);
        TextField t1 = new TextField();
        t1.setBounds(200, 100, 50, 40);
        TextField t2 = new TextField();
        t2.setBounds(300, 100, 50, 40);
        TextField t3 = new TextField();
        t3.setBounds(400, 100, 50, 40);
       Button b = new Button();
       b.setBounds(500, 200, 60, 40);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b);

    }
   
    // private void setDefaultCloseOperation(int exitOnClose) {
       
    //     throw new UnsupportedOperationException("Unimplemented method 'setDefaultCloseOperation'");
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            String l1 = t1.getText();
            String l2 = t2.getText();
            String l3 = t3.getText();

            System.out.println("Name : "+l1);
            System.out.println("Age : "+l2);
            System.out.println("Course : "+l3);
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
    public static void main(String[] args) {
        new StudentForm();
    }

}
