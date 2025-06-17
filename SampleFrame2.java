import java.awt.*;
public class SampleFrame2 extends Frame 
{
    SampleFrame2(String title)
    {
        super(title);
    }
}
    class FileDialogDemo
    {
        public static void main(String[] args) 
        {
        Frame f = new SampleFrame2("File Dialog Demo");
        f.setVisible(true);
        f.setSize(100,100);
        FileDialog fd = new FileDialog( f,"File Dialog");
        fd.setVisible(true);
        }

    }

