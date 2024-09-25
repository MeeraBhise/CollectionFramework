package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;
// Java program to get a portion of a map whose keys are greater than or equal to a given key.

public class TreeMapExample6 {
    public static void main(String[] args) {
        TreeMap<Integer,String>s1=new TreeMap<Integer,String>();
        s1.put(11,"fiug");
        s1.put(12,"igojb");
        s1.put(13,"ivh");
        s1.put(14,"liht");
        s1.put(15,"ntri");
        s1.put(16,"mtknr");
        s1.put(17,"thte");
        System.out.println("original tree map contains:"+s1);
        System.out.println("after tailmap operation :"+s1.tailMap(13));
    }
}
