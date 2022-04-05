package ImpJAVAprogrammes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Removeduplicates {

    public static void main (String []args){

        List<String> values = new ArrayList<>();
        values.add("JAVA");
        values.add("Ruby");
        values.add("Python");
        values.add("JAVA 1");
        values.add("JAVA");

        Set<String> removeduplicates = new HashSet<>();
        removeduplicates.addAll(values);

        for (String S: removeduplicates){

            System.out.println(S);


        }

        System.out.println(values.size());
        System.out.println(removeduplicates.size());


    }

}
