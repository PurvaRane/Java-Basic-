    

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Term5 extends JFrame {
    private int targetNumber;
    private int numberOfGuesses;
    private JLabel promptLabel;
    private JTextField inputField;
    private JButton submitButton;
    private JButton playAgainButton;

    public Term5() {
        // Set up the JFrame
        setTitle("Guess the Number Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize variables
        startNewGame();

        // Create and add components
        promptLabel = new JLabel("I have a number between 1 to 1000. Can you guess my number?");
        add(promptLabel);

        inputField = new JTextField(10);
        add(inputField);

        submitButton = new JButton("Submit Guess");
        add(submitButton);

        playAgainButton = new JButton("Play Again");
        playAgainButton.setEnabled(false);
        add(playAgainButton);

        // Add action listeners to the buttons
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });
    }

    private void startNewGame() {
        targetNumber = new Random().nextInt(1000) + 1; // Random number between 1 and 1000
        numberOfGuesses = 0;
        inputField.setEditable(true);
        submitButton.setEnabled(true);
        playAgainButton.setEnabled(false);
        getContentPane().setBackground(null);
        promptLabel.setText("I have a number between 1 to 1000. Can you guess my number?");
        inputField.setText("");
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(inputField.getText());
            numberOfGuesses++;

            if (guess == targetNumber) {
                inputField.setEditable(false); 
                submitButton.setEnabled(false);
                playAgainButton.setEnabled(true);
                promptLabel.setText("Congratulations! You guessed the number in " + numberOfGuesses + " attempts.");
                getContentPane().setBackground(Color.GREEN);
            } else if (Math.abs(guess - targetNumber) <= 10) {
                promptLabel.setText("Getting warmer. Try again.");
                getContentPane().setBackground(Color.RED);
            } else {
                promptLabel.setText("Getting colder. Try again.");
                getContentPane().setBackground(Color.BLUE);
            }
        } catch (NumberFormatException ex) {
            promptLabel.setText("Please enter a valid number.");
        }
        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Term5 game = new Term5();
                game.setVisible(true);
            }
        });
    }
}
