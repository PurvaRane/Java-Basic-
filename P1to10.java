public class P1to10 {
    public static void main(String[] args) {
        System.out.println("By for loop");
        for(int i = 1;i<=10;i++)
        System.out.println(i);

        System.out.println("By while loop");
        int i = 1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("By Do while loop");
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);
    }
}
