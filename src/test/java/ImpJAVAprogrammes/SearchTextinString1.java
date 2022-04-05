package ImpJAVAprogrammes;

import java.util.Arrays;

public class SearchTextinString1 {
    public static void main(String[] args) {

        String str=" Hi I am gauri";

        String search_text="Gauri";

        if(str.indexOf(search_text)!=-1){

            System.out.println("serach_text is present inside string");
        }
        else{
            System.out.println("serach_text is notpresent inside string");
        }


        boolean result=str.contains(search_text);
        if(result){
            System.out.println("serach_text is present inside string");

        }
        else{
            System.out.println("serach_text is notpresent inside string");
        }

    }


}
