package ImpJAVAprogrammes;

import java.util.Arrays;

public class PrimeNumberRange {

    public static void main(String[] args) {

        int i,j , count =0;

        for (i=2; i<=25 ;i++){

            for(j=1;j<=i;j++) {
                if (i % j == 0)
                    count++;
            }
                if (count==2)
                System.out.println(" "+i);
                count =0;

            }


        }
    }


