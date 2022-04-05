package ImpJAVAprogrammes;

import java.util.Locale;

public class tOOGLEeachword {


    public static void main(String[] args) {

        String str= "my name is gauri";

        String Array[]= str.split("\\s");

        String toogle="";

        for (String word:Array){
            String firstletter=word.substring(0,1);
            String afterletters=word.substring(1);
            String toggle=firstletter+afterletters.toUpperCase(Locale.ROOT)+" ";
            System.out.print(toggle);


        }
    }
}
