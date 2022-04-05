package ImpJAVAprogrammes;

public class StaticBlocks
{
    //static block1 before main method
    static{
        System.out.println("static block1");
    }

    //static block2 before main method
    static{
        System.out.println("static block2");
    }

    //static block3 before main method
    static{
        System.out.println("static block3");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

    }

        //static block after main method
        static{
            System.out.println("static block4");
        }


}
