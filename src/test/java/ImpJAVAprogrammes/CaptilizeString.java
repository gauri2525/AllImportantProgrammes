package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Locale;

public class CaptilizeString {

    public static void main(String[] args) {

        String str= "my name is gauri";

        String Array[]= str.split("\\s");

        String capitalizeWord="";

        for(String word:Array){

            String firstletter=word.substring(0,1);
            String afterfirstletter=word.substring(1);
            capitalizeWord=firstletter.toUpperCase(Locale.ROOT)+afterfirstletter+" ";
            System.out.print(capitalizeWord);


        }


    }
}
