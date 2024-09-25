package CollectionFrameworkPractise.Collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {

        //compare elements in collection
        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(39);
        l.add(90);
        //
        int minimum= Collections.min(l);
        //
       int maximum=Collections.max(l);
        if(minimum==maximum)
        {
            System.out.println("the values are equels");
        }
else{
            System.out.println("values are mimumum:"+minimum);
            System.out.println("values are maximum:"+maximum);
        }
    }
}