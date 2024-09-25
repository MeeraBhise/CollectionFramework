package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.List;

public class LoopsInCollection {
    //enhanced loop
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        //Using for loop
       for(int i=0;i<list.size();i++)
       {
           System.out.println("using for loop :"+list.get(i));
       }
       //Enhanced For loop
        for(Integer a:list)
        {
            System.out.println("using enhanced for loop:"+ a);
        }
        List<String> list1=new ArrayList<>();
        list1.add("java");
        list1.add("python");
        list1.add("c");
        list1.add("c++");
        list1.add("c#");
        list1.add("sql");

        for(String ss: list1)
        {
            System.out.println("using enhanced for loop :"+ss);
        }
    }
}
