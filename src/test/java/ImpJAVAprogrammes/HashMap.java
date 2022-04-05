package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        java.util.HashMap<Integer,String> hm= new java.util.HashMap<>();

        hm.put(100,"Gauri");
        hm.put(101,"Gauri");
        hm.put(101,"Supriya");
        hm.put(102,"");
        hm.put(0,"testnullkey");
        hm.put(103,"Sophia");
        hm.put(104,"Santa");

        for( Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }


    }
}
