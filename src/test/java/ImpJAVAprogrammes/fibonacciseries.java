package ImpJAVAprogrammes;

public class fibonacciseries {

    public static void main(String[] args) {

/*       Fibonacci series means series of the numbers in which each number is
        the sum of the two preceeding number.*/

        //find Fibonacci series upto 10

        int num1=0 , num2=1;
        int sum=0;

        System.out.print(num1 +" "+num2);

        for (int i=3;i<=10;i++){
            sum=num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;

        }


    }
}
