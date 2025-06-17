import java.awt.*;
import java.awt.event.*;

public class AWTRegistrationForm extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField tfName, tfEmail, tfPassword;
    CheckboxGroup genderGroup;
    Checkbox male, female, other;
    Button submit;

    AWTRegistrationForm() {
        // Labels
        l1 = new Label("Name:");
        l1.setBounds(50, 100, 100, 30);
        l2 = new Label("Email:");
        l2.setBounds(50, 150, 100, 30);
        l3 = new Label("Password:");
        l3.setBounds(50, 200, 100, 30);
        l4 = new Label("Gender:");
        l4.setBounds(50, 250, 100, 30);
        l5 = new Label("Registration Form");
        l5.setBounds(150, 50, 200, 30);
        l5.setFont(new Font("Arial", Font.BOLD, 18));

        // TextFields
        tfName = new TextField();
        tfName.setBounds(200, 100, 150, 30);
        tfEmail = new TextField();
        tfEmail.setBounds(200, 150, 150, 30);
        tfPassword = new TextField();
        tfPassword.setBounds(200, 200, 150, 30);
        tfPassword.setEchoChar('*');

        // Gender selection using CheckboxGroup
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        male.setBounds(200, 250, 50, 30);
        female = new Checkbox("Female", genderGroup, false);
        female.setBounds(260, 250, 60, 30);
        other = new Checkbox("Other", genderGroup, false);
        other.setBounds(330, 250, 60, 30);

        // Submit Button
        submit = new Button("Submit");
        submit.setBounds(150, 320, 100, 30);
        submit.addActionListener(this);

        // Adding components to the frame
        add(l1); add(tfName);
        add(l2); add(tfEmail);
        add(l3); add(tfPassword);
        add(l4); add(male); add(female); add(other);
        add(l5); add(submit);

        // Frame properties
        setSize(450, 450);
        setTitle("AWT Registration Form");
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            System.out.println("Name: " + tfName.getText());
            System.out.println("Email: " + tfEmail.getText());
            System.out.println("Password: " + tfPassword.getText());
            System.out.println("Gender: " + genderGroup.getSelectedCheckbox().getLabel());
        }
    }

    public static void main(String[] args) {
        new AWTRegistrationForm();
    }
}
