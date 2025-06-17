public class Pattern3 {
    public static void main(String[] args) {
//           1
//         1 2 3 
//       1 2 3 4 5 
//     1 2 3 4 5 6 7 
//   1 2 3 4 5 6 7 8 9 

 int n = 5;
 int z = 1;

 for(int i = 0;i<n;i++){ //4<5
   
    for(int j = n-1;j>i;j--){ //j = 4 ;4>5 
        System.out.print(" ");
    }
    for(int k = 1;k<=z;k++){ //k=1   1<=9; 
        System.out.print(k);
    }
    z = z+2; //9
    System.out.println();
 }
    }
}
