package ImpJAVAprogrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddingElementsintoArray {

    public static void main(String[] args) {

        String Array[]={"a","b","test","as","a","test","w","qq"};


        //Method 1
        List<String> list=new ArrayList<String>();
        Collections.addAll(list, Array);
        System.out.println("Method1--Array elements are" + list);

        //Method2
        List<String> list1=Arrays.asList(Array);
        System.out.println("Method2--Array elements are" + list1);

        //Method3
        List<String> list2= new ArrayList<String>();

        for(String element:Array){
            list2.add(element);

        }

        System.out.println("Method3--Array elements are" + list2);

    }
}
