package ImpJAVAprogrammes;

public class fibonacciseries {

    public static void main(String[] args) {

        int num1=0 , num2=1;
        int sum=0;

        for (int i=2;i<=10;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;

        }
        System.out.println(sum);

    }
}
