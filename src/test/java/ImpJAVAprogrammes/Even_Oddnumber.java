package ImpJAVAprogrammes;

import java.util.Arrays;

public class Even_Oddnumber {

    public static void main(String[] args) {

        int num= 12345;
        int even_num=0;
        int odd_num=0;

        while (num>0){
            int reminder= num%10;
            if (reminder%2==0){
                even_num++;
            }
            else{
                odd_num++;
            }
           num = num/10;

        }
        System.out.println("Total even numbers are " + even_num + "& total odd numbers are "+ odd_num );

        int num1=3;
        if (num1%2==0){
            System.out.println(num1 + " is even number");
        }
        else{
            System.out.println(num1 + " is odd number");

        }


    }
}
