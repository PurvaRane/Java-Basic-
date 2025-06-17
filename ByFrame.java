import java.awt.*;
public class ByFrame extends Frame
{
    Button ok,cancel;
    ByFrame(String s)
    {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);
        ok=new Button("Ok");
        cancel=new Button("Cancel");
        ok.setBounds(50,50,50,50);
        cancel.setBounds(120,50,100,50);
        add(ok);
        add(cancel);
    }
    public static void main(String[] args) {
        ByFrame bf=new ByFrame("Demonstrating Frame");
    }
}
