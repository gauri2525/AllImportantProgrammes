package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {

    public static void main(String[] args) {

        Hashtable<Integer,String> hm = new Hashtable<Integer, String>();
        hm.put(100,"Gauri");
        hm.put(101,"Gauri");
        hm.put(101,"Supriya");
        hm.put(102,"");
        hm.put(0,"testnullkey");
        hm.put(103,"Sophia");
        hm.put(104,"Santa");



        //print value set of hashtable
         for (Map.Entry m: hm.entrySet()){
             System.out.println(m.getKey()+":"+m.getValue());
         };






    }
}
