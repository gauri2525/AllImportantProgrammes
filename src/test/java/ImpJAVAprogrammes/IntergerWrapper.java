package ImpJAVAprogrammes;

import java.util.Arrays;

public class IntergerWrapper {

    public static void main(String[] args) {

        String s="100";

        String s1= "500.50";

        String s2 = "true";

        String s3= "1000ABC";

        String s4=s3.substring(0,4);

        int a = Integer.parseInt(s);
        double d= Double.parseDouble(s1);
        boolean b=Boolean.parseBoolean(s2);
        //int e = Integer.parseInt(s3);
        int f = Integer.parseInt(s4);

        System.out.println(a+45);
        System.out.println(d+45);
        System.out.println(b);
        //System.out.println(e);
        System.out.println(f);



    }
}
