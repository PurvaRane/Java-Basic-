import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Term3 
{
    private JLabel TopMessage;
    private JFrame frame;
    private JLabel namelabel;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JButton cancle;
    private JButton reset;
    private JButton ok;
    
    public Term3()
    {
        frame = new JFrame("Awt Swing Demo");
        TopMessage = new JLabel("");
        label = new JLabel("Enter your Name");
        textField = new JTextField();
        button = new JButton("Show");
        reset = new JButton("Reset");
        cancle = new JButton("Cancel");
        ok = new JButton("OK");
        namelabel = new JLabel(" ");

        frame.setLayout(null);
        TopMessage.setBounds(120, 30, 350, 30);
        label.setBounds(20,80,120,30);
        textField.setBounds(150,80,200,30);
        button.setBounds(20, 140, 80, 30);
        reset.setBounds(110, 140, 80, 30);
        cancle.setBounds(200, 140, 80, 30);
        ok.setBounds(290, 140, 80, 30);
        namelabel.setBounds(20, 180, 600, 30);

        frame.add(TopMessage);
        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.add(reset);
        frame.add(cancle);
        frame.add(ok);
        frame.add(namelabel);

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                namelabel.setText("Hello,"+textField.getText()+"..!!");
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                textField.setText("");
            }
        });
        cancle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                TopMessage.setText("Swing Computer JButton is SMS AjP Classroom 2023");
                textField.getText();
            }
        });
        frame.setSize(450,300); 
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        new Term3();
    }    
}
