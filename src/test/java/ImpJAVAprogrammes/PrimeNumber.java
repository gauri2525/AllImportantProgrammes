package ImpJAVAprogrammes;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {

        int num= 4;
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
