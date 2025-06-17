import java.awt.*;
import java.awt.event.*;
public class MouseAdapterEx extends MouseAdapter
{
    Frame f;
    MouseAdapterEx()
    {
        f= new Frame("MouseAdapter ");
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
        f.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        Graphics g=f.getGraphics();
        g.setColor(Color.PINK); 
        g.fillOval(e.getX(), e.getY(), 20, 50);
    }

    public static void main(String[] args) {
        new MouseAdapterEx();
    }
}
