package ImpJAVAprogrammes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;


public class DuplicatecharactersinString {

    public static void main(String[] args) {
        String s1= "JAVA";
        HashMap<Character,Integer> hm= new HashMap<>();

        //converting string to charArray
        char Array1[]= s1.toCharArray();

        for(Character ch:Array1){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
           else{
               hm.put(ch ,1);
            }

           //get keyset value from the Map
            Set<Character> keyset = hm.keySet();

            for ( Character keys : keyset){
                if(hm.get(keys)>1){
                    System.out.println(keys +" is "+hm.get(keys) +" times");
                }
            }

    }



    }




}
