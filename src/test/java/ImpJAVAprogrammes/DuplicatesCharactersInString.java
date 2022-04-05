package ImpJAVAprogrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharactersInString {

    public static void main(String[] args) {

        printDuplicateCharacters("Supriya");
        printDuplicateCharacters("Supriya aaassuu");
        printDuplicateCharacters("S");
        printDuplicateCharacters("");
        printDuplicateCharacters("  ");

    }

    public static void printDuplicateCharacters(String str){

        //Check prior conditions
        if (str==""){
            System.out.println("string is null");
        }
        if (str.isEmpty()) {
            System.out.println("string is empty");
        }
        if (str.length()==1) {
            System.out.println("single char string");
        }

        //Convert string to char array
        char words[] = str.toCharArray();

        //created char map to add characters with its occurance
        Map<Character,Integer> charMap= new HashMap<Character, Integer>();

        for (Character ch:words){
            if (charMap.containsKey(ch)){
              charMap.put(ch, charMap.get(ch)+1);

            }
            else{
               charMap.put(ch,1);
            }

            //Print the map
            Set<Map.Entry<Character,Integer>> entrySet=charMap.entrySet();

            for (Map.Entry<Character,Integer> entry:entrySet){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey()+":"+entry.getValue());
                }

            }

        }
    }



    }


