import javax.swing.JOptionPane;

public class SmallestWithoutIf {
    public static void main(String args[]){
       
        String s = JOptionPane.showInputDialog(null,"Enter a : ");
        int a = Integer.parseInt(s);
        String s1 = JOptionPane.showInputDialog(null,"Enter b : ");
        int b = Integer.parseInt(s1);
        String s2 = JOptionPane.showInputDialog(null,"Enter c : ");
        int c = Integer.parseInt(s2);
         
        int smallNum = ((a<b&&a<c)?a:(b<c&&b<a)?b:c);
        System.out.println("Smallest Number : "+smallNum);
    }
}
