package ImpJAVAprogrammes;

import java.util.Arrays;

//CallByValue means actual parameters will not get replace with formal parameters
//Ref below example:

public class CallByValue {
    static int a=5;
    static int b=10;

    public static void main(String[] args) {
        swapNumber(a ,b);  //actual parameters
        System.out.println("a = " + a + ", b = " + b);

    }

    public static void swapNumber( int x,int y) { // formal parameters
        int temp;
        temp = x;
        x=y;
        y=temp;

        System.out.println("x = " + x + ", y = " + y);

    }
}
