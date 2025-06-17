import java.util.Scanner;

class CalculateAreaOfTraingle{
public static void main(String[] args) {
AreaOfTraingle at = new AreaOfTraingle(5, 6);
at.setBase(7);
at.setHeight(9);
at.getHeight();
at.getBase();
at.areaTriangle();


}
}
class AreaOfTraingle{
    int height;
    int base;
public  AreaOfTraingle(){

    }
    public AreaOfTraingle(int height,int base){
        this.height = height;
        this.base = base;

    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setBase(int base){
        this.base = base;

    }
    public int getHeight(){
        return height;
    }
    public int getBase(){
        return base;
    }
    public double areaTriangle(){
        double area;
        area = 0.5*base*height;
        System.out.println(area);
        return area;

    }
}

//revise the code