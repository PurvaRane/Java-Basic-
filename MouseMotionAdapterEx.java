import java.awt.event.*;
import java.awt.*;
public class MouseMotionAdapterEx extends MouseMotionAdapter 
{
    Frame f;
    MouseMotionAdapterEx()
    {
        f= new Frame(" MouseMotionAdapter");
        f.addMouseMotionListener(this);
        f.setLayout(null);
        f.setSize(800,600);
        f.setVisible(true);
        TextField tf= new TextField("Dilesh Or Mayuu");
        f.add(tf);
        Button bt=new Button("Click Here");
        f.add(bt);
    }   
    public void mouseDragged(MouseEvent e){
        Graphics g =f.getGraphics();
        g.setColor(Color.MAGENTA);
        g.fillOval(e.getX(),e.getY(),30,40);
    }
    public static void main(String[] args) {
        new MouseMotionAdapterEx();
    }
}
