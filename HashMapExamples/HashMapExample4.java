package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample4 {
    public static void main(String[] args) {
     HashMap<Integer,String> s1=new HashMap<>();
     s1.put(1,"fdv");
     s1.put(2,"gfn");
     s1.put(3,"bvb");
    System.out.println("original hashmap :"+ s1);
      System.out.println(s1.values());
    }
}
