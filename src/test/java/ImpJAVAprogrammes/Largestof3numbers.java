package ImpJAVAprogrammes;

import java.util.Arrays;

public class Largestof3numbers {
    public static void main(String[] args) {

        int a= 10;
        int b= 15;
        int c= 10;

        //Approach 1: using logic
        if (a>b && a>c){
            System.out.println("a is the largest number");
        }
        if (b>a && b>c){
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("c is the largest number");
        }

        //Approach 2: using Ternary operator ( eg: a>b?a:b)

        int largest= a>b?a:b;
        largest=c>largest?c:largest;

        System.out.println("The largest number is "+ largest);
    }
}
