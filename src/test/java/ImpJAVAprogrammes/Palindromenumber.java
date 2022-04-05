package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class Palindromenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number");
        int num= sc.nextInt();
        int org_num=num;
        int rev = 0;

        while (num!=0){
            rev= rev*10+num%10;
            num= num/10;
        }
        System.out.println("Reverse number is" + rev);

        if (org_num==rev){
            System.out.println("Given number is Palindrome number");
        }
        else
        {
            System.out.println("Given number is not Palindrome number");
        }


    }
}
