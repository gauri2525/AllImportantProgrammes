package ImpJAVAprogrammes;

public class finalizemethod {

    //it is deprecated in JAva 9
    public void finalize(){
        System.out.println("finalize method");
    }

    public static void main(String[] args) {

        finalizemethod fobj1= new finalizemethod();
        finalizemethod fobj2=new finalizemethod();

        fobj1=null;
        fobj2=null;

        System.gc();
    }
}
