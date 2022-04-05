package ImpJAVAprogrammes;

public class StaticVariableAccess
{

    int a =10;
    static int b=100;

    public static void method1(){
        System.out.println(b+b);
    }

    public void method2(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {

        method1();

    }
}
