package ImpJAVAprogrammes;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int Array[] = {5, 7, 9, 10, 190};
        String Array1[] = {"Test", "QA", "Platform"};

        //reversing int array values
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + ",");
        }

        //reversing string array values
        for (int i = Array1.length - 1; i >= 0; i--) {
            System.out.print(Array1[i] + ",");
        }
    }
}



















