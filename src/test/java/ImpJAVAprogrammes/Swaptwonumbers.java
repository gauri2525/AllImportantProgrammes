package ImpJAVAprogrammes;

import java.util.Arrays;

public class Swaptwonumbers {

    public static void main (String []args) {

        int a = 5, b = 10;

        System.out.println("Values before swapping are " + a + " "+ b);

// Logic1 : using third variable
        /*int z =a;
        a=b;
        b=z;

        System.out.println("values after swapping are " + a +" "+b);*/

 // Logic2 : without using third variable


       /* a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("values after swapping are " + a +" "+b);*/

        //Logic 3: using * & / operators , make sure numbers are not zero

        /*a= a*b;
        b= a/b;
        a= a/b;
        System.out.println("values after swapping are " + a +" "+b);*/

        //Logic 4 : using single expression
        b= a+b -(a=b);
        System.out.println("values after swapping are " + a +" "+b);

    }

}
