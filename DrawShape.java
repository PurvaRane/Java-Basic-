
/*
 * Name:Sneha Sunil Patil
 * PRN No;2030408245050
 * Roll No: 2201824
 * Title: Event handling in Java 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawShapes extends JPanel implements MouseListener {
    int x, y, x1, y1;

    DrawShapes() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapes(g, x, y, x1, y1);
    }

    int shape = 0;

    public void pressC() {
        shape = 0;
    }

    public void pressR() {
        shape = 1;
    }

    public void pressL() {
        shape = 2;
    }

    public void pressO() {
        shape = 3;
    }

    public void shapes(Graphics g, int x, int y, int x1, int y1) {
        if (shape == 0) {
            g.drawOval(Math.min(x, x1), Math.min(y, y1), Math.abs(x - x1), Math.abs(x - x1));
        } else if (shape == 1) {
            g.drawRect(x, y, Math.abs(x - x1), Math.abs(y - y1));
        } else if (shape == 2) {
            g.drawLine(x, y, x1, y1);
        } else if (shape == 3) {
            g.drawOval(x, y, Math.abs(x - x1), Math.abs(y - y1));

        }
    }

}

class AJP2 extends JFrameDe implements KeyListener {
    public DrawShapes draw;
    JLabel l = new JLabel();

    AJP2() {
        this.draw = new DrawShapes();
        l.setText("Circle.");
        setTitle("Draw Shapes.");
        add(l, BorderLayout.SOUTH);
        setSize(400, 400);
        addKeyListener(this);
        setDefaultCloseOperation(JFrameDe.EXIT_ON_CLOSE);
        getContentPane().add(this.draw);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        char k = e.getKeyChar();
        char[] kid = new char[] { 'c', 'C', 'o', 'O', 'r', 'R', 'l', 'L' };

        if (k == kid[0] || k == kid[1]) {
            draw.pressC();
            l.setText("Circle.");
        } else if (k == kid[2] || k == kid[3]) {
            draw.pressO();
            l.setText("Oval.");
        } else if (k == kid[4] || k == kid[5]) {
            draw.pressR();
            l.setText("Rectangle.");
        } else if (k == kid[6] || k == kid[7]) {
            draw.pressL();
            l.setText("Line.");
        } else {
            JOptionPane.showMessageDialog(this, "Wrong key Pressed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AJP2();

    }
}