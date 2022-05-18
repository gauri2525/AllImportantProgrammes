package ImpJAVAprogrammes;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int Array1[]= new int[3];

        int [] Array2= new int[5];

         Array1[0]= 10;
         Array1[1]= 40;
         Array1[2]= 05;

         Array2[0]=100;
         Array2[1]=200;
         Array2[2]=400;
         Array2[3]=50;
         Array2[4]=150;

        Arrays.sort(Array1);
        Arrays.sort(Array2);

         int Array1_length=Array1.length;
         int Array2_length=Array2.length;

         //calculate length of the merging Array
         int Array3[]=new int[Array1_length+Array2_length];

         for (int i=0;i<Array1_length;i++){
             Array3[i]=Array1[i];
         }

        for (int i=0;i<Array2_length;i++){
            Array3[Array1_length+i]=Array2[i];
        }

        //Print values of the merging Array
        for (int i=0;i<Array3.length;i++){
            System.out.print(Array3[i]+" ");
        }




    }
}
