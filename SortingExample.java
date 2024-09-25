package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,21,32};
 String[] string={"c","n","w","r"};

 List<String> list=  new ArrayList<>();
 list.add("java");
         list.add("python");
        list.add("java1");
        list.add("python1");
        list.add("java2");
        list.add("python2");
        list.add("java3");
        list.add("python3");
        System.out.println("before sorting:"+list);
        Collections.sort(list);
        System.out.println("after sorting:"+list);
    }
}
