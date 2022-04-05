package ImpJAVAprogrammes;

import java.util.Arrays;

public class SumofDigits {

    public static void main(String[] args) {

        //Number = 12345 , Sum= 15

        int num= 12345;
        int sum=0;

        while (num>0){
            sum= sum+num%10;
            num=num/10;
        }

        System.out.println("Sum of digits in a number is "+ sum);
    }
}
