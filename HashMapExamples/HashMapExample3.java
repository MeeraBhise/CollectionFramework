package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args) {
        HashMap<Integer,String>s1=new HashMap<>();
        s1.put(1,"ngf");
        s1.put(2,"dfsd");
        s1.clear();
       boolean s = s1.isEmpty();
        System.out.println(s);
    }
}
