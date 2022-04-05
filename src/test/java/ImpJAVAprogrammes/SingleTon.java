package ImpJAVAprogrammes;

public class SingleTon {

    /*Singleton pattern means the class that has only one instance/object
    and provides global  point of access to it.*/

    /*Advantage: Saves memory because object is not created at each request.
    Only single instance is reused again and again.*/

    /*Singleton need to have:
    1.private static class member
    2.private constructor
    3.Static factory method*/

    //Early, instance will be created at load time
    private static SingleTon obj = new SingleTon();


    /*crating private constructor, it will prevent to instantiate the class
    from outside the class.*/
    private SingleTon(){

    }

    public static SingleTon getInstance(){
        return obj;
    }

    public void showMessage(){
        System.out.println("Hello Word");
    }

}
