package TestNgDemo;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String s1= "JAVA";

        char Array[]=s1.toCharArray();

        HashMap<Character,Integer> hm= new HashMap<>();

        for (Character ch:Array){
            if(hm.containsKey(ch)){
                hm.put(ch , hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }

        Set<Character> keys = hm.keySet();
        for(Character key:keys) {
            if (hm.get(key) > 1) {
                System.out.println(key + " is" + hm.get(key) + " times");
            }
        }



    }
}
