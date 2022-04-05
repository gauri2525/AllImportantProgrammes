package ImpJAVAprogrammes;

import java.util.Comparator;

public class ClassA implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
         String Obj1=(String) o1; // typecasting object into string type
         String Obj2=(String) o2;
        //return (Obj2.compareTo(Obj1));
        return +1;
    }
}
