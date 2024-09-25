package CollectionFrameworkPractise;

import java.util.ArrayList;

public class CustomArrayList {

    public void add() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(78);
        list.add(56);
        list.add(14);
        list.add(36);
        list.add(34);
        list.add(56);
        list.add(23);
        System.out.println(list);
}
   public void remove() {
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.remove(1);

       System.out.println(list);
   }
   public void printAllElement() {
       for (int i = 0; i <= 20; i++) {
           System.out.println(i);
       }
   }

}