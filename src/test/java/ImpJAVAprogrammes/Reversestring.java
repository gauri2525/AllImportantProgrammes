package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class Reversestring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the string");
        String SC1= sc.next();
        String rev= "";


        //Approch 1: Using String concatenation

        /*for ( int i = SC1.length()-1; i >=0; i--){
         rev = rev+SC1.charAt(i);
        }

        System.out.println("Reverse string is : " + rev);*/

        //Approch 2: Using CharArray

     /*   char a[]= SC1.toCharArray();
        int len = SC1.length();

        for (int i = len-1; i>=0;i --){
            rev= rev+a[i];

        }
        System.out.println("Reverse string is : " + rev);*/

        //Approch 3: using StringBuffer class

        StringBuffer SB = new StringBuffer(SC1);
        rev = rev+SB.reverse();
        System.out.println("Reverse string is : " + rev);

    }
}
