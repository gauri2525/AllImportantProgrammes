package ImpJAVAprogrammes;

import java.util.Arrays;

public class ReverseEachword {

    public static void main(String[] args) {


        String str= "my name is gauri";
        String eachword[]=str.split("\\s");
        String reverseword="";
        String reverseword1="";

        for(String word:eachword){

            StringBuilder sb=new StringBuilder(word);
             sb.reverse();
            reverseword=sb.toString()+" ";
            System.out.print(reverseword);
        }


        for (String  word1 : eachword){
            for (int i =word1.length()-1; i>=0;i--){
                reverseword1=reverseword1+word1.charAt(i);
                System.out.print(reverseword1);
            }

        }

    }



}
