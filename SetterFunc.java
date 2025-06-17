
    class Rectangle{
        private int length , breadth ;
        public void area(){
            System.out.println("Area of Rectangle : "+(length*breadth));
        }
        public void permiter(){
            System.out.println("Perimeter of Rectangle : "+(2*(length+breadth)));
        }
        public void setDimention(int m , int n){
            length = m;
            breadth = n;
        }
    }
    public class SetterFunc {
        public static void main(String[] args) {
            Rectangle a ,b;
            a = new Rectangle();
            b = new Rectangle();
            a.setDimention(6, 7);
            b.setDimention(5, 4);
            a.area();
            a.permiter();
            b.area();
            b.permiter();
        }
    }
    

