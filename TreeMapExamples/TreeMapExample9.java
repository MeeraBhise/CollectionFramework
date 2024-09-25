package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;

public class TreeMapExample9 {
    public static void main(String[] args) {
        TreeMap<Integer,String>s1=new TreeMap<>();
        s1.put(1,"a");
        s1.put(2,"b");
        s1.put(3,"c");
        s1.put(4,"d");
        s1.put(5,"e");
        System.out.println(s1);
        //s1.clear();
        //System.out.println(s1);
        System.out.println( s1.descendingKeySet());
    }
}
