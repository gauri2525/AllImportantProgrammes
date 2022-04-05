package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Scanner;

public class Scannerclass {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");

        int num=sc.nextInt();
        int num1=num++;

        //System.out.println("Next number of given number is "+ (num+1));

        System.out.println("Next number of given number is "+ num);

    }
}
