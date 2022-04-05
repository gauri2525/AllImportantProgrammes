package ImpJAVAprogrammes;

import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet ts= new TreeSet(); // Default sorting order
        ts.add("Sups");
        ts.add("Sups"); // This won't get inserted
        //ts.add(123.67);
        ts.add("test123");
        ts.add("123add");

        System.out.println(ts);   /// will display object in default sorting orders

        TreeSet ts1= new TreeSet(new ClassA()); // Coustmaized sorting order
        ts1.add("Sups");
        ts1.add("Sups"); // This won't get inserted
        //ts.add(123.67);
        ts1.add("test123");
        ts1.add("123add");

        System.out.println(ts1);   /// will display object in Coustmaized sorting orders


    }
}
