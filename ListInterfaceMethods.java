package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceMethods {
    public static void  main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println(" before adding elements size of list is: " + list.size());

        list.add(100);
        list.add(2100);
        list.add(1100);
        list.add(1010);
        list.add(1001);
        System.out.println("after adding elements size of list is:"+ list.size());
     list.remove(4);
        System.out.println(":"+list.size());
    }
}
