package ImpJAVAprogrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {
    public static void main(String[] args) {

        //Creating two Arraylists
        ArrayList<String> list= new ArrayList<>(Arrays.asList("JAVA","Selenium","Ruby","Perl","Python"));
        ArrayList<String> list1= new ArrayList<>(Arrays.asList("JAVA","Selenium","Ruby","Perl","C#"));
        ArrayList<String> list2= new ArrayList<>(Arrays.asList("JAVA","Selenium","Ruby","Perl","Python"));
        ArrayList<String> list3= new ArrayList<>(Arrays.asList("A","B","C","D","E","O"));
        ArrayList<String> list4= new ArrayList<>(Arrays.asList("A","B","C","D","E","F"));
        ArrayList<String> list5= new ArrayList<>(Arrays.asList("A","B","C","D","E","T"));
        //Sorting two Arraylists before comparison
        Collections.sort(list);
        Collections.sort(list1);
        Collections.sort(list2);

        //Comparing two sorted Arraylists
        if (list.equals(list1)){

            System.out.println("Two arraylists are equal");
        }
        else{
            System.out.println("Two arraylists are not equal");
        }

        if (list.equals(list2)){

            System.out.println("Two arraylists are equal");
        }
        else{
            System.out.println("Two arraylists are not equal");
        }

        //compare two arraylist list3 & list4 and find out additional element in list3
        list3.removeAll(list4);
        System.out.println(list3);


        //compare two arraylist list4 & list5 and find out additional element in list4
        list4.removeAll(list5);
        System.out.println(list4);

        //

     }

}
