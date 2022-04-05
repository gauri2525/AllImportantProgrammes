package ImpSeleniumProg;

import java.util.*;

public class PracticeProg {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = null;

        while (sc.hasNext()) {
            str = sc.next();
            System.out.print(str);
        }

        //adding entire string into string array
        String Array[] = str.split("\\s");
        String captilizeword = "";

        for (String word : Array) {
            String firstword = word.substring(0, 1);
            String afterfirstword = word.substring(1);
            captilizeword = firstword.toUpperCase() + afterfirstword.toLowerCase() + " ";
            System.out.print(captilizeword);
        }


    }


    }

