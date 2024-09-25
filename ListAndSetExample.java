package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*

public class ListAndSetExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add("java4");
        list.add("java3");
        System.out.println(list);
        list.add("java5");
        list.add("java6");
        list.remove("java2");
        System.out.println(list);


        Set<String> set = new HashSet<>();
        set.add("java9");
        set.add("java10");
        System.out.println(set);
        set.remove("java9");
        System.out.println(set);

    }
}
*/
public class ListAndSetExample {
    public static void main(String[] args) {
        //list allows duplicate elements
        //list maintain insertion order

        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        System.out.println("using list:"+list);

        //set allows only unique elements ,set does not allows dupliacate elememts
        //set doesnot maintain insertion order

        Set<Integer> set=new HashSet<>();
        set.add(100);
        set.add(200);
        set.add(100);
        set.add(200);
        set.add(100);
        set.add(200);

        System.out.println("using set:"+set);
    }
}