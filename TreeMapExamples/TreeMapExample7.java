package CollectionFrameworkPractise.TreeMapExamples;

import java.util.*;

// Java program to get the portion of a map whose keys range from a given key to another key.
public class TreeMapExample7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> s1 = new TreeMap<Integer, String>();
        SortedMap<Integer, String> s2 = new TreeMap<Integer, String>();
        s1.put(10,"white");
        s1.put(20,"black");
        s1.put(30,"pink");
        s1.put(40,"purple");
        s1.put(50,"red");
        s1.put(60,"green");
        s1.put(70,"yellow");
        System.out.println("original tree map contains:"+s1);
    // s2=s1.subMap(10 ,20);
        s2=s1.subMap(10,true,30,true);
        System.out.println("sub tree is:"+s2);
    }
}