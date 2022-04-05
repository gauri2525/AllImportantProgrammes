package ImpJAVAprogrammes;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String str1 = "Peek";
        String str2 = "Keep";
        //boolean status= true;

        // remove space from the strings
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        //System.out.print(s1+" "+s2);

        //compare lenghts of the strings
        if (s1.length() != s2.length()) {
            //status =false;
            System.out.print("two strings are not Anagrams since lengths are not matching");
        } else {
            //add string into char array
            char Arrays1[] = s1.toLowerCase().toCharArray();
            char Arrays2[] = s2.toLowerCase().toCharArray();

            //Now sort both char Arrays
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);

            //Now compare both sorted Arrays
            if (Arrays.equals(Arrays1, Arrays2)) {
                System.out.print("two strings are anagram");
            } else {
                System.out.print("two strings are not anagram");
            }


        }

    }}

