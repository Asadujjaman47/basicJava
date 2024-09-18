package collection.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorExample {

    public static void main(String[] args)
    {
        ArrayList<String> cityNames = new ArrayList<>();

        cityNames.add("BD");
        cityNames.add("US");
        cityNames.add("UK");

        Iterator iterator = cityNames.iterator();

        System.out.println("CountyNames elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
    }
}
