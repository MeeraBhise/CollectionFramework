package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PractiseExample {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        List<String> list=new ArrayList<>();
        list.add("mehar");
        list.add("rmm");
        list.add("java");
        list.add("abcd");
        Collections.sort(list);
        System.out.println(list);
    }
}
