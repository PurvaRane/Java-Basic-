
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingReg extends JFrame {
    JLabel l1 = new JLabel("Name: ");
    JLabel l2 = new JLabel("Roll No: ");
    JLabel l3 = new JLabel("Gender: ");
    
    JLabel l5 = new JLabel("Subject: ");

    JTextField t1 = new JTextField("Your Name");
    JTextField t2 = new JTextField();
    JRadioButton male, female, other;
    JButton submit = new JButton("Submit");
    ButtonGroup genderGrp = new ButtonGroup();

    SwingReg() {
        setSize(450, 450);
        setTitle("Swing Registration Form");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the app closes on exit
        setVisible(true);

        // Setting bounds and adding components
        l1.setBounds(50, 100, 100, 30);
        l2.setBounds(50, 150, 100, 30);
        l3.setBounds(50, 200, 100, 30);

        l5.setBounds(50, 250, 100, 30);

        t1.setBounds(150, 100, 150, 30);
        t2.setBounds(150, 150, 150, 30);
        
        add(l1); add(l2); add(l3); add(l5);
        add(t1); add(t2);

        // Gender selection using radio buttons
        male = new JRadioButton("Male");
        male.setBounds(150, 200, 70, 30);
        female = new JRadioButton("Female");
        female.setBounds(220, 200, 80, 30);
        other = new JRadioButton("Other");
        other.setBounds(300, 200, 80, 30);

        genderGrp.add(male);
        genderGrp.add(female);
        genderGrp.add(other);

        add(male); add(female); add(other);


        // List for subjects using JList
        String[] subjects = {"AJP", "OS", "CNS"};
        JList<String> subjectList = new JList<>(subjects);
        subjectList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane listScroller = new JScrollPane(subjectList);
        listScroller.setBounds(150, 250, 150, 60); // Added scroll pane for the list
        add(listScroller);

        // Submit button
        submit.setBounds(150, 300, 80, 30);
     
        add(submit);
    }

   
    public static void main(String[] args) {
        new SwingReg();
    }
}
