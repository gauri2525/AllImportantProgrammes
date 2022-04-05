package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String S1= " India is Best";

        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();

        //adding string to char array
        char Array[]=S1.toCharArray();

        for (Character ch:Array){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }

        }

        //Set<Character> keys=hm.keySet();

        Set<Character> keys = hm.keySet();
        System.out.println(keys);
        for (Character ch1:keys){

            if (hm.get(ch1)>1){
                System.out.println(ch1+" is "+hm.get(ch1)+" times");
            }
        }

    }
}
