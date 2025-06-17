/*
 Name: Avdhoot Anil Choudhari
 PRN No: 2030408245065
 Roll No: 22014819
 Title: Java Game using Swing components
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
import java.util.random.*;

public class Game {
     public static void main(String args[]) {
          JFrameDe f = new JFrameDe();

          JLabel l = new JLabel("Guess the Number");
          l.setBounds(180, 20, 150, 50);
          f.add(l);

          JLabel la1 = new JLabel("I have a number between 20 and 2000. Can you guess my number ?");
          la1.setBounds(30, 70, 400, 30);
          f.add(la1);

          JLabel la2 = new JLabel("Please enter your guess");
          la2.setBounds(150, 100, 150, 30);
          f.add(la2);

          JTextFieldDemo t = new JTextFieldDemo();
          t.setBounds(180, 130, 80, 30);
          f.add(t);

          JButton b = new JButton("Check");
          b.setBounds(170, 180, 100, 40);
          f.add(b);

          JLabel la3 = new JLabel();
          la3.setBounds(180, 240, 150, 50);

          JPanel p = new JPanel();
          p.setBounds(140, 240, 170, 30);
          f.add(p);
          p.add(la3);

          JButton b1 = new JButton("Try again");
          b1.setBounds(170, 290, 100, 50);
          f.add(b1);

          JLabel la4 = new JLabel("Attempt no :");
          la4.setBounds(20, 340, 150, 50);
          f.add(la4);

          Random r = new Random();

          b.addActionListener(new ActionListener() {
               int B = 1;

               public void actionPerformed(ActionEvent e) {
                    String a = t.getText();
                    int c = r.nextInt(15, 2001);
                    int a1 = Integer.parseInt(a);
                    if (a1 == c) {
                         la3.setText("Wow !!!");
                         f.getContentPane().setBackground(Color.green);
                    } else if (a1 < c) {
                         la3.setText("Too Low");
                         f.getContentPane().setBackground(Color.yellow);
                    } else if (a1 > c) {
                         la3.setText("Too High");
                         f.getContentPane().setBackground(Color.red);
                    }
                    t.setEditable(false);
                    // la1.setText("c = "+c);
                    la4.setText("Attempt no : " + B);
                    B = B + 1;
               }
          });

          b1.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                    t.setEditable(true);
               }
          });

          f.setSize(500, 500);
          f.setLayout(null);
          f.setVisible(true);
     }
}