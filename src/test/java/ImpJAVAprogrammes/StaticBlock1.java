package ImpJAVAprogrammes;

public class StaticBlock1 {

    static{
        System.out.println("static block");
    }

    public static void testmethod(){
        System.out.println("testmethod");

    }
    public static void testmethod1(){
        System.out.println("testmethod1");
        testmethod();

    }

    public static final void finalmethod(){
        System.out.println("finalmethod");

    }
    public static final void finalmethod(int a ){
        System.out.println("finalmethod1" + a);

    }


    public static void main(String[] args) {
        System.out.println("main method");
        testmethod();
        StaticBlock1.testmethod();
        testmethod1();
        finalmethod();
        finalmethod(10);


    }

}
