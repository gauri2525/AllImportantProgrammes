package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Locale;

public class StringFunctions {

    public static void main(String[] args) {

        String str= " Hello Word ";  // String literal
        String str1= "Selenium&JAVATraining";

        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("l"));
        System.out.println(str.substring(5)); // word
        System.out.println(str.substring(3,6));
        System.out.println(str.concat(" test SELENIUM "));
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        String[] array =str1.split("&");
        System.out.println(array[0]);
        System.out.println(array[1]);
        for (String s1:array){
            System.out.println(s1);
        }
        System.out.println(str1.replace("&"," and "));




    }
}
