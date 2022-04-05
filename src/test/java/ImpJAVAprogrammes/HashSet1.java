package ImpJAVAprogrammes;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static  void main(String[] args) {

          HashSet<Object> hs=new HashSet<>();
          hs.add("Supriya");
          hs.add("sups");
          hs.add(134.55);
          hs.add("Supriya");   //Duplicate object won't get inserted

        //retriving objects using each-loop and iterator() method
        for (Object temp:hs){
            System.out.println(temp);
        }

         Iterator itr= hs.iterator();
        while (itr.hasNext()){

            Object obj= itr.next();
            System.out.println(obj);
        }

    }
}
