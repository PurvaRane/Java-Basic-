/* 1. declare first value to the 1st variable 
 * 2. declare second value to the 2nd variable 
 * 3.declare third variable to store the sum 
 * 4. print the sum 
 */

import java.util.Scanner;

class Add{
    public static void main (String[] args){
       
        Scanner Num = new Scanner(System.in);
        System.out.println("Enter binary number:");
        int binaryVariable1 = Num.nextInt();
        System.out.println("Enter binary number:");
        int binaryVariable2 = Num.nextInt();

        int sum = binaryVariable1+binaryVariable2;
        System.out.println(Integer.toBinaryString(sum)); //toBinaryString
    }
}