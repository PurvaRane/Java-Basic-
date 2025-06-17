import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm implements ActionListener {

    // Declare the components globally
    private JFrame frame;
    private JTextField nameField, ageField;
    private JComboBox<String> courseBox;
    private JRadioButton maleRadioButton, femaleRadioButton, otherRadioButton;
    private ButtonGroup genderGroup;
    private JButton submitButton;

    // Constructor to set up the GUI
    public StudentForm() {
        // Create the main frame
        frame = new JFrame("Student Information Form");

        // Set the layout
        frame.setLayout(new GridLayout(6, 2, 5, 5)); // Grid with 6 rows and 2 columns

        // Create and add labels and text fields for name and age
        frame.add(new JLabel("   Name:"));
        nameField = new JTextField(15);
        frame.add(nameField);

        frame.add(new JLabel("   Age:"));
        ageField = new JTextField(15);
        frame.add(ageField);

        // Create and add a combo box for courses
        frame.add(new JLabel("   Course:"));
        String[] courses = {"Computer Science", "Engineering", "Mathematics", "Physics", "Biology"};
        courseBox = new JComboBox<>(courses);
        frame.add(courseBox);

        // Create and add radio buttons for gender
        frame.add(new JLabel("   Gender:"));
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        otherRadioButton = new JRadioButton("Other");
        
        // Group the gender radio buttons
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        genderGroup.add(otherRadioButton);

        // Add the radio buttons to a panel
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        genderPanel.add(otherRadioButton);
        frame.add(genderPanel);

        // Create and add the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this); // Set the action listener
        frame.add(submitButton);

        // Set default operations and size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }

    // Action performed when the submit button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get data from the input fields
        String name = nameField.getText();
        String age = ageField.getText();
        String course = (String) courseBox.getSelectedItem();

        // Get the selected gender
        String gender = "";
        if (maleRadioButton.isSelected()) {
            gender = "Male";
        } else if (femaleRadioButton.isSelected()) {
            gender = "Female";
        } else if (otherRadioButton.isSelected()) {
            gender = "Other";
        }

        // Display the student details in a message dialog
        String message = "Student Information\n";
        message += "   Name: " + name + "\n";
        message += "   Age: " + age + "\n";
        message += "   Course: " + course + "\n";
        message += "   Gender: " + gender;

        JOptionPane.showMessageDialog(frame, message);
    }

    // Main method to run the GUI
    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(StudentForm::new);
    }
}

