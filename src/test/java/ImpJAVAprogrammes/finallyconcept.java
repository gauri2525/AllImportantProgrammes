package ImpJAVAprogrammes;

public class finallyconcept {


    public static void test1(){

        // using finally with valid exception and multiple catch blocks
        int i =10;
        try {
            int k = i / 0;
        }
        catch( ArithmeticException a){
            System.out.println("Arithmetic exception is "+ a.getMessage());

        }
        catch(Exception e){
            System.out.println("exception is "+ e.getMessage());

        }
        finally{
            System.out.println("finally code is executed with multiple catch blocks");

        }

    }

    public void test2() {
        // finally block only with try block
        try {
            System.out.println("try block executed without catch block");
        } finally {
            System.out.println("finally block executed without catch block and any exception");

        }
    }

        public void test3(){
        // finally block with invalid exception caught
            int i =10;
            try {
                int k = i / 0;
            }
            catch( NullPointerException a){
                System.out.println("exception1 is "+ a.getMessage());

            }

            finally{
                System.out.println("finally code is executed after incorrect caught exception");


            }

    }


    public static void main(String[] args) {
        test1();
        finallyconcept fc= new finallyconcept();
        fc.test2();
        fc.test3();



    }


}
