package CollectionFrameworkPractise;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("java");
        l1.add("java1");
        l1.add("java2");
        l1.add("java3");
        l1.add("java4");
        l1.add("java5");
        l1.add("java6");
        //    System.out.println(l1);
//        l1.add(2 ,"java3");
        //  System.out.println(l1);
        l1.remove("java1");
        System.out.println("list elements:" + l1);
        l1.remove(0);
        l1.removeFirst();
        l1.removeLast();
        l1.removeFirstOccurrence("java4");
        l1.addLast("mehar");
        l1.addFirst("meera");
        l1.addAll(2, Collections.singleton("ranjeet"));
        //   System.out.println("size of linked list:"+l1.size());
        // System.out.println(l1);
        Object[] a = l1.toArray();
        System.out.print("After converted LinkedList to practiseprograms.Array: ");
        for(Object element : a)
            System.out.print(element+" ");
      /*  for (Object l : a) {
            System.out.println("array elements:" + l);
        }*/

   /*     Object[] a=l1.toArray();
        for(Object element: a)
        {
            System.out.println(element);
        }*/
        //ietrating linked list using for loop
       /* for(int i=0;i<l1.size();i++)
        {
           // System.out.println(l1);
        }
        System.out.println(l1);*/
        // iterate the linked list using enhaced for loop
     /*   for(String s1:l1)
        {
            System.out.println(s1);
        }*/
        // System.out.println(l1);
    }
}