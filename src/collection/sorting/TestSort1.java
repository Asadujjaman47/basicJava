package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
    public static void main(String args[]){

        ArrayList<String> al =new ArrayList<>();
        al.add("rtx");
        al.add("xt");
        al.add("ti");
        al.add("gtx");

        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
