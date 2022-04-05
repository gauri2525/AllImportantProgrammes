package TestNgDemo;

public class Test {

    public static void main(String[] args) {
        int num=10;
        int count = 0;

        for (int i=1;i<=num;i++) {
            if (num % i == 0){
                count++;
            }

        }
            if(count==2){
                System.out.print("given number is prime " +num);
            }
            else{
                System.out.print("given number is not prime");
            }


        }



    }

