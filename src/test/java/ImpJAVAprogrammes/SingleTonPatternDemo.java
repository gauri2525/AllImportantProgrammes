package ImpJAVAprogrammes;

public class SingleTonPatternDemo {

    public static void main(String[] args) {

        SingleTon  Obj1 =SingleTon.getInstance();
        Obj1.showMessage();

    }
}
