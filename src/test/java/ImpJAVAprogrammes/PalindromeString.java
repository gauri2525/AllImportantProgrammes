package ImpJAVAprogrammes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the string");
        String SC1= sc.next();
        String rev= "";
        int len= SC1.length();

        for (int i=len-1;i>=0;i--){
            rev=rev+SC1.charAt(i);

        }
        System.out.println("Reverse string is "+ rev);

        if (SC1.equalsIgnoreCase(rev)){
            System.out.println("Given string is Palindrome string");
        }
        else
        {
            System.out.println("Given string is not Palindrome string");
        }

    }
}
