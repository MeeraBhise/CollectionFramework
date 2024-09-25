package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;

//Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
public class TreeMapExample4 {
    public static void main(String[] args) {
        TreeMap<Integer,String>s1=new TreeMap<>();
        s1.put(10,"mehar");
        s1.put(20,"meera");
        s1.put(50,"shiv");
        s1.put(40,"deepak");
       // System.out.println(s1);
        System.out.println("key is greater than or equal to 20"   +  "  " + s1.ceilingKey(20));
        System.out.println("key is greater than or equal to  30"  +  "  " +s1.ceilingKey(30));
        System.out.println("key is  greater than or equal to 10 " + "  " +s1.ceilingKey(10));
    }
}
