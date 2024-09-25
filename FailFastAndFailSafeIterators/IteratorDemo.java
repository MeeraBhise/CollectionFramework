package CollectionFrameworkPractise.FailFastAndFailSafeIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("meera");
        l.add("meera1");
        l.add("meera2");
        l.add("meera3");
    Iterator itr =l.iterator();
    while( itr.hasNext())
    {
        System.out.println(itr.next());
    }
    }
}
