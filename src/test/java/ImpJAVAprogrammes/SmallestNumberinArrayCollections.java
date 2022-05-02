package ImpJAVAprogrammes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberinArrayCollections {

    //using collections
    public static int getSmallest(Integer a[], int total){

        //convert array into List of array
        List<Integer> list= Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(0);

        return  element;

    }

       //Using Arrays
    public static int intgetsmallest1(int a[],int total){
        Arrays.sort(a);
        int element=a[0];
        return element;

    }

    public static void main(String[] args) {
        Integer a[]={7,90,55,60};
        Integer b[]={23,10,23,44,34,34};
        int c[]={71,90,55,60};
        int d[]={23,10,23,54,34,34};

        System.out.println(getSmallest(a,3));
        System.out.println(getSmallest(b,5));

        System.out.println(intgetsmallest1(c,3));
        System.out.println(intgetsmallest1(d,5));


    }
}
