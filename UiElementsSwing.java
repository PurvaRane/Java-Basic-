import javax.swing.*;
import java.awt.*;

public class UiElementsSwing extends JFrame {
    UiElementsSwing() {
        // Setting up the frame
        setTitle("Swing UI Example");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Adding JLabel
        JLabel label = new JLabel("AJP");
        label.setBounds(50, 50, 90, 30);
        add(label);

        // Adding JTextField
        JTextField textField = new JTextField("Hello");
        textField.setBounds(160, 50, 90, 30);
        add(textField);

        // Adding JCheckBox
        JCheckBox cb1 = new JCheckBox("AJP", true);
        cb1.setBounds(50, 100, 100, 30);
        JCheckBox cb2 = new JCheckBox("JSP");
        cb2.setBounds(150, 100, 100, 30);
        JCheckBox cb3 = new JCheckBox("OS");
        cb3.setBounds(250, 100, 100, 30);
        add(cb1);
        add(cb2);
        add(cb3);

        // Adding JRadioButton with ButtonGroup
        JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBounds(50, 150, 100, 30);
        JRadioButton rbFemale = new JRadioButton("Female", true);
        rbFemale.setBounds(150, 150, 100, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        add(rbMale);
        add(rbFemale);

        // Adding JList
        String[] courses = {"CS", "IT", "INSTRU"};
        JList<String> courseList = new JList<>(courses);
        courseList.setBounds(50, 200, 80, 60);
        add(courseList);

        // Adding JComboBox
        String[] subjects = {"AJP", "CNS", "JSP"};
        JComboBox<String> comboBox = new JComboBox<>(subjects);
        comboBox.setBounds(150, 200, 80, 30);
        add(comboBox);

        // Adding JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 300, 100, 70);
        add(textArea);

        // Adding JMenuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem closeItem = new JMenuItem("Close");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(closeItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Setting frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the frame on the Event Dispatch Thread
        SwingUtilities.invokeLater(UiElementsSwing::new);
    }
}
