import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame
{
    private int secret;
    JFrame f;
    JLabel l1,l2,l3,l4;
    JTextField tf;
    JButton b,b1;
    
    GuessingGame(){


 f= new JFrame("Guessing Game");
 
 secret = new Random().nextInt(1000)+1;

 l1 = new JLabel("I have a number between 1 to 1000, can you guess my number??");
 l1.setBounds(50,20,500,30);
 f.add(l1);

 l2 = new JLabel("Please enter your guess number");
 l2.setBounds(50,60,200,30);
 f.add(l2);

 tf = new JTextField();
 tf.setBounds(280,60,100,30);
 f.add(tf);

 b= new JButton("Check");
 b.setBounds(50,100,100,30);
 f.add(b);

 l3 = new JLabel();
 l3.setBounds(250,100,250,30);

 b.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b)
        {
            String str = tf.getText();
            int guess = Integer.parseInt(str);

            if(guess < 0 || guess > 1000)
            {
                l3.setText("please Enter the number between 1 to 1000");
                f.getContentPane().setBackground(Color.PINK);
            }
            else if (guess < secret)
            {
                l3.setText("Guess is to low, try higher..");
                f.getContentPane().setBackground(Color.BLUE);
            }
            else if(guess > secret)
            {
                l3.setText("Guess is to high, try lower..");
                f.getContentPane().setBackground(Color.RED);
            }
            else if(guess == secret)
            {
                l3.setText("Congratulations.. you guessed it right..!!");
                f.getContentPane().setBackground(Color.GREEN);
            }
        }
        l4.setText(" ");
    }
 });

 f.add(l3);

 b1 = new JButton( "New Game");
 b1.setBounds(50,150,100,30);
 f.add(b1);

 l4= new JLabel();
 l4.setBounds(220,150,150,30);

 b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e ){
        secret = new Random().nextInt(1000)+1;
        tf.setText(" ");
        l3.setText(" ");
        f.getContentPane().setBackground(null);
        l4.setText(" new Game Started...");
    }
 });
 f.add(l4);

 f.setSize(600,300);
 f.setLayout(null);
 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 f.setVisible(true);
}
public static void main(String[] args) {
    new GuessingGame();
}
}

