package ImpJAVAprogrammes;

import java.util.Arrays;

public class CallByreference {

    static int a =5;
    static int b=10;

    public static void main(String[] args) {
        CallByreference objref=new CallByreference();
        swapNumber(objref);
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void swapNumber(CallByreference objref1){
        int temp;
        temp=objref1.a;
        objref1.a=objref1.b;
        objref1.b=temp;


    }
}
