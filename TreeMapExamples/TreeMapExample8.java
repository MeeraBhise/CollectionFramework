package CollectionFrameworkPractise.TreeMapExamples;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample8 {
    public static void main(String[] args) {
        TreeMap<String,String>s1=new TreeMap<>();
        //TreeMap<Integer, String> s1 = new TreeMap<>();
        s1.put("c", "pink");
        s1.put("b", "white");
        s1.put("n", "green");
        s1.put("m", "yellow");
        s1.put("h", "blue");
      /*  s1.put(10, "pink");
        s1.put(2, "white");
        s1.put(4, "green");
        s1.put(5, "yellow");
        s1.put(6, "blue");*/
       // System.out.println(s1);
/*        Set<Integer> key = s1.keySet();
        for (Integer s : key) {
            System.out.println(s);}*/
        Set<String>s=s1.keySet();
        for(String s2:s){
            System.out.println(s2);
        }
    }
}
