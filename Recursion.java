import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string-->");
        String str1 = sc.nextLine();

        // Finding number of 'a' in string
        int len = str1.length();
        int count = 0;
        int vowels = 0;
        String revString = "";
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'A') {
                count++;
                vowels++;
            } else if (str1.charAt(i) == 'e' || str1.charAt(i) == 'E') {
                vowels++;
            } else if (str1.charAt(i) == 'i' || str1.charAt(i) == 'I') {
                vowels++;
            } else if (str1.charAt(i) == 'o' || str1.charAt(i) == 'O') {
                vowels++;
            } else if (str1.charAt(i) == 'u' || str1.charAt(i) == 'U') {
                vowels++;
            }
        }
        System.out.println("There are intotal " + count + "a characters in the giveen string.");
        System.out.println("There are intotal " + vowels + "in the giveen string.");

        // Reversing in a String
        for (int i = len - 1; i >= 0; i--) {
            char ch = str1.charAt(i);
            revString += ch;
        }
        System.out.println("The reversed string of given string " + revString);
    }
}
