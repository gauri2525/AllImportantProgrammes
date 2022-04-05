package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class Reversenumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the number");
        int num= sc.nextInt();

        //int rev=0;

        //Approach 1 :
        /*while (num !=0){
            rev = rev*10 + num%10;
            num= num/10;

        }
        System.out.println("reverse number is "+ rev);
*/

      // Approach 2:Using String Buffer class

       /* StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("reverse number is "+ rev);*/

        // Approach 3: Using String builder class

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev= sbl.reverse();
        System.out.println("reverse number is "+ rev);




    }
}
