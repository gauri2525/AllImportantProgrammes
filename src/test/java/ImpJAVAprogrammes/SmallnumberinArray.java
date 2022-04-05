package ImpJAVAprogrammes;

public class SmallnumberinArray {

    public static int getSmallest(int a[]) {

        int ArraySize = a.length;
        int temp = 0;
        for (int i = 0; i <= ArraySize; i++) {
            for (int j = i + 1; j <= ArraySize; j++) {
                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
            return a[0];


        }

        public static void main(String args[]){


        }

}