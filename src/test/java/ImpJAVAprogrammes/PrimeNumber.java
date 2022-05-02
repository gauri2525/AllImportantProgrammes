package ImpJAVAprogrammes;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {

        /*a whole number greater than 1 that cannot be exactly divided by any whole number other
        than itself and 1 (e.g. 2, 3, 5, 7, 11).*/

        int num= 5;
        int count = 0;

        if(num>1){
            for (int i=1; i<=num;i++) {
                if (num % i == 0)
                    count++;
            }
                if (count==2){
                    System.out.println("Given number is Prime number");
                }
                else{
                    System.out.println("Given number is not Prime number");
                }

            }
        else
        {
            System.out.println("Given number is not prime");
        }


    }
}
