package ImpJAVAprogrammes;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

    public static  void main(String[] args) {

        LinkedHashSet<Object> lhs= new LinkedHashSet();
        lhs.add("sups");
        lhs.add("null");
        lhs.add("sups");  // this object will be ignored
        lhs.add("gauri");
        lhs.add(123);

        System.out.println(lhs);


    }
}
