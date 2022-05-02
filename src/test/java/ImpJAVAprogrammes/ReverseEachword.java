package ImpJAVAprogrammes;

import java.util.Arrays;

public class ReverseEachword {

    public static void main(String[] args) {


        String str= "my name is gauri";
        String eachword[]=str.split("\\s");
        String reverseword="";



        for(String word:eachword){

            StringBuilder sb=new StringBuilder(word);
             sb.reverse();
            reverseword=sb.toString()+" ";
            System.out.print(reverseword);
        }













    }



}
