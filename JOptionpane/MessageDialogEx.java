
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MessageDialogEx  {

        JFrame f;
        MessageDialogEx(){
            f=new JFrame();
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(f,"Do you want to close?","question",JOptionPane.QUESTION_MESSAGE);

        }
        public static void main(String[] args) {
            new MessageDialogEx();
        }
    }
