package ImpJAVAprogrammes;
import java.util.*;

public class ArrayList1
{
    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        // adding objects into Array list
        list.add("xyz");
        list.add("test");
        list.add(123);
        list.add(45.45);
        list.add("re re");
        list.add("xyz");
        list.add("45.45");
        list.add("xyz");
        list.add(null);

        //retriving value from list
        Object obj=list.get(1);
        Object obj1=list.get(3);

        System.out.println(obj);
        System.out.println(list);

        //removing objects from the list using index or object itself
        list.remove("xyz");
        list.remove(4);
        //retriving values from the list after list alteration

        for (Object temp:list){
            System.out.println(temp);
        }

        //creating Arraylist for String type Objects
        ArrayList<String> list1=new ArrayList<String>();

        //Adding string type objects into Arraylist
        list1.add("Gauri");
        list1.add("Supriya");
        list1.add("Gauri");
        list1.add("Supriya");
        list1.add("123");

        //Update existing object of the list
        list1.set(1,"Minar");
        list1.indexOf("Gauri");
        list1.lastIndexOf("Gauri");

        //Sort the list in ascending order using collections class's sort method
        Collections.sort(list1);

        //Print list1
        System.out.println(list1);

        //will interate and retive the object using intertor() method of Iterator interface
        Iterator<String> itr =list1.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());


        }

        // creating new list for int type objects
        ArrayList<Integer> list2=new ArrayList();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(222);

        ListIterator litr=list2.listIterator();
        litr.next();
        litr.next();
        litr.next();
        litr.next();

        while(litr.hasPrevious()){
            System.out.println(litr.previous());

        }










    }






}
