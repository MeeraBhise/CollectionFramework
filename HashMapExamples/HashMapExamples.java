package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer,String>s=new HashMap<>();
        s.put(101,"meera");
        s.put(101,"mehar");
        s.put(103,"mahi");
        s.put(105,"null");
        s.put(106,"null");
        System.out.println( s.get(101));
        System.out.println(s.get(106));
        System.out.println(s);
        s.put(999,"meera11");
        String s1=s.get(999);
        System.out.println(s1);

       /* System.out.println(s.get(101));
        System.out.println(s.computeIfAbsent());*/
    }
}
