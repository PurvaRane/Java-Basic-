import java.awt.*;
// class to construct a frame and containing main method
 public class CanvasExample
 { // setTitle("Canvas");
 CanvasExample()
 { // creating a frame
 Frame f = new Frame("Canvas,Scrollbar, Menu, MenuItem...");
 // adding canvas to frame
 f.add(new MyCanvas());
 // creating a scroll bar
 Scrollbar s = new
Scrollbar(Scrollbar.HORIZONTAL);
 s.setBounds (10, 210, 200, 50);
Button b=new Button("button on canvas");
 b.setBounds(350,250,50,50);
 MenuBar mb=new MenuBar();
 Menu menu=new Menu("Menu");
 Menu submenu=new Menu("Sub Menu");
 MenuItem i1= new MenuItem("Item 1");
 MenuItem i2= new MenuItem("Item 2");
 MenuItem i3= new MenuItem("Item 3");
 MenuItem i4= new MenuItem("Item 4");
 MenuItem i5= new MenuItem("Item 5");
 menu.add(i1);
 menu.add(i2);
 menu.add(i3);
 submenu.add(i4);
 submenu.add(i5);
 menu.add(submenu);
 mb.add(menu);
 f.setMenuBar(mb);
 f.add(s); f.add(b);
 f.setLayout(null);
 f.setSize(700, 700);
 f.setVisible(true);
 }

 // main method
 public static void main(String args[])
 {
 new CanvasExample();
 }

 class MyCanvas extends Canvas
 { // class constructor
 public MyCanvas()
 { setBackground (Color.GREEN);
 setSize(300, 200);
 }
 // paint() method to draw inside the canvas
 public void paint(Graphics g)
 { // adding specifications
 g.setColor(Color.YELLOW);
 g.fillOval(375, 375, 150, 75);

 }
 }
}