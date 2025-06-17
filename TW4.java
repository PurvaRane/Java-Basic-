import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TW4 extends JFrameDe implements
        ActionListener {
    private JTextFieldDemo myJTextField;
    private JLabel myJLabel1, myJLabel2;
    int secretNumber;
    JButton myJButton;

    public TW4() {
        setLayout(null);
        setSize(600, 500);
        secretNumber = (int) (Math.random() * 2000 + 1);
        myJLabel1 = new JLabel("<html>I have a number between 20 and 2000. Can you guess my number?"
                + "<br>Please enter your first guess.</html>");
        myJLabel1.setBounds(100, 50, 400, 60);
        add(myJLabel1);
        myJTextField = new JTextFieldDemo();
        myJTextField.setBounds(230, 130, 100, 30);
        add(myJTextField);
        myJButton = new JButton("Lets see!");
        myJButton.setBounds(230, 170, 100, 30);
        myJButton.addActionListener(this);
        add(myJButton);
        myJLabel2 = new JLabel();
        myJLabel2.setBounds(250, 200, 200, 30);
        add(myJLabel2);
        setVisible(true);

        setDefaultCloseOperation(JFrameDe.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int number;
        try {
            number = Integer.parseInt(myJTextField.getText());
        } catch (NumberFormatException e) {
            myJLabel2.setText("Please enter valid input!");
            return;
        }
        if (myJButton.getLabel().equals("Play again")) {
            myJButton.setLabel("Lets see");
            myJTextField.setEditable(true);
        }
        if (number > secretNumber) {
            myJLabel2.setText("Too High!");
            getContentPane().setBackground(Color.GREEN);

            myJLabel2.setForeground(Color.WHITE);

            myJLabel1.setForeground(Color.WHITE);
        } else if (number < secretNumber) {
            myJLabel2.setText("Too Low!");
            getContentPane().setBackground(Color.ORANGE);

            myJLabel2.setForeground(Color.BLACK);

            myJLabel1.setForeground(Color.BLACK);
        } else {
            myJLabel2.setText("Correct!");
            myJButton.setLabel("Play again");
            secretNumber = (int) (Math.random() * 2000 + 1);
            myJTextField.setEditable(false);
            getContentPane().setBackground(Color.WHITE);

            myJLabel2.setForeground(Color.BLACK);

            myJLabel1.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new TW4();
    }
}