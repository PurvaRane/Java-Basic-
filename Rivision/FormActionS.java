 
    
    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;
    public class FormActionS extends JFrame implements ActionListener 
    {
     JLabel l1, l2, l3, l4, l5, l6, l7, l8;
     JTextField jtf1, jtf2, jtf3;
     JPasswordField jpf; 
     JTextArea jt1; 
     JButton b1;
     JComboBox<String> jb1; 
     JRadioButton male, female;
     JCheckBox ajp, jsp, cns;
     JList<String> courseList;
     JScrollPane courseScrollPane;
     java.awt.Container c;
     JMenuBar mbr;
     JMenu d1; // Department menu
     JMenu f1; // Faculties menu
     JMenuItem compItem, itItem, chemItem, petroItem, principalItem, officeStaffItem, 
    profItem;
     FormActionS() 
     {
     c = getContentPane();
     c.setBackground(Color.GRAY);
     setLayout(null);
     Font f = new Font("Arial", Font.BOLD, 13);
     // Labels and text fields
     l1 = new JLabel("Enter Your Name");
     l1.setBounds(60, 50, 150, 20);
     l1.setForeground(Color.BLUE);
     l1.setFont(f);
     c.add(l1);
     jtf1 = new JTextField(20);
     jtf1.setBounds(220, 50, 200, 20);
     jtf1.setFont(f);
     c.add(jtf1);
     l2 = new JLabel("Enter Your College Name");
     l2.setBounds(60, 90, 150, 20);
     l2.setForeground(Color.BLUE);
     l2.setFont(f);
     c.add(l2);
     jtf2 = new JTextField(20);
     jtf2.setBounds(220, 90, 200, 20);
     jtf2.setFont(f);
     c.add(jtf2);
     l3 = new JLabel("Enter Your Email");
     l3.setBounds(60, 130, 150, 20);
     l3.setForeground(Color.BLUE);
     l3.setFont(f);
     c.add(l3);
     jtf3 = new JTextField(20);
     jtf3.setBounds(220, 130, 200, 20);
     jtf3.setFont(f);
     c.add(jtf3);
     l4 = new JLabel("Enter Email Password");
     l4.setBounds(60, 170, 150, 20);
     l4.setForeground(Color.BLUE);
     l4.setFont(f);
     c.add(l4);
     jpf = new JPasswordField(20);
     jpf.setBounds(220, 170, 200, 20);
     jpf.setEchoChar('*');
     jpf.setFont(f);
     c.add(jpf);
     l5 = new JLabel("Enter Your Address");
     l5.setBounds(60, 210, 150, 20);
     l5.setForeground(Color.BLUE);
     l5.setFont(f);
     c.add(l5);
     jt1 = new JTextArea();
     jt1.setBounds(220, 210, 200, 60);
     jt1.setLineWrap(true);
     jt1.setFont(f);
     c.add(jt1);
     // ComboBox for language selection
     l7 = new JLabel("Select Your Coding Language");
     l7.setBounds(20, 290, 200, 20);
     l7.setFont(f);
     l7.setForeground(Color.BLUE);
     c.add(l7);
     String[] values = {"C", "C++", "Java", "Python"};
     jb1 = new JComboBox<>(values);
     jb1.setBounds(220, 290, 120, 20);
     jb1.setForeground(Color.BLACK);
     jb1.setFont(f);
     jb1.setSelectedIndex(2);// setSelectedIndex Method
     c.add(jb1);
   
     // Checkboxes for subjects
     ajp = new JCheckBox("AJP");
     jsp = new JCheckBox("JSP");
     cns = new JCheckBox("CNS");
     ajp.setBounds(220, 360, 60, 20);
     jsp.setBounds(280, 360, 60, 20);
     cns.setBounds(340, 360, 60, 20);
     ajp.setSelected(true); // Set Selected Method
     cns.setEnabled(false); // SetEnabled Method
     c.add(ajp);
     c.add(jsp);
     c.add(cns);

     // Submit button at the bottom
     b1 = new JButton("Submit");
     b1.setBounds(220, 470, 150, 30);
     b1.setForeground(Color.BLACK);
     b1.setFont(f);
     c.add(b1);
     l6 = new JLabel("Data submitted successfully! You Can Go Back");
     l6.setBounds(150, 510, 300, 30);
     l6.setForeground(Color.BLACK);
     l6.setFont(f);
     l6.setVisible(false);
     c.add(l6);
     // Adding ActionListener to the Submit Button
     b1.addActionListener(this); 
     
     setVisible(true);
     setTitle("Swing Components Example");
     setSize(700, 600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     }
     public void actionPerformed(ActionEvent e) 
     {
     if (e.getSource() == b1) 
     {
     l6.setVisible(true);
     }
     }
     public static void main(String args[]) 
     {
     new FormActionS();
     }
    }
    